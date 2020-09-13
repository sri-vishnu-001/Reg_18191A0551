package com.example.reg_18191a0551;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Bundle bb2 = this.getIntent().getExtras();
    String roll = bb2.getString("roll");
    String name = bb2.getString("name");
    String mail = bb2.getString("mail");
    String phone = bb2.getString("phone");
    String password = bb2.getString("password");
    String male = bb2.getString("male");
    String female = bb2.getString("female");
    String branch = bb2.getString("branch");
}
