package sg.edu.rp.c346.id20022543.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText number;
    TextView noOfPax;
    DatePicker dp;
    TimePicker tp;
    CheckBox cbEnabled;
    Button btnConfirm,btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.textDisplayName);
        number = findViewById(R.id.displayNumber);
        noOfPax = findViewById(R.id.noOfPax);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        cbEnabled = findViewById(R.id.smoking);
        btnConfirm = findViewById(R.id.buttonConfirm);
        btnReset = findViewById(R.id.buttonReset);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Name: " + name.getText() + "Mobile Number: " + number.getText() + "No of pax: " + noOfPax.getText() + "Date: " + dp + "Time: " + tp  ,Toast.LENGTH_LONG).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                number.setText("");
                noOfPax.setText("");
                dp.updateDate(2021,06,01);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
            }
        });




    }
}