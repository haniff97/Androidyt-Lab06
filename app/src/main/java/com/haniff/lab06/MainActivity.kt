package com.example.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener{
            binding.infotextView.text = "Android ATC 801 consists of topics ranging from" +
                    "UI Creation, App Development and Firebase"
        }

        binding.exams.setOnClickListener{
            binding.infotextView.text = "Exam consists of 45 questions in 90 minutes with passing mark of 70%"

        }

        binding.freelance.setOnClickListener{
            binding.infotextView.text = "You can be an Android Engineer upon completion on the course"
        }



    }
}