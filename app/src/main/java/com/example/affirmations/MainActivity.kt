package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

