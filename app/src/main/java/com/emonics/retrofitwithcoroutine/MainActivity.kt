package com.emonics.retrofitwithcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//calling the retrofit helper class
        //we have created instant for the retrofit helper
        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
//in this we are hit the API using coroutine
        GlobalScope.launch {
            val res =quotesApi.getQuotes()// gives the resautl quotes
            Log.d("Emonics", res.body().toString())
        }
    }
}

/*

Author Name
Quote

Author Name
Quote


 */