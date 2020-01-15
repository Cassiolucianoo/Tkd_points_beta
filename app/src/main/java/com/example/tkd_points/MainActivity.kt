package com.example.tkd_points
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var pontuacaoVermelho: Int = 0
    private var pontuacaoAzul: Int = 0

    private lateinit var pVermelho: TextView
    private lateinit var pAzul: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        
        pVermelho = findViewById(R.id.placarVermelho)
        pAzul = findViewById(R.id.placarAzul)


        val bTresPontosVermelho: Button = findViewById(R.id.tresPontosVermelho)
        val bDoisPontosVermelho: Button = findViewById(R.id.doisPontosVermelho)
        val bTMenosUmPontoVermelho: Button = findViewById(R.id.menosUmPontoVermelho)
        val bTresPontosAzul: Button = findViewById(R.id.tresPontosAzul)
        val bDoisPontosAzul: Button = findViewById(R.id.doisPontosAzul)
        val bTMenosUmPonto: Button = findViewById(R.id.MenosUmPontoAzul)
        val bReiniciar: Button = findViewById(R.id.reiniciarPartida)


        bTresPontosVermelho.setOnClickListener { adicionarPontos(3, "Vermelho") }

        bDoisPontosVermelho.setOnClickListener { adicionarPontos(2, "Vermelho") }

        bTMenosUmPontoVermelho.setOnClickListener { tirarpontos("Vermelho") }


        bTresPontosAzul.setOnClickListener { adicionarPontos(3, "Azul") }

        bDoisPontosAzul.setOnClickListener { adicionarPontos(2, "Azul") }

        bTMenosUmPonto.setOnClickListener { tirarpontos( "Azul") }

        bReiniciar.setOnClickListener { reiniciarPartida() }

    }

    fun tirarpontos(time: String) {

        if (time == "Vermelho") {

            if(pVermelho.text == "0") {

            }else{
                pontuacaoVermelho -= 1
                Toast.makeText(this, " -1", Toast.LENGTH_SHORT).show()
            }
        } else {

            if(pAzul.text == "0") {

            }else {
                pontuacaoAzul -= 1
                Toast.makeText(this, " -1", Toast.LENGTH_SHORT).show()
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
        Toast.makeText(this, "Placar reiniciado", Toast.LENGTH_SHORT).show()

    }
}
