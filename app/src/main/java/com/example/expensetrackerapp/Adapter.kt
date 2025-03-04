package com.example.expensetrackerapp



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//  *** Used This To Make The Router : https://www.geeksforgeeks.org/android-recyclerview-in-kotlin/

class Adapter(private val list: List<Expense>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        // sets the image to the imageview from our itemHolder class
        holder.textView1.text = item.expenseName
        // sets the text to the textview from our itemHolder class
        holder.textView2.text = String.format("%.2f",item.amount) //Format the amount to two decimal places
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return list.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = itemView.findViewById(R.id.expenseName)
        val textView2: TextView = itemView.findViewById(R.id.amount)
    }
}