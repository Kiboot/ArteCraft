package com.hellohasan.sqlite_multiple_three_tables_crud.features.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hellohasan.sqlite_multiple_three_tables_crud.R;
import com.hellohasan.sqlite_multiple_three_tables_crud.features.student_crud.student_list_show.StudentListActivity;

public class LoginActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);
        Button loginButton;
        loginButton  = findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, StudentListActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
    //disable back button
    @Override
    public void onBackPressed () {
    }
}