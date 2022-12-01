package hr.ferit.brunobasic.orwma_lv5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ime=findViewById<TextView>(R.id.ime)
        val opis=findViewById<TextView>(R.id.opis)
        val imeInput=findViewById<EditText>(R.id.newIme)
        val opisInput=findViewById<EditText>(R.id.newOpis)
        val Unesi: Button =findViewById<Button>(R.id.unesi)
        val visinaInput=findViewById<EditText>(R.id.newVisina)
        val tezinaInput=findViewById<EditText>(R.id.newTezina)
        val Izracunaj: Button =findViewById<Button>(R.id.izracunaj)

        Unesi.setOnClickListener{
            ime.text=imeInput.text
            opis.text=opisInput.text
        }
        Izracunaj.setOnClickListener{
            val bmi=BMICalculator(visinaInput.text.toString().toFloat(),tezinaInput.text.toString().toFloat()).toString()
                Toast.makeText(this,bmi,Toast.LENGTH_LONG).show()
        }
    }
    private fun BMICalculator(visina:Float,tezina:Float):Float{
        return (tezina/((visina/100)*(visina/100)))
    }
}