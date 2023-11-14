package com.example.ganheinamegasena

import android.content.Context
import android.widget.Toast

class SimpleToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    private var toast = Toast.makeText(context, "", duration)

    fun showToast(message: String) {
        if (message.isNotEmpty()) {
            toast.cancel()
            toast.setText(message)
            toast.show()
        }
    }
}