package com.wannaphong.newdaycountdown

import android.icu.util.Calendar
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val time_show:TextView = findViewById(R.id.textView)
        // Calculate milliseconds until midnight of the next day
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_MONTH, 1)
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)
        val millisecondsUntilNewDay = calendar.timeInMillis - System.currentTimeMillis()

        // Start the countdown timer
        object : CountDownTimer(millisecondsUntilNewDay, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = formatTime(millisUntilFinished)
                time_show.text = timeLeft
            }

            override fun onFinish() {
                time_show.text = "Happy New Day!!!" //getString(R.string.new_day_start)
            }
        }.start()
    }

    private fun formatTime(millisUntilFinished: Long): String {
        val hours = (millisUntilFinished / (1000 * 60 * 60)).toInt()
        val minutes = (millisUntilFinished % (1000 * 60 * 60) / (1000 * 60)).toInt()
        val seconds = (millisUntilFinished % (1000 * 60) / 1000).toInt()
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds)
    }
}