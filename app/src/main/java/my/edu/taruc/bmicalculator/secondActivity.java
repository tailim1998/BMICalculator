package my.edu.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            Double result=((Intent) intent).getDoubleExtra(MainActivity.TAG_MESSAGE);
        }

    }
}
