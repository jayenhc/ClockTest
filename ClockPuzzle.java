public class ClockPuzzle {

	private int hours;
	private int minutes;
	
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
	
	
	
	

}
