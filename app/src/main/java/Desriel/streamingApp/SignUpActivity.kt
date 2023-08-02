package Desriel.streamingApp

import Desriel.kiki.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {

    private lateinit var buttonSkip: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        supportActionBar?. hide()

        buttonSkip = findViewById(R.id.btn_skip)
        buttonSkip.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}