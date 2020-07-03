package abdulrahman.grade.svproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText yourjobe = findViewById(R.id.yourjob);
        final EditText phonenumber = findViewById(R.id.phonenumber);
        final EditText email = findViewById(R.id.email);

        Button enter = findViewById(R.id.button);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hello = name.getText().toString();
                String hello2 = age.getText().toString();
                String hello3 = yourjobe.getText().toString();
                String hello4 = phonenumber.getText().toString();
                String hello5 = email.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("data1", hello);
                i.putExtra("data2", hello2);
                i.putExtra("data3", hello3);
                i.putExtra("data4", hello4);
                i.putExtra("data5", hello5);
                startActivity(i);

            }
        });
    }}




