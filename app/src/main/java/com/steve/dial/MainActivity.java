package com.steve.dial;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Views

    EditText EtNum;
    Button dialBtn;


    //String variable to store text from editText
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views

        EtNum = findViewById(R.id.EtNum);
        dialBtn = findViewById(R.id.dialBtn);

                 // on click listener
        //uri.encode(string) allows numbers with * and # symbols to dial

        dialBtn.setOnClickListener(v -> {

            number = EtNum.getText().toString().trim();
            Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:" + Uri.encode(number)));
            startActivity(intent);


        });
    }
}