package br.com.helosantosdesousa.hauntedscape.view


import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.com.helosantosdesousa.hauntedscape.R
import br.com.helosantosdesousa.hauntedscape.control.MoveController
import br.com.helosantosdesousa.hauntedscape.control.PlayerController
import br.com.helosantosdesousa.hauntedscape.model.bean.Enemy
import br.com.helosantosdesousa.hauntedscape.model.bean.Game
import br.com.helosantosdesousa.hauntedscape.model.bean.Move
import br.com.helosantosdesousa.hauntedscape.model.bean.Player

class GameActivity : AppCompatActivity() {
    private lateinit var moveC: MoveController
    private lateinit var enemy: Enemy
    private lateinit var player: Player
    private lateinit var game: Game
    private lateinit var move: Move

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)

        moveC = MoveController()
        enemy = Enemy()
        player = Player()
        game = Game(player)
        move = Move()

        moveC.generateEnemyRoom(enemy, player)
        moveC.startGame(player, game)

        chooseRoom()
    }

    fun chooseRoom() {
        val buttons = listOf(
            R.id.room1, R.id.room2, R.id.room3, R.id.room4,
            R.id.room5, R.id.room6, R.id.room7, R.id.room8, R.id.room9
        )
        buttons.forEachIndexed { index, buttonId ->
            val button: Button? = findViewById(buttonId)
            button?.setOnClickListener {
                player.room = index + 1
                println("Escolheu a sala: ${player.room}")

                moveC.checkPosition(player, enemy, move)

                if (move.endGame) {
                    button.isEnabled = false
                }
            }
        }

    }


}

