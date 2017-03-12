package com.mohit.tokas.basicsone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // automatically generated code which inflates the UI
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void print_tview_btn_click(View view) {
        //get a reference to the TextView field
        TextView textView = (TextView)findViewById(R.id.textView);
        //set our message stored in /res/values/strings.xml as text in the TextView
        textView.setText(getResources().getString(R.string.message));
    }

    public void print_toast_btn_click(View view) {
        //create an object of Toast(a popup message) with a Context, the string to be displayed
        //and the length(can be specified in milliseconds also i.e. 1000 for 1 second) as arguments
        Toast mymessage = Toast.makeText(this, getResources().getString(R.string.message), Toast.LENGTH_SHORT);
        //display the Toast by calling show method
        mymessage.show();
    }
}
