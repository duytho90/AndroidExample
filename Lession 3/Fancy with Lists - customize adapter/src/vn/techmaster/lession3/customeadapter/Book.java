package vn.techmaster.lession3.customeadapter;

import vn.techmaster.lession3.customeadapter1.R;

public class Book {
	private int cover = R.drawable.cover1;

	private String booksTitle = "Default";

	private float rated = 0;

	public int getCover() {
		return cover;
	}

	public void setCover(int cover) {
		this.cover = cover;
	}

	public String getBooksTitle() {
		return booksTitle;
	}

	public void setBooksTitle(String booksTitle) {
		this.booksTitle = booksTitle;
	}

	public float getRated() {
		return rated;
	}

	public void setRated(float rated) {
		this.rated = rated;
	}

}