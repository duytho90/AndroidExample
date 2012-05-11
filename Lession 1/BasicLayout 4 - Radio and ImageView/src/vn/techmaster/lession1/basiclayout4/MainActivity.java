package vn.techmaster.lession1.basiclayout4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {
	RadioGroup rg;
	ImageView img;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		rg = (RadioGroup) findViewById(R.id.radioGroup);
		img = (ImageView) findViewById(R.id.imageView);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.rb1:
					img.setBackgroundColor(Color.RED);
					break;
				case R.id.rb2:
					img.setBackgroundColor(Color.GREEN);
					break;
				case R.id.rb3:
					img.setBackgroundColor(Color.BLUE);
					break;
				case R.id.rb4:
					img.setBackgroundColor(Color.TRANSPARENT);
					break;
				case R.id.rb5:
					img.setBackgroundColor(Color.parseColor("#CACACA"));
					break;
				default:
					break;
				}
			}
		});
	}
}