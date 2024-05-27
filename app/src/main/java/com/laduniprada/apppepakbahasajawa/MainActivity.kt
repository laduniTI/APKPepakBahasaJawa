package com.laduniprada.apppepakbahasajawa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonMulai = findViewById<Button>(R.id.buttonMulai)
        buttonMulai.setOnClickListener {
            setContentView(R.layout.menu_layout)

            setupButtonListeners()
            setupBackButtonToStart()
        }
    }

    private fun setupButtonListeners() {
        val buttonNgoko = findViewById<Button>(R.id.buttonNgoko)
        val buttonKosokBalen = findViewById<Button>(R.id.buttonKosokBalen)
        val buttonPodoTegese = findViewById<Button>(R.id.buttonPodoTegese)
        val buttonDasanama = findViewById<Button>(R.id.buttonDasanama)

        buttonNgoko.setOnClickListener {
            setContentView(R.layout.ngoko_madya)
            setupBackButtonToButtons()
        }
        buttonKosokBalen.setOnClickListener {
            setContentView(R.layout.kosok_balen)
            setupBackButtonToButtons()
        }
        buttonPodoTegese.setOnClickListener {
            setContentView(R.layout.podo_tegese)
            setupBackButtonToButtons()
        }
        buttonDasanama.setOnClickListener {
            setContentView(R.layout.dasanama)
            setupBackButtonToButtons()
        }
    }

    private fun setupBackButtonToStart() {
        val buttonBack = findViewById<ImageButton>(R.id.buttonBack)
        buttonBack?.setOnClickListener {
            setContentView(R.layout.main_activity)

            val buttonMulai = findViewById<Button>(R.id.buttonMulai)
            buttonMulai.setOnClickListener {
                setContentView(R.layout.menu_layout)

                setupButtonListeners()
                setupBackButtonToStart()
            }
        }
    }

    private fun setupBackButtonToButtons() {
        val buttonBack = findViewById<ImageButton>(R.id.buttonBack)
        buttonBack?.setOnClickListener {
            setContentView(R.layout.menu_layout)
            setupButtonListeners()
            setupBackButtonToStart()
        }
    }

}