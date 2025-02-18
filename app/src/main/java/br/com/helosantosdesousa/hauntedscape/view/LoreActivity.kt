package br.com.helosantosdesousa.hauntedscape.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.com.helosantosdesousa.hauntedscape.R
import com.google.androidgamesdk.GameActivity

class LoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lore)
        val layout = findViewById<View>(R.id.main_layout)

        layout.setOnClickListener{
            val intent = Intent(this, br.com.helosantosdesousa.hauntedscape.view.GameActivity::class.java)
            startActivity(intent)

            println("mudei de tela")

        }
    }
}