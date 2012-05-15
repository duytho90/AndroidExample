package vn.techmaster.lession2.gridviewwithimage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        GridView gridView = (GridView) findViewById(R.id.gridView);
		gridView.setAdapter(new ImageAdapter(this));
    }

	public class ImageAdapter extends BaseAdapter 
	{
	    private Context context;
	    int[] albums = new int[]{
        		R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
        		R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
        		R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,
        		R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher
        };
	    
	    public ImageAdapter(Context c) 
	    {
	        context = c;
	    }

	    //---returns the number of images---
	    public int getCount() {
	        return albums.length;
	    }

	    //---returns the ID of an item--- 
	    public Object getItem(int position) {
	        return position;
	    }

	    public long getItemId(int position) {
	        return position;
	    }

	    //---returns an ImageView view---
	    public View getView(int position, View convertView, ViewGroup parent) 
	    {
	        ImageView imageView;
	        if (convertView == null) {
	            imageView = new ImageView(context);
	            imageView.setLayoutParams(new GridView.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
	            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	            imageView.setPadding(5, 5, 5, 5);
	        } else {
	            imageView = (ImageView) convertView;
	        }
	        imageView.setImageResource(albums[position]);
	        return imageView;
	    }

	}    
}