import java.util.List;
public class AverageListOfIntegers {
	public static int average(List<Integer> numbers)
	 {
		 Double avg = numbers.stream().mapToInt(val -> val).average().orElse(0.0);
		 return (int)Math.round(avg);
	 }


}
