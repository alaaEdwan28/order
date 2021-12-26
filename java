/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 */
package com.example.android.justjava

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;
import android.R





/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {
    var quantity = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.android.justjava.R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View?) {
        var price = quantity*5
        var priceMessage = "Total: $" + price;
        priceMessage = priceMessage + "\nThank you!"
        displayMessage(priceMessage);
    }
    private fun displayMessage(message: String) {
        val priceTextView = findViewById<View>(com.example.android.justjava.R.id.price_text_view) as TextView
        priceTextView.text = message
    }
    fun increment(view: View?) {
        quantity = quantity+1
        display(quantity);
    }
    fun decrement(view: View?) {
        quantity = quantity-1
        display(quantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById<View>(com.example.android.justjava.R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + number
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<View>(com.example.android.justjava.R.id.price_text_view) as TextView
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number))
    }
}
