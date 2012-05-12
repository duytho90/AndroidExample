package vn.techmaster.lession1.basicxmllayout;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	TextView tv;
	String[] fontNames = new String[]{	
		"Roboto-Black.ttf",
		"Roboto-BlackItalic.ttf",
		"Roboto-Bold.ttf",
		"Roboto-BoldCondensed.ttf",
		"Roboto-BoldCondensedItalic.ttf",
		"Roboto-BoldItalic.ttf",
		"Roboto-Condensed.ttf",
		"Roboto-CondensedItalic.ttf",
		"Roboto-Italic.ttf",
		"Roboto-Light.ttf",
		"Roboto-LightItalic.ttf",
		"Roboto-Medium.ttf",
		"Roboto-MediumItalic.ttf",
		"Roboto-Regular.ttf",
		"Roboto-Thin.ttf",
		"Roboto-ThinItalic.ttf"
	};
	
	ArrayList<Typeface> lists = new ArrayList<Typeface>();
	int i = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tv = (TextView) findViewById(R.id.content);
		initFonts();
	}
	
	private void initFonts(){
		for(String fontName : fontNames){
			Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/"+fontName);
			lists.add(tf);
		}
	}
	
	public void changeFont(View v){
		if(i < lists.size()){
			tv.setTypeface(lists.get(i));
			((Button)v).setText(fontNames[i]);
			i++;
		}
	}
}