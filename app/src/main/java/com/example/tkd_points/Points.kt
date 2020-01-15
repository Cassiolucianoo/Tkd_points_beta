package com.example.tkd_points

import android.widget.TextView



class Points {
    private var pontuacaoVermelho: Int = 0
    private var pontuacaoAzul: Int = 0

     lateinit var pVermelho: TextView
     lateinit var pAzul: TextView




    fun tirarpontos(time: String) {



        if (time == "Vermelho") {

            if(pVermelho.text == "0") {

            }else{
                pontuacaoVermelho -= 1

            }

        } else {


            if(pAzul.text == "0") {

            }else {
                pontuacaoAzul -= 1
            }
        }
        atualizaPlacar(time)
    }


    fun adicionarPontos(pontos: Int, time: String) {
        if (time == "Vermelho") {
            pontuacaoVermelho += pontos


        } else {
            pontuacaoAzul += pontos

        }

        atualizaPlacar(time)
    }

    fun atualizaPlacar(time: String) {

        if (time == "Vermelho") {
            pVermelho.setText(pontuacaoVermelho.toString())


        } else {
            pAzul.setText(pontuacaoAzul.toString())
        }
    }

    fun reiniciarPartida() {
        pontuacaoVermelho = 0
        pVermelho.setText(pontuacaoVermelho.toString())
        pontuacaoAzul = 0
        pAzul.setText(pontuacaoAzul.toString())



    }


}