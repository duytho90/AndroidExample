package vn.techmaster.lession3.customeadapter;

import java.util.ArrayList;

import vn.techmaster.lession3.customeadapter1.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	
	ArrayList<Book> listBook;
	BookStoreAdapter bsa;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        listBook = new ArrayList<Book>();
        ListView lv = (ListView) findViewById(R.id.listBooks);
        bsa = new BookStoreAdapter(this, listBook);
        lv.setAdapter(bsa);
        
        
        Book b = new Book();
        b.setBooksTitle("First Book");
        b.setCover(R.drawable.cover1);
        b.setRated(1.0f);
        listBook.add(b);
        Book b1 = new Book();
        b1.setBooksTitle("Second Book");
        b1.setCover(R.drawable.cover2);
        b1.setRated(3.5f);
        listBook.add(b1);
        Book b2 = new Book();
        b2.setBooksTitle("Third Book");
        b2.setCover(R.drawable.cover3);
        b2.setRated(4.0f);
        listBook.add(b2);
        bsa.notifyDataSetChanged();
    }

}