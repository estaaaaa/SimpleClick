package sg.edu.rp.c346.id22017139.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // 1. declare field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Link field variable to UI components
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);



        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = tbtn.isChecked();
                // Perform actions based on the toggle button state
                if (isChecked) {
                    // Toggle button is enabled
                    tbtn.getTextOn();
                    // Enable the EditText
                    etInput.setEnabled(true);
                } else {
                    // Toggle button is disabled
                    tbtn.getTextOff();
                    // Disable the EditText
                    etInput.setEnabled(false);
                }
            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    // Write the code when male selected
                    String maleResponse = getString(R.string.maleR) + (" ") + stringResponse;
                    tvDisplay.setText(maleResponse);

                } else {
                    // Write the code when female selected
                    String femaleResponse = getString(R.string.femaleR) + (" ") + stringResponse;
                    tvDisplay.setText(femaleResponse);

                }
            }});

    }
}