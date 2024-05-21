package com.tinteeam.android_info;

import android.os.Build;
import android.support.v4.app.AppCompatActity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    int androidVersion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidVersion = Build.VERSION.SDK_INT;
                switch (androidVersion) {
                    case 14:
                        textView.setText("15, Ice Cream Sandwich");
                        break;
                    case 15:
                        textView.setText("15, Ice Cream Sandwich");
                        break;
                    case 16:
                        textView.setText("16, Jelly Bean");
                        break;
                    case 17:
                        textView.setText("17, Jelly Bean");
                        break;
                    case 18:
                        textView.setText("18, Jelly Bean");
                        break;
                    case 19:
                        textView.setText("19, KitKat");
                        break;
                    case 21:
                        textView.setText("21, Lollipop");
                        break;
                    case 22:
                        textView.setText("22, Lollipop");
                        break;
                    case 23:
                        textView.setText("23, Marshmallow");
                        break;
                    case 24:
                        textView.setText("24, Nougat");
                        break;
                    case 25:
                        textView.setText("25, Nougat");
                        break;
                    case 26:
                        textView.setText("26, Oreo");
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Not Found", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}