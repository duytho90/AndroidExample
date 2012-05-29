package vn.techmaster.lession3.customeadapter2;

import java.util.ArrayList;

import vn.techmaster.lession3.customeadapter1.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {
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
		listBook.add(b);
		Book b1 = new Book();
		b1.setBooksTitle("Second Book");
		b1.setCover(R.drawable.cover2);
		listBook.add(b1);
		Book b2 = new Book();
		b2.setBooksTitle("Third Book");
		b2.setCover(R.drawable.cover3);
		listBook.add(b2);
		bsa.notifyDataSetChanged();

		for (int i = 4; i <= 100000; i++) {
			Book b3 = new Book();
			b3.setBooksTitle(i + "th Book");
			b3.setCover(R.drawable.cover3);
			listBook.add(b3);
		}
		lv.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Toast.makeText(this, listBook.get(arg2).getBooksTitle(),
				Toast.LENGTH_SHORT).show();
	}

}