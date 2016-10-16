package com.example.hero.loginpage;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.hero.loginpage.R.id.editText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

EditText userid,pwd;
    Button login;
    public final static String UserId="com.example.hero.loginpage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userid= (EditText) findViewById(editText);
        pwd=(EditText)findViewById(R.id.editText2);
        login=(Button) findViewById(R.id.btn);
        login.setOnClickListener(this);
    }
    public void onClick(View v){
        if(TextUtils.isEmpty(userid.getText().toString())|| TextUtils.isEmpty(pwd.getText().toString())){
            return;
        }
        /*else {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("wrong password or username");
            dlgAlert.setTitle("Error Message...");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        }*/

        Intent intent= new Intent(this, LoginPageActivity.class);
        String id=userid.getText().toString();
        intent.putExtra(UserId,id);
        startActivity(intent);
    }
}
