package com.sinina.sininacake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinina.sininacake.R
import com.sinina.sininacake.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    val binding : ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.googleLoginBtn.setOnClickListener{
            startActivity(Intent(this,OrderDetailActivity::class.java))
        }
    }


}