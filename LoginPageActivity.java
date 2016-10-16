package com.example.hero.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginPageActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtid;
    Button out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        txtid=(TextView)findViewById(R.id.textView5);
        out=(Button)findViewById(R.id.btnout);
        out.setOnClickListener(this);
        Intent intent = getIntent();
        String id= intent.getStringExtra(MainActivity.UserId);
        txtid.setText(id);

    }

    @Override
    public void onClick(View v) {
        Intent login=new Intent(this,MainActivity.class);
        startActivity(login);
    }
}
