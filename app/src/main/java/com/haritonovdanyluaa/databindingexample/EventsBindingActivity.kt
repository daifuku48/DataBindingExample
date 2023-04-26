package com.haritonovdanyluaa.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.haritonovdanyluaa.databindingexample.databinding.ActivityEventsBindingBinding

class EventsBindingActivity : AppCompatActivity() {

    var binding : ActivityEventsBindingBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_binding)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_events_binding)
        val buttonHandler = ButtonHandler(this)
        binding?.button = buttonHandler
    }
}