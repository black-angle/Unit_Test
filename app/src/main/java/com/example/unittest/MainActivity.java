package com.example.unittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bclick(View view){
        //startActivity(new Intent(MainActivity.this,Main2Activity.class));
        EditText t=findViewById(R.id.editText);
        Toast.makeText(this, t.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
