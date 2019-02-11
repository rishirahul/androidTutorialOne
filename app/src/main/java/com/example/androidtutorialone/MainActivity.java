package com.example.androidtutorialone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button invokeFromXml;
    Button getInvokeFromJava;
    TextView msgInvokeFromXml;
    TextView getMsgInvokeFromJava;
    EditText message;
    Button messageSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInvokeFromJava = (Button) findViewById(R.id.Invoke_from_Java);
        msgInvokeFromXml = (TextView) findViewById(R.id.message_one);
        getMsgInvokeFromJava = (TextView) findViewById(R.id.message_two);
        message = (EditText) findViewById(R.id.your_message_editText);
        messageSubmit = (Button) findViewById(R.id.submit_button);

        getInvokeFromJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMsgInvokeFromJava.setText("Invoked from Java");
            }
        });
    }

    public void functionInvokedFromXml(View view) {
        msgInvokeFromXml.setText("Invoked from Xml");
    }
}
