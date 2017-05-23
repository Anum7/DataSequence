//Anum Bhamani Homework 3
public class data implements Comparable <data>{
	private int year;
	private int month;
	private int day;
	
	public data(int month, int day, int year){
		this.year= year;
		this.month= month;
		this.day= day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public String toString(){
		return getMonth()+"/" + getDay()+ "/" + getYear();
	}
	public int compareTo(data a){
		if(year != a.year){
		return year - a.year;
		}else if (month != a.month){
			return month - a.month;
		}else {
			return day - a.day;
		}
		}
	}
			 
		 
	



