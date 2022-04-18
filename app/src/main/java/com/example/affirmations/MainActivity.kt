package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pridane
        //val textView: TextView = findViewById(R.id.textview)
        //textView.text = DataSource().loadAffirmations().size.toString()

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)


    }
}

// LESSON 5 - LAYOUTS
/*
  Now that you have added string resources, you can reference them in your code as R.string.affirmation1 or R.string.affirmation2
 */

/*
There are two ways in which you can make use of packages:
    - Create different packages for different parts of your code.
        For example, developers will often separate the classes that work with data and the classes that build the UI into different packages.
    - Use code from other packages in your code.
        In order to use the classes from other packages, you need to define them in your build system's dependencies.
        It's also a standard practice to import them in your code so you can use their shortened names (eg, TextView) instead of their fully-qualified names (eg, android.widget.TextView).
        For example, you have already used import statements for classes such as sqrt (import kotlin.math.sqrt) and View (import android.view.View).
*/

/*
Here are some examples of predefined package names and their contents:
    - kotlin.math - Mathematical functions and constants.
    - android.widget - Views, such as TextView.

 */

/*
Adding a RecycleView to your app
    There are a number of pieces involved in creating and using a RecyclerView.
    You can think of them as a division of labor.

        item - One data item of the list to display. Represents one Affirmation object in your app.
        Adapter - Takes data and prepares it for RecyclerView to display.
        ViewHolders - A pool of views for RecyclerView to use and reuse to display affirmations.
        RecyclerView - Views on screen
 */

/*
    The current layout uses ConstraintLayout.
    ConstraintLayout is ideal and flexible when you want to position multiple child views in a layout.
    Since your layout only has a single child view, RecyclerView, you can switch to a simpler ViewGroup called FrameLayout that should be used for holding a single child view.
 */

/*
To be able to scroll through a vertical list of items that is longer than the screen, you need to add a vertical scrollbar
android:scrollbars="vertical"
*/

/*
Your app needs a way to take the data from Datasource, and format it so that each Affirmation can be displayed as an item in the RecyclerView.

Adapter is a design pattern that adapts the data into something that can be used by RecyclerView.
    In this case, you need an adapter that takes an Affirmation instance from the list returned by loadAffirmations(), and turns it into a list item view, so that it can be displayed in the RecyclerView.

When you run the app, RecyclerView uses the adapter to figure out how to display your data on screen.
    RecyclerView asks the adapter to create a new list item view for the first data item in your list.
    Once it has the view, it asks the adapter to provide the data to draw the item.
    This process repeats until the RecyclerView doesn't need any more views to fill the screen.
    If only 3 list item views fit on the screen at once, the RecyclerView only asks the adapter to prepare those 3 list item views (instead of all 10 list item views).
*/

/*
Put your cursor on ItemAdapter and press Command+I (Control+I on Windows).
This shows you the list of methods you need to implement: getItemCount(), onCreateViewHolder(), and onBindViewHolder().
*/