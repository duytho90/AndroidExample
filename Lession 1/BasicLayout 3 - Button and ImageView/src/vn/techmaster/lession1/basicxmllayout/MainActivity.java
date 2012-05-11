package vn.techmaster.lession1.basicxmllayout;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity {
	ImageView img;
	boolean image = true;
	ArrayList<ScaleType> list = new ArrayList<ImageView.ScaleType>();
	int i = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        img = (ImageView) findViewById(R.id.imageView);
        list.add(ScaleType.CENTER);
        list.add(ScaleType.CENTER_CROP);
        list.add(ScaleType.CENTER_INSIDE);
        list.add(ScaleType.FIT_CENTER);
        list.add(ScaleType.FIT_END);
        list.add(ScaleType.FIT_START);
        list.add(ScaleType.FIT_XY);
        list.add(ScaleType.MATRIX);
        img.setScaleType(list.get(0));
    }
    
    public void changeImage(View v){
    	if(image){
    		img.setImageResource(R.drawable.android2);
    	}else{
    		img.setImageResource(R.drawable.android1);
    	}
    	img.setScaleType(list.get(0));
        i = 0;
    }
    
    public void scaleType(View v){
    	if(i < (list.size()-1)){
    		i++;
    		img.setScaleType(list.get(i));
    	}
    }
}