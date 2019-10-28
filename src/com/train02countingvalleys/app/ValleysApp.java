package com.train02countingvalleys.app;

public class ValleysApp {

	public static void main(String[] args) {
		/*
		 * Gary is an avid hiker. He tracks his hikes meticulously, 
		 * paying close attention to small details like topography. 
		 * During his last hike he took exactly 'n' steps. For 
		 * every step he took, he noted if it was an uphill,'U', or 
		 * a downhill, 'D' step. Gary's hikes start and end at sea 
		 * level and each step up or down represents a '1' unit 
		 * change in altitude. We define the following terms:
		 * 
		 * - A mountain is a sequence of consecutive steps above sea 
		 * level, starting with a step up from sea level and ending 
		 * with a step down to sea level.
		 * 
		 * - A valley is a sequence of consecutive steps below sea 
		 * level, starting with a step down from sea level and ending 
		 * with a step up to sea level.
		 * 
		 */
		int number = 8;
		String sequence = "UDDDUDUU";
		System.out.println(countingValleys(number,sequence));
		
	}
	public static int countingValleys(int n, String s) {
        int valleys = 0;
        int altitud = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'D')
                altitud--; 
            if(s.charAt(i) == 'U'){
                if(altitud == -1)
                   valleys++;
            altitud++;
            }   
        }
        return valleys;
	}

}
