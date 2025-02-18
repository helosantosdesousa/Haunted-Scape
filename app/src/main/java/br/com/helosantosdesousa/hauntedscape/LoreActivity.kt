package br.com.helosantosdesousa.hauntedscape

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lore)
        val layout = findViewById<View>(R.id.main_layout)

        layout.setOnClickListener{
            val intent = Intent(this@LoreActivity, GameActivity::class.java)
            startActivity(intent)

        }
    }
}