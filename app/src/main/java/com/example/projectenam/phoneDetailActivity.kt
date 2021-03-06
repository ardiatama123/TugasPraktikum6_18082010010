package com.example.projectenam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

class phoneDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var partEmail = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)
            var fotomak =  intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER)
            tv_item_id.text = partName
            tv_item_name.text = partId
            tv_item_email.text = partEmail
            fotomak.toString()
        }
    }
}