package com.kyudong.android_handler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mHandler: MyHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mHandler = MyHandler(handler_txv)

        main_btn.setOnClickListener {
            handler_txv.text = "Change Text by Main Button"
        }

        post_btn.setOnClickListener {
            Thread(Runnable {
                mHandler.post { handler_txv.text = "Change Text by post Thread Button" }
            }).start()
        }

        message_btn.setOnClickListener {
            Thread(Runnable {
                mHandler.sendEmptyMessage(1000)
            }).start()
        }
    }
}
