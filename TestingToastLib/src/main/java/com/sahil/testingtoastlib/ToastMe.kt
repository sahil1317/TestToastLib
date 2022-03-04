package com.sahil.testingtoastlib

import android.content.Context
import android.widget.Toast

class ToastMe(val context: Context) {
    private var text:String?=null


    fun text(text:String):ToastMe{
        this.text=text
        return this
    }

    fun show() {
    Toast.makeText(context,text.toString(),Toast.LENGTH_LONG).show()
    }
}