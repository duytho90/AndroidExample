package vn.techmaster.lession2.galleryview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener {
	TextView tv;
	Gallery gallery;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv = (TextView) findViewById(R.id.tvPosition);
        gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(this);
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
	            imageView.setLayoutParams(new Gallery.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
	            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
	            imageView.setBackgroundColor(Color.WHITE);
	        } else {
	            imageView = (ImageView) convertView;
	        }
	        imageView.setImageResource(albums[position]);
	        return imageView;
	    }

	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		tv.setText(String.format("Android Gallery - Posision : %d", arg2));
	}    
}