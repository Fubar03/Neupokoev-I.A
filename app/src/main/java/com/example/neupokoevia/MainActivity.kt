package com.example.neupokoevia

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.neupokoevia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val colors = listOf(
        "#FFC0CB", // розовый
        "#ADD8E6", // голубой
        "#90EE90"  // светло-зеленый
    )

    private var currentColorIndex = 0

    private val numbers = (4..24 step 4).toList()
    private var currentNumberIndex = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val colorSquare: View = findViewById(R.id.colorSquare)
        //val changeColorButton: Button = findViewById(R.id.changeColorButton)
        //val numberEditText = findViewById<EditText>(R.id.numberEditText)
        //val changeNumberButton = findViewById<Button>(R.id.changeNumberButton)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeColorButton.setBackgroundColor(Color.parseColor("#000000"))
        binding.changeNumberButton.setBackgroundColor(Color.parseColor("#FF0000"))

        binding.changeColorButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            binding.colorSquare.setBackgroundColor(Color.parseColor(colors[currentColorIndex]))
        }

        binding.changeNumberButton.setOnClickListener {
            currentNumberIndex = (currentNumberIndex + 1) % numbers.size
            binding.numberEditText.setText(numbers[currentNumberIndex].toString())
        }
    }
}