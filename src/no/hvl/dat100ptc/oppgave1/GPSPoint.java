package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

<<<<<<< HEAD
	// TODO - objektvariabler
	
	int time;
	double latitude;
	double longitude;
	double elevation;
	
=======
	// TODO - objektvariable
	
	private int time;
	private double latitude;
	private double longitude;
	private double elevation;
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
	
		
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		// TODO - konstruktur
<<<<<<< HEAD
this.time = time;
this.latitude = latitude;
this.longitude = longitude;
this.elevation = elevation;

=======
		
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;
		
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863

	}

	// TODO - get/set metoder
	public int getTime() {
		
		return time;
<<<<<<< HEAD
	
=======
		
		
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
		
	}

	public void setTime(int time) {
<<<<<<< HEAD
		
		this.time = time;
				
		
=======

		this.time = time;

>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
	}

	public double getLatitude() {
		return latitude;
		
<<<<<<< HEAD
=======
		return latitude;
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
		
	}

	public void setLatitude(double latitude) {
<<<<<<< HEAD
		
	this.latitude = latitude;
		
=======
	
		this.latitude = latitude;		
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
	}

	public double getLongitude() {
		
		return longitude;
		
	}

	public void setLongitude(double longitude) {
		
	this.longitude = longitude;
		
	}

	public double getElevation() {
		
<<<<<<< HEAD
	return elevation;
=======
		return elevation;
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
		
	}

	public void setElevation(double elevation) {
		
		this.elevation = elevation;
		
	}
	
	public String toString() {
		
		String str;
		
<<<<<<< HEAD
		str = (String.valueOf(time) + " (" + String.valueOf(latitude) + "," 
					+ String.valueOf(longitude) + ") " 
					+ String.valueOf(elevation) + "\n");
		return str;
=======
		
		
		// TODO - start

		throw new UnsupportedOperationException(TODO.method());

		// TODO - slutt
		
>>>>>>> 147aa0e49071a5a89fff5c3f0ec43b6ee48ce863
	}
}
