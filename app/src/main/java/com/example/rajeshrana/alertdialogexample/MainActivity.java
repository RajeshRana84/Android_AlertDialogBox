package com.example.rajeshrana.alertdialogexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClickButton();
    }



    public void onClickButton(){

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        // First Button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create Alert Dialog Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);

                // Set Alert Title and Message
                builder.setTitle("Sample Alert");
                builder.setMessage("One Action Button Alert");

                // Set Positive button Condition
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                            }
                        });
                // Show Alert Dialog
                builder.show();
            }
        });


        // Second Button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create Alert Dialog Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);

                // Set Alert Title and Message
                builder.setTitle("Sample Alert Again");
                builder.setMessage("Two Action Buttons Alert Dialog");

                // Set Negative button Condition
                builder.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                            }
                        });

                // Set Positive button Condition
                builder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                            }
                        });

                // Show Alert Dialog
                builder.show();
            }
        });




        // Third Button
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Alert Dialog Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);

                // Set Alert Title and Message
                builder.setTitle("Sample Alert");
                builder.setMessage("Three Action Buttons Alert Dialog");

                // Set Negative button Condition
                builder.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                            }
                        });

                // Set Positive button Condition
                builder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                            }
                        });

                // Set Neutral button Condition
                builder.setNeutralButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"Cancel is clicked",Toast.LENGTH_LONG).show();
                            }
                        });

                // Show Alert Dialog
                builder.show();
            }
        });



                // Fourth Alert Dialog
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create Alert Dialog Builder
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainActivity.this);


                // Set Alert Title and Message
                builder.setTitle("Quit App");
                builder.setMessage("Do you really want to Quit This App ?");
                builder.setCancelable(false);


                // Set Positive button Condition
                builder.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                finish();
                            }
                        });


                // Set Negative button Condition
                builder.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                dialog.cancel();
                            }
                        });



                // Show Alert Dialog
                builder.show();
            }
        });

    }
}
