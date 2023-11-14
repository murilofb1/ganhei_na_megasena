package com.example.ganheinamegasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.ganheinamegasena.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding
    private lateinit var toast: SimpleToast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        toast = SimpleToast(this, Toast.LENGTH_LONG)

        bind.btnGenerate.setOnClickListener {
            generateNumbers(bind.editNumber.text.toString(), bind.txtResult)
        }
    }

    private fun generateNumbers(qtdStr: String, result: TextView) {
        if (qtdStr.isNotEmpty()) {
            val qtdNum = qtdStr.toInt()

            if (qtdNum in 6..15) {
                result.text = getNumbersSet(qtdNum).joinToString(" - ")
            } else {
                toast.showToast(getString(R.string.numero_entre_6_e_15))
            }

        } else {
            toast.showToast(getString(R.string.nao_pode_ficar_vazio))
        }
    }

    private fun getNumbersSet(size: Int): MutableSet<Int> {
        val numberSet = mutableSetOf<Int>()
        while (true) {
            val number = Random.nextInt(60)
            numberSet.add(number + 1)
            if (numberSet.size == size) break
        }
        return numberSet
    }
}