package streamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenInteger {
	public static void main(String[] args) {
	List<Integer> NumberList= Arrays.asList(10,25,34,45,10,30,15,30,35,45,50,51);
	List<Integer> evenNumberList= new ArrayList<>();
	evenNumberList=NumberList.stream().filter(i->i%2==0).distinct().collect(Collectors.toList());
	System.out.println(evenNumberList);
	long count=NumberList.stream().filter(i->i%2==0).distinct().count();
	System.out.println(count);
	Optional<Integer> max=NumberList.stream().max((I1,I2)->{return I1.compareTo(I2);});
	System.out.println("maximum value= "+max.get());
	Optional<Integer> min= NumberList.stream().min((I1,I2)->{return I1.compareTo(I2);});
	System.out.println("minimunm value= " +min.get());
	//Optional<Integer> sortOptional=sorNumberList.stream().
	//NumberList.stream().filter(i->i%2==0).forEach(System.out::println);
	//NumberList.stream().filter(i->i%2==0).forEach(n->System.out.println(n));
	}

}
