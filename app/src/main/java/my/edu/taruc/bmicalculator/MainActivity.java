package my.edu.taruc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_MESSAGE="my.edu.tarc.lab2intent.MESSAGE";
private EditText InputWeight;
private EditText InputHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputWeight=findViewById(R.id.InputWeight);
        InputHeight=findViewById(R.id.InputHeight);
    }

    public void CalculateBMI(View view){
        Double result;
        if(TextUtils.isEmpty(InputWeight.getText())){
            InputWeight.setError("Please enter weight value!!");
            return;
        }
        else if(TextUtils.isEmpty(InputHeight.getText())){
            InputHeight.setError("Please enter height value!!");
            return;
        }

        double weight=(Double.parseDouble(InputWeight.getText().toString()));
        double height=(Double.parseDouble(InputHeight.getText().toString()));
        result=weight/(height*height);
        Intent intent=new Intent(this,secondActivity.class);
        intent.putExtra(TAG_MESSAGE,result);
        startActivity(intent);



    }
}
