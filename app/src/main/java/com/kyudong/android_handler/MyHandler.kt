package com.kyudong.android_handler

import android.os.Handler
import android.os.Message
import android.widget.TextView

class MyHandler(handler_txv: TextView) : Handler() {

    var txv: TextView = handler_txv

    override fun handleMessage(msg: Message) {
        when(msg.what) {
            1000 -> txv.text = "Change Text by sendMessage(1000) Button"
        }
    }
}