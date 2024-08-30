import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> country=Arrays.asList("India","USA","UK","England");
		country.stream().filter(a->a.startsWith("U")).forEach(System.out::println);
		
		country.stream().filter(a->startsWithTest(a,"U")).forEach(s->System.out.println(s));
		
		Optional<String> teString=country.stream().reduce((s1,s2)->s1+"-"+s2);
		System.out.println(teString.get());
		
		String test=country.stream().reduce("Hey", (s1,s2)->s1+"-"+s2);
		System.out.println(test);
	}
		
		
		
		public static boolean startsWithTest(String a,String startWith) {
			return a.startsWith(startWith);
		}
	

}
