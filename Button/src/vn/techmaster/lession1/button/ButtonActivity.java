package vn.techmaster.lession1.button;

import java.sql.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button bt = new Button(this);
        bt.setText("This is button");  
        bt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Button)v).setText(new Date(2012,5,8).toGMTString());
			}
		});
        setContentView(bt);
    }
}