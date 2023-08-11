package com.miempresa.ejerciciocontroles2v4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun sumar (num1:Double,num2:Double):Double{
        return num1 + num2
    }
    fun restar (num1:Double,num2:Double):Double{
        return num1 - num2
    }
    fun producto (num1:Double,num2:Double):Double{
        return num1 * num2
    }
    fun division (num1:Double,num2:Double):Double{
        return num1 / num2
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioSuma.setOnClickListener(){
            var numero1 = txtValor1.text.toString().toDouble()
            var numero2 = txtValor2.text.toString().toDouble()
            var respuesta = (sumar(numero1,numero2)).toString()
            txtResultado.setText(respuesta)
        }
        radioResta.setOnClickListener(){
            var numero1 = txtValor1.text.toString().toDouble()
            var numero2 = txtValor2.text.toString().toDouble()
            var respuesta = (restar(numero1,numero2)).toString()
            txtResultado.setText(respuesta)
        }
        radioProducto.setOnClickListener(){
            var numero1 = txtValor1.text.toString().toDouble()
            var numero2 = txtValor2.text.toString().toDouble()
            var respuesta = (producto(numero1,numero2)).toString()
            txtResultado.setText(respuesta)
        }
        radioDivision.setOnClickListener(){
            var numero1 = txtValor1.text.toString().toDouble()
            var numero2 = txtValor2.text.toString().toDouble()

           if(numero2==0.0){
                txtResultado.setText("Error en la división")
                Toast.makeText(this,"ERROR EN EL SEGUNDO VALOR",Toast.LENGTH_LONG).show()
            }else{
                var respuesta = (division(numero1,numero2)).toString()
                txtResultado.setText(respuesta)
            }
        }


    }
}