package com.github.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_done).setOnClickListener {
            addNickName(it)
        }

        findViewById<TextView>(R.id.txt_name).setOnClickListener {
            updateNickName(it)
        }
    }

    private fun addNickName(view: View) {

        val edtNickName = findViewById<EditText>(R.id.edt_nick_name)
        val txtName = findViewById<TextView>(R.id.txt_name)

        txtName.text = edtNickName.text
        edtNickName.visibility = View.GONE
        view.visibility = View.GONE
        txtName.visibility = View.VISIBLE

        hideKeyBoard(view)

    }

    private fun updateNickName(view: View) {

        val edtNickName = findViewById<EditText>(R.id.edt_nick_name)
        val txtName = findViewById<TextView>(R.id.txt_name)

        edtNickName.visibility = View.VISIBLE
        btn_done.visibility = View.VISIBLE
        txtName.visibility = View.GONE

        hideKeyBoard(view)
    }

    private fun hideKeyBoard(view: View) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

}
