package vn.techmaster.lession1.basicxmllayout5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	ToggleButton togleButton;
	CheckBox checkbox;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        togleButton = (ToggleButton) findViewById(R.id.togle);
        checkbox = (CheckBox) findViewById(R.id.checkbox);
        
        togleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				Toast.makeText(MainActivity.this, "Togle's state : "+isChecked, Toast.LENGTH_LONG).show();
			}
		});
        
        checkbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				Toast.makeText(MainActivity.this, "Checkbox's state : "+isChecked, Toast.LENGTH_LONG).show();
			}
		});
    }
}