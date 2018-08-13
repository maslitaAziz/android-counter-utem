package my.edu.utem.counterassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView count;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        counter = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.nombor);
    }

    public void buttonPressed(View view) {
        counter = counter + 1;
        //count.setText(Integer.toString(counter));
        count.setText(counter+""); //atau guna concatenate string
    }

    public void buttonPressedDecreased(View view) {

        if (counter == 0) {
            Toast.makeText(MainActivity.this, "Number cannot less than 0", Toast.LENGTH_LONG).show();
        }
        else {
            counter--;
            count.setText(Integer.toString(counter));
        }
    }

    public void buttonPressedReset(View view) {
        counter = 0;
        count.setText(Integer.toString(counter));
    }
}
