package com.bwapps.barney.primenumbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText limitEntryInput;
    private EditText primeNumbersText;
    private Button findPrimesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limitEntryInput = (EditText) findViewById(R.id.limit_entry);
        primeNumbersText = (EditText) findViewById(R.id.prime_numbers_text);
        findPrimesButton = (Button) findViewById(R.id.findPrimesButton);

        primeNumbersText.setFocusable(false);
        primeNumbersText.setClickable(true);

        int defaultInt = 10;
        limitEntryInput.setText(String.valueOf(defaultInt));
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        findPrimesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                primeNumbersText.setText("");
                Prime.clearPrimeString();

                int chosenLimit = Integer.parseInt(String.valueOf(limitEntryInput.getText()));

                for (int i = 2; i <= chosenLimit; i++)
                {
                    if (Prime.isPrime(i))
                    {
                        Prime.setPrimeString(String.valueOf(i));
                    }
                }

                String completePrimeString = Prime.getPrimeString();

                primeNumbersText.setText(completePrimeString);
            }
        });
    }
}
