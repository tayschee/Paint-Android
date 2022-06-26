package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redButton = findViewById<ImageButton>(R.id.redColor)
        val blueButton = findViewById<ImageButton>(R.id.blueColor)
        val greenButton = findViewById<ImageButton>(R.id.greenColor)
        val whiteButton = findViewById<ImageButton>(R.id.whiteColor)
        val blackButton = findViewById<ImageButton>(R.id.blackColor)

        redButton.setOnClickListener{
            Toast.makeText(this, "CLicked on Red", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueButton.setOnClickListener{
            Toast.makeText(this, "CLicked on Blue", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        greenButton.setOnClickListener{
            Toast.makeText(this, "CLicked on Green", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        blackButton.setOnClickListener{
            Toast.makeText(this, "CLicked on Black", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        whiteButton.setOnClickListener{
            Toast.makeText(this, "CLicked on White", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }

}