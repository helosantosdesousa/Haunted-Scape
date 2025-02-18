package br.com.helosantosdesousa.hauntedscape.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.com.helosantosdesousa.hauntedscape.R

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