package br.com.helosantosdesousa.hauntedscape

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonRules = findViewById<Button>(R.id.bt_rules)
        buttonRules.setOnClickListener {
            val intent = Intent(this, RulesActivity::class.java)
            startActivity(intent)
        }

        val buttonPlay = findViewById<View>(R.id.bt_play)
        buttonPlay.setOnClickListener{
            val intent = Intent(this, LoreActivity::class.java )
            startActivity(intent)
        }
    }
}