package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isAvailable= false;

    boolean isWritable= false;

    boolean isReadable= false;
    String state = Environment.getExternalStorageState();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Environment.MEDIA_MOUNTED.equals(state)) {

            // Operation possible - Read and Write

            isAvailable= true;

            isWritable= true;

            isReadable= true;

            Toast.makeText(this, "read and write ", Toast.LENGTH_LONG).show();
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {

            // Operation possible - Read Only

            isAvailable= true;

            isWritable= false;

            isReadable= true;
            Toast.makeText(this, "only read", Toast.LENGTH_LONG).show();

        } else {

            // SD card not available

            isAvailable = false;

            isWritable= false;

            isReadable= false;
        }


    }
}