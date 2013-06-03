package vn.edu.uit.uitanpr.interfaces;

import android.location.Location;

public interface GPSCallback {
	public abstract void onGPSUpdate(Location location);
}
