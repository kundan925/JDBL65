import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(2,5,7,9,11,15,16,7,24,15);
		System.out.println(number.stream().count());
		
		List<Integer> numSquare=number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(numSquare);
		
		List<Integer> disNum=number.stream().distinct().toList();
		System.out.println(disNum);
		
		List<Integer> evenNumberSquaredSorted=number.stream().filter(n->n%2==0).map(n->n*n).sorted().toList();
		System.out.println(evenNumberSquaredSorted);
		
	}

}
