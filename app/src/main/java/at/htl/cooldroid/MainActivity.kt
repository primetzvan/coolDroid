package at.htl.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  //lateinit var tv_message : TextView
  internal val LOG_TAG = MainActivity::class.java.simpleName
  var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      imageView.setOnClickListener {
          counter++
          Log.d(LOG_TAG,"onCreate(), counter; ${counter}")
          textViewDroid.text =
            when (counter) {
              1 -> getString(R.string.once)
              2 -> getString(R.string.twice)
              else -> getString(R.string.text_view_numbers, counter)
            }
        }
    }

}
