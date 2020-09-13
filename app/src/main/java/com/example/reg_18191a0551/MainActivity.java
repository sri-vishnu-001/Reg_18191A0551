package com.example.reg_18191a0551;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {
    static EditText roll;
    static EditText name;
    EditText mail;
    EditText phone;
    EditText password;
    EditText branch;
    RadioButton male,female;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll.findViewById(R.id.roll_number);
        name.findViewById(R.id.name);
        mail.findViewById(R.id.mail);
        phone.findViewById(R.id.phone);
        password.findViewById(R.id.password);
        branch.findViewById(R.id.branch);
        male.findViewById(R.id.male);
        female.findViewById(R.id.female);
        submit.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bb = new Bundle();
                bb.putString("roll", String.valueOf(roll));
                bb.putString("name",String.valueOf(name));
                bb.putString("mail",String.valueOf(mail));
                bb.putString("phone", String.valueOf(phone));
                bb.putString("password",String.valueOf(password));
                bb.putString("male",String.valueOf(male));
                bb.putString("female", String.valueOf(female));
                bb.putString("branch",String.valueOf(branch));
                intent.putExtras(bb);
                startActivity(intent);
                finish();
            }
        });

    }

     void checkDataEntered() {
        if(roll == null){
            Toast t = Toast.makeText(this,"you must enter roll number",Toast.LENGTH_SHORT);
            t.show();
        }
         if(name == null){
             Toast t = Toast.makeText(this,"you must enter name",Toast.LENGTH_SHORT);
             t.show();
         }
         if(mail == null){
             Toast t = Toast.makeText(this,"you must enter mail",Toast.LENGTH_SHORT);
             t.show();
         }
         if(phone == null){
             Toast t = Toast.makeText(this,"you must enter phone number",Toast.LENGTH_SHORT);
             t.show();
         }
         if(password == null){
             Toast t = Toast.makeText(this,"you must enter password",Toast.LENGTH_SHORT);
             t.show();
         }
         if(branch == null){
             Toast t = Toast.makeText(this,"you must enter branch",Toast.LENGTH_SHORT);
             t.show();
         }
    }

}