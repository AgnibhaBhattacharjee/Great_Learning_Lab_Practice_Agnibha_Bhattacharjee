package com.hotel.booking;

public class Room {
 private int roomNo;
 private int floor;
 private boolean ac;
 private boolean occupied;
 private String occupancy;
 private double price;
 //private static int roomCount=0;
public Room(int roomNo, int floor, boolean ac, boolean occupied, String occupancy) {
	super();
	this.roomNo = roomNo;
	this.floor = floor;
	this.ac = ac;
	this.occupied = occupied;
	this.occupancy = occupancy;
	this.price= Room.calculatePrice(occupancy, ac);
	
}

private static double calculatePrice(String occupancy, boolean ac){
	int roomPrice;
	if(occupancy.equalsIgnoreCase("Single")){
		if(ac){roomPrice=3000;}
		else{roomPrice=2000;}
	}
	else if(occupancy.equalsIgnoreCase("Double")){
		if(ac){roomPrice=4000;}
		else{roomPrice=3000;}
	}
	else{
		if(ac){roomPrice=5000;}
		else{roomPrice=4000;}
	}
	
	
	return roomPrice;
}
@Override
public String toString() {
	return "Room [roomNo=" + roomNo + ", floor=" + floor + ", ac=" + ac + ", occupied=" + occupied + ", occupancy="
			+ occupancy + ", price=" + price + "]";
}
public int getRoomNo() {
	return roomNo;
}
public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}
public int getFloor() {
	return floor;
}
public void setFloor(int floor) {
	this.floor = floor;
}
public boolean isAc() {
	return ac;
}
public void setAc(boolean ac) {
	this.ac = ac;
}
public boolean isOccupied() {
	return occupied;
}
public void setOccupied(boolean occupied) {
	this.occupied = occupied;
}
public String getOccupancy() {
	return occupancy;
}
public void setOccupancy(String occupancy) {
	this.occupancy = occupancy;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public String roomDetails(Room room){
	String floorNo="";
	if(floor==1){
		floorNo= floorNo+"first";
	}
	else if(floor==2){
		floorNo= floorNo+"second";
	}
	String acStatus="";
	if(ac){
		acStatus= acStatus+"Air conditioned";
	}
	else if(ac==false){
		acStatus= acStatus+"Non Air conditioned";
	}
	
	return String.format("Room number: %s, %s floor, %s, %s occupancy, estimated: %s/day", roomNo,
			floorNo,acStatus,occupancy,price);
}
 
}
