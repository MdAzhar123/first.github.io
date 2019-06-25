import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		Intern i1 = (Intern) o1;
		Intern i2=(Intern) o2;
		
		if(i1.getAge()==i2.getAge())
			return 0;
		else if(i1.getAge()>i2.getAge())
			return 1;
		else
		return -1;
	}

	
	
	
}
