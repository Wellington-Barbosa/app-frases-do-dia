package com.wellington_barbosa.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "A persistência é o caminho do êxito.",
        "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
        "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
        "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
        "No meio da dificuldade encontra-se a oportunidade.",
        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
        "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.txtFrase)
    }

    fun gerarFrase(view: View) {
        val totalItensArray = frases.size
        val numRamdom = Random().nextInt(totalItensArray)

        texto.setText(frases[numRamdom])
    }

}