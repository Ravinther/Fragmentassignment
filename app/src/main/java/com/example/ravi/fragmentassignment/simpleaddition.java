package com.example.ravi.fragmentassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Ravi on 7/23/2016.
 */
public class simpleaddition extends Activity {
    TextView txt;
    Intent intent = getIntent();
    String res=intent.getStringExtra("value");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.result);
        res= txt.getText().toString();
    }
}
