public class ClockPuzzle {

	private int hours;
	private int minutes;
	private final double TOTALDEGREE=360.00;
	
	public String getTime(){
		StringBuilder sb = new StringBuilder();
		sb.append(hours);
		sb.append(":");
		sb.append(minutes);
		
		printTime(sb.toString());
		return sb.toString();
	}
	
	private void printTime(String time){
		System.out.println("time = " + time);
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
	/**
	 * calculate the angle 
	 * @return clock angle
	 */
	public double getClockAngle(){
		//assumption time is in 12 hours format
		double angle =0.0;
		
		if(hours<= 12 && hours >=0){
			//hours are valid
			if(minutes<=59 && minutes>=0){
				//minutes are valid
				double minDegree = minutes * (TOTALDEGREE/60);
				double hourDegree = ( hours * (TOTALDEGREE/12) )+ (minutes * 0.5); //30/60 =0.5
				angle = 360 - Math.abs(hourDegree - minDegree);
			}
		} else{
			System.out.println(" Time is not correct");
			angle = -1;
		}
		return angle;
		
	}
	
	

}
