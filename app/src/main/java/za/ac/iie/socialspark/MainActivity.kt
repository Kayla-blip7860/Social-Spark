package za.ac.iie.socialspark

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.editTextTime)
        val btnSuggest = findViewById<Button>(R.id.buttonSuggest)
        val btnReset = findViewById<Button>(R.id.buttonReset)
        val txtResult = findViewById<TextView>(R.id.textViewResult)

        btnSuggest.setOnClickListener {

            val userInput = inputTime.text.toString().trim()

            Log.d("USER_INPUT", userInput)

            if (userInput.isEmpty()) {
                txtResult.text = "Please enter a time of day"
            }
            else if (userInput.equals("morning", true)) {
                txtResult.text = "Send a Good Morning text to a family member "
            }
            else if (userInput.equals("mid-morning", true)) {
                txtResult.text = "Send a quick Thank You to a colleague "
            }
            else if (userInput.equals("afternoon", true)) {
                txtResult.text = "Share a funny meme with a friend "
            }
            else if (userInput.equals("afternoon snack time", true)) {
                txtResult.text = "Send a 'thinking of you' message "
            }
            else if (userInput.equals("dinner", true)) {
                txtResult.text = "Call someone for a 5-minute catch-up"
            }
            else if (userInput.equals("night", true) || userInput.equals("after dinner", true)) {
                txtResult.text = "Leave a thoughtful comment on a post "
            }
            else {
                txtResult.text = "Invalid input Try: Morning, Afternoon, Dinner, etc."
            }
        }

        btnReset.setOnClickListener {
            inputTime.text.clear()
            txtResult.text = ""
            Log.d("RESET", "Fields cleared")
        }
    }
}