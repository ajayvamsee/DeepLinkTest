package com.ajayvamsee.deeplinktest;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // creating a variable for our text view
    private TextView messageTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our variable
        messageTV = findViewById(R.id.idTVMessage);

        // getting the data from our
        // intent in our uri.
        Uri uri = getIntent().getData();

        /*// checking if the uri is null or not.
        if (uri != null) {
            // if the uri is not null then we are getting the
            // path segments and storing it in list.
            List<String> parameters = uri.getPathSegments();

            // after that we are extracting string from that parameters.
            String param = parameters.get(parameters.size() - 1);

            // on below line we are setting
            // that string to our text view
            // which we got as params.
           // messageTV.setText(param);
        }*/
    }
}