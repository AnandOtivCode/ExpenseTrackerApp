package com.example.expensetrackerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // getting the recyclerview by its id




        // Get references to UI elements
        val expenseNameInput = findViewById<EditText>(R.id.expenseInput)
        val amountInput = findViewById<EditText>(R.id.amountInput)
        val submitButton = findViewById<Button>(R.id.addExpenseButton)


        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        val expenseData = ArrayList<Expense>()


        expenseData.add(Expense("Dogdog",1.23))
        expenseData.add(Expense("Dog",1.43))
        expenseData.add(Expense("Dgdog",1.53))






        //Sets up and links the adapter
        val adapter = Adapter(expenseData)
        recyclerview.adapter = adapter



    }



    }
