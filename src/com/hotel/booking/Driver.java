package com.hotel.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Room> rooms= new ArrayList<>();
		
		Room room1= new Room(101, 1, true, false, "Single");
		Room room2= new Room(102, 1, true, false, "Double");
		Room room3= new Room(103, 1, false, false, "Double");
		Room room4= new Room(201, 2, true, false, "Single");
		Room room5= new Room(202, 2, false, false, "Single");
		Room room6= new Room(203, 2, true, false, "Double");
		Room room7= new Room(204, 2, true, false, "Triple");
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
		rooms.add(room6);
		rooms.add(room7);
		Hotel hotel1= new Hotel("Hotel Beach view", "8 Beach road, 700025", rooms);
		//System.out.println(hotel1.toString());
		//System.out.println(room1.toString());
		Scanner sc= new Scanner(System.in);
		int response;
		do{
			System.out.println("This is the menu.");
			System.out.println("Which kind of occupancy room you want? (Single/Double/Triple)");
			String occupancyType= sc.next();
			System.out.println("Do you want AC room? (Y/N)");
			String ac= sc.next();
			Boolean acType;
			if(ac.equalsIgnoreCase("Y")) {acType=true;}
			else{acType=false;}
			System.out.println("Do you have any floor preference? (Y/N)");
			String floorPreference= sc.next();
			BookingRequest hotelBookingRequest = new BookingRequest(hotel1);
			hotelBookingRequest.setOccupancyType(occupancyType);
			hotelBookingRequest.setAcType(acType);
			if(floorPreference.equalsIgnoreCase("Y")){
				System.out.println("Which floor room you want? (1/2)");
				int floor= sc.nextInt();
				//BookingRequest hotelBookingRequest1 = new BookingRequest(hotel1);
				//hotelBookingRequest1.setOccupancyType(occupancyType);
				//hotelBookingRequest1.setAcType(acType);
				hotelBookingRequest.setFloor(floor);
				
				hotelBookingRequest.scarchRoom();
				
			}
			else{
				//BookingRequest hotelBookingRequest = new BookingRequest(occupancyType,acType, hotel1);
				
				
				hotelBookingRequest.scarchRoomInAnyFloor();
			}
			System.out.println("Press 1 to continue 0 to exit.");
			response= sc.nextInt();
			
		}while(response==1);
		
		
	}

}
