package vn.techmaster.lession3.customeadapter2;

import java.util.ArrayList;

import vn.techmaster.lession3.customeadapter1.R;
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

		ViewHolder viewHolder = new ViewHolder();
		convertView = inflater.inflate(R.layout.listview_item, parent, false);
		viewHolder.imgCover = (ImageView) convertView
				.findViewById(R.id.imgCover);
		viewHolder.booksTitle = (TextView) convertView
				.findViewById(R.id.tvBookTitle);
		convertView.setTag(viewHolder);
		final Book bookObject = listBooks.get(position);
		viewHolder.imgCover.setImageResource(bookObject.getCover());
		viewHolder.booksTitle.setText(bookObject.getBooksTitle());
		return convertView;
	}

	static class ViewHolder {
		ImageView imgCover;
		TextView booksTitle;
	}

}