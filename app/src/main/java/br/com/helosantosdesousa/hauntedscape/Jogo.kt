package br.com.helosantosdesousa.hauntedscape

import android.content.Context
import android.widget.Toast
import kotlin.random.Random

class Jogo {

    private val TOTAL_SALAS = 9
    private val MAX_JOGADAS = 18
    private var saida: Int = 0
    private var jogadasRestantes:Int = 0

    init {
        saida = Random.nextInt(1, TOTAL_SALAS + 1)
        jogadasRestantes = MAX_JOGADAS
    }


        fun jogar(sala: Int, context: Context){
            println(saida)
            if (jogadasRestantes > 0){
                jogadasRestantes--;
                if (sala==saida){
                    Toast.makeText(context, "Parabéns! Você venceu!", Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(context, "Sala errada", Toast.LENGTH_SHORT).show()
                    Toast.makeText(context, "Jogadas restantes: $jogadasRestantes", Toast.LENGTH_SHORT).show()
                }
            } else{
                Toast.makeText(context, "Voc~e perdeu", Toast.LENGTH_SHORT).show()
            }
        }
    }

