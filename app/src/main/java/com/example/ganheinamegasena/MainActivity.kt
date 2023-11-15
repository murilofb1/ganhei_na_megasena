package com.example.ganheinamegasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.ganheinamegasena.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var pref: NumbersPref
    private lateinit var bind: ActivityMainBinding
    private lateinit var toast: SimpleToast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        toast = SimpleToast(this, Toast.LENGTH_LONG)

        pref = NumbersPref(this)
        if (pref.getLastNumbers() != null) {
            bind.txtResult.text = pref.getLastNumbers()
        }

        bind.btnGenerate.setOnClickListener {
            generateNumbers(bind.editNumber.text.toString(), bind.txtResult)
        }
    }

    private fun generateNumbers(qtdStr: String, result: TextView) {
        if (qtdStr.isEmpty()) {
            toast.showToast(getString(R.string.nao_pode_ficar_vazio))
            return
        }

        val qtdNum = qtdStr.toInt()

        if (qtdNum < 6 || qtdNum > 15) {
            toast.showToast(getString(R.string.numero_entre_6_e_15))
            return
        }
        val resultStr = getNumbersSet(qtdNum).joinToString(" - ")
        result.text = resultStr
        pref.putLastNumbers(resultStr)
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