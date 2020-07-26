import java.util.ArrayList;
import java.util.List;

	public class ThreeLetterWordStartsWitha {

		public static List<String> word(List<String> s)
		{
			List<String> res=new ArrayList<String>();
			s.stream().forEach(str->{
				if(str.length()==3 && str.charAt(0)=='a')
					res.add(str);
			});
			return res;
		}
	}

