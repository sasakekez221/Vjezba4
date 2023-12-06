package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private String[] stringsArrayUsername;
    private String[] stringsArrayPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeObjects();
        initializeArrays();
        fillArraysWithData();
    }
    private void initializeObjects()
    {
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
    }
    private void initializeArrays()
    {
        stringsArrayUsername = new String[3];
        stringsArrayPassword = new String[3];
    }

private void fillArraysWithData()
{
    stringsArrayUsername[0] = "user0";
    stringsArrayUsername[1] = "user1";
    stringsArrayUsername[2] = "user2";

    stringsArrayPassword[0] = "password0";
    stringsArrayPassword[1] = "password1";
    stringsArrayPassword[2] = "password2";
}
public void clickButtonLogin(View view) {
    String enteredUsername = editTextUsername.getText().toString();
    String enteredPassword = editTextPassword.getText().toString();

    if (areUsernameAndPasswordCorrect(enteredUsername, enteredPassword)) {
        Intent intent = new Intent(getApplicationContext(), Profil.class);
        startActivity(intent);
    } else
        Toast.makeText(getApplicationContext(), "Krivo Uneseno", Toast.LENGTH_SHORT).show();


}
    private boolean areUsernameAndPasswordCorrect(String username, String password)
    {
        for(int i=0;i<stringsArrayUsername.length; ++i)
        {
            if((username.equals(stringsArrayUsername[i])&&(password.equals(stringsArrayPassword[i]))))
                return true;
        }
        return false;
    }
}