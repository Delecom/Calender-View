package com.example.calenderview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    lateinit var calendarView: CalendarView
    lateinit var dateView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            title = "Kotlin"
            calendarView = findViewById(R.id.calendarView)
            dateView = findViewById(R.id.textView)
            calendarView.setOnDateChangeListener(CalendarView.OnDateChangeListener { calendarView, i, i2, i3 -> } { year, month, dayOfMonth −>
                val date = dayOfMonth.toString() + "−" + (month + 1) + "−" + year
                dateView.text = date
            }   )
    }
}
