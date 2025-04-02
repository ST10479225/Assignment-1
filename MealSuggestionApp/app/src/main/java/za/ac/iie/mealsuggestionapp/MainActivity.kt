package za.ac.iie.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // UI Elements
        val edtTimeofDay = findViewById<EditText>(R.id.edtTimeofDay)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val txtSuggestion = findViewById<TextView>(R.id.txtSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Meal suggestion logic using IF statements
        btnSuggest.setOnClickListener {
            val timeofDay = edtTimeofDay.text.toString()
            var mealSuggestion = ""

            //Reset button functionality
            btnReset.setOnClickListener {
                edtTimeofDay.text.clear()
                txtSuggestion.text = ""
            }

            if (timeofDay == "morning") {
                mealSuggestion = "breakfast: Eggs and bacon"
            } else if (timeofDay == "mid morning") {
                mealSuggestion = "Snack: Protein shake, or Energy Bar"
            } else if (timeofDay == "afternoon") {
                mealSuggestion = "Lunch: Pizza"
            } else if (timeofDay == "mid afternoon") {
                mealSuggestion = "Snack: Banana and Apple"
            } else if (timeofDay == "dinner") {
                mealSuggestion = "Dinner: Spaghetti and Meatballs"
            } else if (timeofDay == "after dinner") {
                mealSuggestion = "dessert: Custard and Malva Pudding"
            } else {
                mealSuggestion =
                    "Invalid input!"
            }

            txtSuggestion.text = mealSuggestion
        }
    }
}

