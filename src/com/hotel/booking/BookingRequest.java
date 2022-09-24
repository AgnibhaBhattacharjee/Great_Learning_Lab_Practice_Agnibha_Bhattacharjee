package com.hotel.booking;

import java.util.List;

public class BookingRequest {
	
	private String occupancyType;
	private Boolean acType;
	private int floor;
    public Hotel hotel;
    private boolean flag;
    private List<Room> roomList;
    
    
    public BookingRequest(Hotel hotel) {
		// TODO Auto-generated constructor stub
		
		this.hotel= hotel;
		roomList = hotel.getRooms();
	}

	public String getOccupancyType() {
		return occupancyType;
	}

	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}

	public Boolean getAcType() {
		return acType;
	}

	public void setAcType(Boolean acType) {
		this.acType = acType;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	public  void scarchRoom(){
		//List<Room> roomList = hotel.getRooms();
		flag=false;
		//System.out.println(flag+" making the flag false for first time");
		for(Room room1:roomList){
			if(room1.getOccupancy().equalsIgnoreCase(this.occupancyType) &&
					room1.getFloor()==this.floor && room1.isAc()==this.acType){
				if(room1.isOccupied()==false){
					System.out.println(room1.roomDetails(room1));
					room1.setOccupied(true);
					//System.out.println(room1.toString());
					flag=true;
					//System.out.println(flag);
					break;
					
				}
				
			}
			
			
			
			
		}
		if(flag==false){
			//System.out.println(flag);
			String isAC="";
			if(this.acType){
				isAC=isAC+"AC";
			}
			else{
				isAC=isAC+"Non-AC";
			}
			//System.out.println(flag);
			System.out.println(String.format("%s occupancy %s room is not available", this.occupancyType,isAC));
			
		}
			
				
				
			
		
	}
	
	public  void scarchRoomInAnyFloor(){
		//List<Room> roomList = hotel.getRooms();
		flag=false;
		//System.out.println(flag+" making the flag false for first time");
		for(Room room1:roomList){
			if(room1.getOccupancy().equalsIgnoreCase(this.occupancyType) &&
					 room1.isAc()==this.acType){
				if(room1.isOccupied()==false){
					System.out.println(room1.roomDetails(room1));
					room1.setOccupied(true);
					//System.out.println(room1.toString());
					flag=true;
					//System.out.println(flag);
					break;
					
				}
				
			}
			
			
			
			
		}
		if(flag==false){
			String isAC="";
			if(this.acType){
				isAC=isAC+"AC";
			}
			else{
				isAC=isAC+"Non-AC";
			}
			//System.out.println(flag);
			System.out.println(String.format("%s occupancy %s room is not available", this.occupancyType,isAC));
		}
			
				
				
			
		
	}

}
