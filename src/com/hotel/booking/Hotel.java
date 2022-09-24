package com.hotel.booking;

import java.util.List;

public class Hotel {
	private String hotelName;
	private String address;
	private List<Room> rooms;
	public Hotel(String hotelName, String address, List<Room> rooms) {
		super();
		this.hotelName = hotelName;
		this.address = address;
		this.rooms = rooms;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", address=" + address + ", rooms=" + rooms + "]";
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	

}
