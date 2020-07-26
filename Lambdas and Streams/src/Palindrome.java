import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static List<String> PalindromeList(List<String> listofStrings)
	{
		List<String> palindrome=new ArrayList<String>();
		listofStrings.stream().forEach(string ->{
			if(check(string))
				palindrome.add(string);
		});
		
		
		
		return palindrome;
	}

	private static boolean check(String string) {
		StringBuilder sb=new StringBuilder(string);
		sb.reverse();
		if(string.equals(sb.toString()))
			return true;
		return false;
	}
}

