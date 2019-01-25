package com.marcosholgado.multiselection

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sum.*

class SumActivity : AppCompatActivity() {

    private lateinit var list: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        list = intent.getIntegerArrayListExtra(LIST)
        sum.text = list.sum().toString()
    }

    companion object {
        const val LIST = "list"

        fun launch(context: Context, list: ArrayList<Int>) {
            val intent = Intent(context, SumActivity::class.java)
            intent.putIntegerArrayListExtra(LIST, list)
            context.startActivity(intent)
        }
    }
}
