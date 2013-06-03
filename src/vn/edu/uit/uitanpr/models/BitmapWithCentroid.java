package vn.edu.uit.uitanpr.models;

import android.graphics.Bitmap;

import org.opencv.core.Point;

public class BitmapWithCentroid implements Comparable<BitmapWithCentroid>{
	
	public BitmapWithCentroid(Bitmap bitmap, Point centroid) {
		super();
		this.centroid = centroid;
		this.bitmap = bitmap;
	}

	Point centroid;
	Bitmap bitmap;

	public Point getCentroid() {
		return centroid;
	}

	public void setCentroid(Point centroid) {
		this.centroid = centroid;
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public int compareTo(BitmapWithCentroid another) {
		if((Math.abs(this.centroid.y - another.centroid.y) <= 30)) //inline
			return (int)(this.centroid.x - another.centroid.x);
		else
			return (int)(this.centroid.y - another.centroid.y);
	}

	@Override
	public String toString() {
		return "Toa do: " + this.centroid.x + "x" + this.centroid.y;
	}

}
