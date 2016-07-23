package com.example.ravi.fragmentassignment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Fragment {
    Button btn;
    EditText editText1,editText2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        String strtext=getArguments().getString("value");
        View v=inflater.inflate(R.layout.activity_fragement_layout,container,false);
        editText1=(EditText)v.findViewById(R.id.edittext1);
        editText2=(EditText)v.findViewById(R.id.edittext2);
        btn=(Button)v.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum1=Integer.parseInt(editText1.getText().toString());
                int sum2=Integer.parseInt(editText2.getText().toString());
                int sum=sum1+sum2;
                Intent intent=new Intent(getActivity().getBaseContext(),simpleaddition.class);
                intent.putExtra("value",addition());
                getActivity().startActivity(intent);
            }
        });
        return v;
    }
    public int addition()
    {
        int sum1=10;
        int sum2=20;
        int sum=sum1+sum2;
        return sum;
    }


}
