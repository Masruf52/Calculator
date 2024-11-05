package com.masruf.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView number1Button, number2Button, number3Button, number4Button, number5Button, number6Button, number7Button, number8Button, number9Button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        number1Button = findViewById(R.id.number1Button);
        number2Button = findViewById(R.id.number2Button);
        number3Button = findViewById(R.id.number3Button);
        number4Button = findViewById(R.id.number4Button);
        number5Button = findViewById(R.id.number5Button);
        number6Button = findViewById(R.id.number6Button);
        number7Button = findViewById(R.id.number7Button);
        number8Button = findViewById(R.id.number8Button);
        number9Button = findViewById(R.id.number9Button);
        textView = findViewById(R.id.textView);





    }
}