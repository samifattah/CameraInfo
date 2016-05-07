package com.samifattah.camerainfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView m_TextView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Camera2Utility camera2Utility = new Camera2Utility(this, false);

        camera2Utility.init();

        m_TextView = (TextView) findViewById(R.id.textView);

        m_TextView.setText(camera2Utility.getDeviceCameraSummary());

        m_TextView.setMovementMethod(new ScrollingMovementMethod());

        camera2Utility.unint();
    }
}