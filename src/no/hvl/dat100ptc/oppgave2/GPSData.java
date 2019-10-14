package no.hvl.dat100ptc.oppgave2;


import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int antall) {

		this.gpspoints= new GPSPoint[antall]; 
		
		
	}

	public GPSPoint[] getGPSPoints() {
		
		
		
		
		return this.gpspoints;
		
		
		
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		if(antall < gpspoints.length) {
		
		this.gpspoints[this.antall] = gpspoint;
		this.antall += 1;		
		
		return true;
	}
		
	
		return false;
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

	

		GPSDataConverter converter = new GPSDataConverter();
		GPSPoint newpoint = converter.convert(time,latitude,longitude,elevation);
		
		return insertGPS(newpoint);
		
		
		
		
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		for(int i = 0; i < antall; i++) {
			
			System.out.println( gpspoints[i].toString());
			//toString()
		}
		
		 System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
