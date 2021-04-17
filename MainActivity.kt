package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1) //증가
        val button2 = findViewById<Button>(R.id.button2)
        val reset = findViewById<Button>(R.id.reset)//초기화
        val youtube = findViewById<Button>(R.id.youtube) //Youtube 사이트 연결 //<Activity>, <intent>, inputtype, EditText(xml) 추가 공부해야함
        val Secondpage = findViewById<Button>(R.id.Secondpage)
        val textView = findViewById<TextView>(R.id.textView) //플러스 마이너스
        val textView2 = findViewById<TextView>(R.id.textView2) //클릭횟수
        var count = 0 //증가 혹은 감소
        var click = 0 //버튼 클릭한 횟수

        button1.setOnClickListener {  //증가
            click = click + 1
            count = count + 1
            textView.text = "${count}"
            textView2.text = "클릭 횟수 : ${click}"
        }

        button2.setOnClickListener {  //감소
            click = click + 1
            count = count - 1
            textView.text = "${count}"
            textView2.text = "클릭 횟수 : ${click}"
        }

        reset.setOnClickListener {  //리셋
            click = 0
            count = 0
            textView.text = "${count}"
            textView2.text = "클릭 횟수 : ${click}"
        }

        youtube.setOnClickListener { //사이트 연결, 앱 연결
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(intent)
        }

        Secondpage.setOnClickListener {
            var intent = Intent(this, SubActivity::class.java)
            startActivity(intent)

        }
    }
}