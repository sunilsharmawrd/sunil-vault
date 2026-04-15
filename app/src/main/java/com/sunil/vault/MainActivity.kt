package com.sunil.vault

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = EditText(this)
        val pass = EditText(this)
        val btn = Button(this)
        val show = TextView(this)

        btn.text = "Save"
        show.text = "Tap to View"

        setContentView(title)
        addContentView(pass, title.layoutParams)
        addContentView(btn, title.layoutParams)
        addContentView(show, title.layoutParams)
    }
}
