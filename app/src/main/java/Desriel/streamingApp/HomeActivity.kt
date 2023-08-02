package Desriel.streamingApp

import Desriel.kiki.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var see_category : TextView
    private lateinit var see_trending : TextView
    private lateinit var see_recomend : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?. hide()

        see_category = findViewById(R.id.see_moreCategory)
        see_category.setOnClickListener{
            startActivity(Intent(this, DetailActivity::class.java))
        }
        see_trending = findViewById(R.id.see_moreTrending)
        see_trending.setOnClickListener{
            startActivity(Intent(this, DetailActivity::class.java))
        }
        see_recomend = findViewById(R.id.see_moreRecomended)
        see_recomend.setOnClickListener{
            startActivity(Intent(this, DetailActivity::class.java))
        }


    }
}