package vn.techmaster.lession3.customeadapter;

import java.util.ArrayList;

import vn.techmaster.lession3.customeadapter1.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

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

		ViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.listview_item, parent,
					false);
			viewHolder.imgCover = (ImageView) convertView
					.findViewById(R.id.imgCover);
			viewHolder.booksTitle = (TextView) convertView
					.findViewById(R.id.tvBookTitle);
			viewHolder.rated = (RatingBar) convertView
					.findViewById(R.id.ratingBar);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		final Book bookObject = listBooks.get(position);
		viewHolder.imgCover.setImageResource(bookObject.getCover());
		viewHolder.booksTitle.setText(bookObject.getBooksTitle());
		viewHolder.rated.setRating(bookObject.getRated());
		
		/*
		 * TODO :
		 * - Remember that if item of selection control has Rating Bar, you can not set on click for that control.
		 * - Solution is setOnClick for convertView or any control in view of item (NOT FOR SELECTION CONTROL)
		 */
		convertView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(ctx, bookObject.getBooksTitle(), Toast.LENGTH_SHORT).show();
			}
		});
		return convertView;
	}

	static class ViewHolder {
		ImageView imgCover;
		TextView booksTitle;
		RatingBar rated;
	}

}