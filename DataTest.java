//Anum Bhamani Homework 3
import java.util.*;
public class DataTest {
	public static void main(String[] args) {
		ArrayList<data> dates = new ArrayList<data>();
		dates.add(new data(4, 13, 1743)); // Jefferson
		dates.add(new data(2, 22, 1732)); // Washington
		dates.add(new data(3, 16, 1751)); // Madison
		dates.add(new data(10, 30, 1735)); // Adams
		dates.add(new data(4, 28, 1758)); // Monroe
		System.out.println("birthdays = " + dates);
		Collections.sort(dates);
		System.out.println("birthdays = " + dates);
}
}
