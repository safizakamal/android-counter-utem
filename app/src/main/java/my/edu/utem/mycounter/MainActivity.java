package my.edu.utem.mycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.number_textView);

    }

    public void reset (View view){
        count=0;
        textView.setText("0");
    }

    public void increment_btn(View view){
        count++;
        //+"" maksudnya nak concatenatekan int kepada string
        textView.setText(count +"");
    }

    public void decrement_btn (View view){


        if (count == 0)
            Toast.makeText(MainActivity.this, "Number cannot be less than 0", Toast.LENGTH_LONG).show();

        else {
            count--;
            textView.setText(count +"");
        }


    }


}
