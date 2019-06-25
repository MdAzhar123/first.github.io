
public class Intern implements Comparable<Intern> {

	private int id;
	private String name;
	private String batch;
	private int age;
	private String technology;
	static int counter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Intern(String name, String batch, int age, String technology) {
		super();
		id=++counter;
		this.name = name;
		this.batch = batch;
		this.age = age;
		this.technology = technology;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int compareTo(Intern i)
	{
		int n=name.compareTo(i.name);
		if(n==0)
			return 0;
		else if(n>0)
			return 1;
		else
			return -1;
	}
	
	
	
}
