package sg.edu.rp.c346.id22025520.p07exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declare variables for the user interface objects
    TextView tv;
    ArrayList<String>fruits = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        String theFruit = fruits.get(1);

        String text = "Fruits\n=====\n" + fruits.get(0) + "\n" +
                fruits.get(1) + "\n" +
                fruits.get(2) + "\n" +
                fruits.get(3);


        tv.setText(text);
    }
}