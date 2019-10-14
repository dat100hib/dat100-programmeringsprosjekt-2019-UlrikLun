package no.hvl.dat100ptc.oppgave2;
import static java.lang.Integer.parseInt;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {


	public static int toSeconds(String timestr) {
		
		String hour = timestr.substring(11,13);
		String minutt = timestr.substring(14,16);
		String sekund = timestr.substring(17,19);
		
		int hr = (parseInt(hour)*60*60);
		int min = (parseInt(minutt)*60);
		int sec = (parseInt(sekund));
		
		int secos = (hr + min + sec);
		
		return secos;
	
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, 
			String elevationStr) {
		
		GPSPoint gpspoint = new GPSPoint( toSeconds(timeStr), 
						Double.valueOf(latitudeStr),
						Double.valueOf(longitudeStr), 
						Double.valueOf(elevationStr));
		
		return gpspoint;
	}
	
	}
