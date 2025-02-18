package br.com.helosantosdesousa.hauntedscape.control

import br.com.helosantosdesousa.hauntedscape.model.bean.Enemy
import br.com.helosantosdesousa.hauntedscape.model.bean.Game
import br.com.helosantosdesousa.hauntedscape.model.bean.Move
import br.com.helosantosdesousa.hauntedscape.model.bean.Player
import kotlin.random.Random

class MoveController {

    fun generateEnemyRoom(enemy: Enemy, player: Player) {
        do {
            enemy.currentRoom = Random.nextInt(1, 10)
        } while (enemy.currentRoom == player.room) // Evita monstro na mesma sala inicial

        println("O monstro está na sala ${enemy.currentRoom}")
    }

    fun startGame(player: Player, game: Game) {
        game.maxMoves = 12
        player.remainingMoves = game.maxMoves
    }

    fun checkPosition(player: Player, enemy: Enemy, move: Move) {
        if (player.room == enemy.currentRoom) {
            println("⚠️ O monstro te pegou! Fim de jogo! ⚠️")
            move.endGame = true
        } else if (player.remainingMoves > 0) {
            println("✅ Você está seguro! Jogadas restantes: ${player.remainingMoves}")
            player.remainingMoves-- // Decrementa só quando o usuário joga
        } else {
            println("🚨 Acabaram suas jogadas! Fim de jogo! 🚨")
            move.endGame = true
        }
    }
}
