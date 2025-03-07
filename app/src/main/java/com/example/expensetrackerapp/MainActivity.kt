package com.example.expensetrackerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
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


        //Gets the id of the recycler view
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)
        // This creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        val expenseData = ArrayList<Expense>()


        expenseData.add(Expense("Dogdog",1.23))
        expenseData.add(Expense("Dog",1.43))
        expenseData.add(Expense("Dgdog",1.53))

        //Sets up and links the adapter
        val adapter = Adapter(expenseData)
        recyclerview.adapter = adapter







        // Get references to UI elements
        val expenseNameInput = findViewById<EditText>(R.id.expenseInput)
        val amountInput = findViewById<EditText>(R.id.amountInput)
        val submitButton = findViewById<Button>(R.id.addExpenseButton)


        // Handle button Click
        submitButton.setOnClickListener{
            val expenseName = expenseNameInput.text.toString().trim()
            val amount = amountInput.text.toString().trim()

            if(expenseName.isEmpty() || amount.isEmpty()){
                Toast.makeText(this,"Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else{
                val message = "Expense Name: $expenseName\namount: $amount"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                val expense =  Expense(expenseName,amount.toDouble())
                expenseData.add(expense)
                //Tells adapter of new item added
                adapter.notifyItemInserted(expenseData.size - 1)

//                expenseNameInput.text.clear()
//                amountInput.text.clear()



            }

        }













    }



    }




//
//        expenseData.add(Expense("Dogdog",1.23))
//        expenseData.add(Expense("Dog",1.43))
//        expenseData.add(Expense("Dgdog",1.53))
