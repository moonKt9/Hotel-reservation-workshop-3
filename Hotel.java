package com.workshop3;

public class Hotel {
	private String HotelName;
	private float Rate;
	private int Rating;
	
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public float getRate() {
		return Rate;
	}
	public void setRate(float rate) {
		Rate = rate;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", Rate=" + Rate + ", Rating=" + Rating + ", getHotelName()="
				+ getHotelName() + ", getRate()=" + getRate() + ", getRating()=" + getRating() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

	
	
	
