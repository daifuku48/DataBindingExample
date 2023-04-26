package com.haritonovdanyluaa.databindingexample

import android.content.Context
import android.view.View
import android.widget.Toast

class ButtonHandler(var context: Context) {

    fun okClick(view: View)
    {
        Toast.makeText(context,"ok", Toast.LENGTH_LONG).show()
    }

    fun cancelClick(view: View)
    {
        Toast.makeText(context, "cancel", Toast.LENGTH_LONG).show()
    }

}