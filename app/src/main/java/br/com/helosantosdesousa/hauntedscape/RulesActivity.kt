package br.com.helosantosdesousa.hauntedscape

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rules)

        val buttonPlay = findViewById<View>(R.id.bt_play)
        buttonPlay.setOnClickListener{
            val intent = Intent(this, LoreActivity::class.java )
            startActivity(intent)
        }
    }
}