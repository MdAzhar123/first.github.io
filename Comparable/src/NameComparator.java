import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Intern i1=(Intern)o1;
		Intern i2=(Intern)o2;
		return i1.getName().compareTo(i2.getName());
	}

}
