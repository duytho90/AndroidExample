package vn.techmaster.lession3.customeadapter1;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BookStoreAdapter extends BaseAdapter {

	Context ctx;
	ArrayList<Book> listBooks;
	LayoutInflater inflater;

	public BookStoreAdapter(Context ctx, ArrayList<Book> listBooks) {
		this.ctx = ctx;
		this.listBooks = listBooks;
		inflater = LayoutInflater.from(ctx);
	}

	@Override
	public int getCount() {
		return listBooks.size();
	}

	@Override
	public Object getItem(int position) {
		return listBooks.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		convertView = inflater.inflate(R.layout.listview_item, parent, false);
		ImageView img = (ImageView) convertView
				.findViewById(R.id.imgCover);
		TextView tv = (TextView) convertView
				.findViewById(R.id.tvBookTitle);

		final Book bookObject = listBooks.get(position);
		img.setImageResource(bookObject.getCover());
		tv.setText(bookObject.getBooksTitle());
		return convertView;
	}

}