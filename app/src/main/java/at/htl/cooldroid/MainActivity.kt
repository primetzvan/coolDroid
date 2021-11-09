package at.htl.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  //lateinit var tv_message : TextView
  var counter = 0
  private val COUNTER = "counter"
  internal val LOG_TAG = MainActivity::class.java.simpleName


  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    if(savedInstanceState != null){
      counter = savedInstanceState.getInt(COUNTER)
    }
      imageView.setOnClickListener {
          counter++
          Log.d(LOG_TAG,"onCreate(), counter; ${counter}")
          textViewDroid.text = getMessage()
        }
    }

  private fun getMessage() =
  when (counter) {
    1 -> getString(R.string.once)
    2 -> getString(R.string.twice)
    else -> getString(R.string.text_view_numbers,counter)
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState?.putInt(COUNTER, counter)
    Log.d(LOG_TAG, "on save InstanceState(), counter $(counter)")
    super.onSaveInstanceState(outState)
  }


}
