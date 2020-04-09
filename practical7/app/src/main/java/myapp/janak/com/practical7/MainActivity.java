package myapp.janak.com.practical7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    Spinner spinner;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text = spinner.getSelectedItem().toString();

                spinner.setBackgroundColor(Color.parseColor("#ffffff"));

                if(text.equals("Red")){
                    layout.setBackgroundColor(Color.parseColor("#ff0000"));
                }else if(text.equals("Yellow")){
                    layout.setBackgroundColor(Color.parseColor("#ffff00"));
                }else if(text.equals("Green")){
                    layout.setBackgroundColor(Color.parseColor("#003300"));
                }else if(text.equals("Black")){
                    layout.setBackgroundColor(Color.parseColor("#000000"));
                }else if(text.equals("Blue")){
                    layout.setBackgroundColor(Color.parseColor("#000066"));
                }else if(text.equals("None")){
                    layout.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
