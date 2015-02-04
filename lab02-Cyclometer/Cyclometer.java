////////////////////////////////////////////////////////////////////////////////
// Alex Biester
// 1/30/15
// CSE2 Section 012
//
// 
// Program will:
// 1. print the number of minutes for each trip
// 2. print the number of counts for each tirp
// 3. print the distance of each trip in miles
// 4. print the distance for the two trips combined
//
    // add class
public class Cyclometer {
    // add main method
    public static void main (String[] args) {
        //place everything in between main method brackets
        int secsTrip1=480;  //number of seconds of Trip 1
       	int secsTrip2=3220;  //number of seconds of Trip 2
		int countsTrip1=1561;  //rotation count for Trip 1
		int countsTrip2=9037; //rotation count for Trip 2
        
        double wheelDiameter=27.0,  //diameter of the wheel of the bike
     PI=3.14159, //pi
    feetPerMile=5280,  //feet per mile
  	inchesPerFoot=12,   //inches per foot
  	secondsPerMinute=60;  //seconds per minute
  	
  	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
    // Trip 1 took 8.0 minutes and had 1561 counts
    // Trip 2 took 53.666666666666664 minutes and had 9037 counts
    // Above is listing the time and number of wheel rotations for each bicycle trip
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//for each count, a rotation of the wheel travels the diameter in inches times PI
    	
float distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles
float distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
float totalDistance=distanceTrip1+distanceTrip2;
 
 

    }   // end of main method
}   // end of class

