import java.util.ArrayList;

public class Methods {
		
	public void displayData()
	{
		System.out.println("Hello Ankush Welcome to JAva Again");
	}
	public String displayData(String data)
	{
		return data;
	}
	
	
	public ArrayList<Student> createList(ArrayList<Student> array_std,Student std)
	{

		array_std.add(std);
		
		return array_std;
	}
}
