package vn.techmaster.lession1.helloworld;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello World");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(20);
        setContentView(tv);
    }
}