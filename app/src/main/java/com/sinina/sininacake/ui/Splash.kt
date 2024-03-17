package com.sinina.sininacake.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.sinina.sininacake.R
import com.sinina.sininacake.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
     val binding:ActivitySplashBinding by lazy { ActivitySplashBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        인트로 헨들러를 이용하여 스플래시 화면 ms를 이용하여 1.5 초 뒤에 로그인 Activity 로 화면전환 하게끔 설정
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity( Intent(this, LoginActivity::class.java) )
            finish()
        },1500)


    }
}