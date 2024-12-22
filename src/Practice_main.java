import java.util.ArrayList;

public class Practice_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>array_stud=new ArrayList<>();		
		
		Student_marks std_marks=new Student_marks("92", "89", "93","95");
		
		Student_marks std_marks1=new Student_marks("95", "91", "96","97");

		
		Student std=new Student(101,"Ankush",22220136,std_marks);
		Student std1=new Student(111,"Kavya",2222045,std_marks1);

				
		Methods mt=new Methods();

		array_stud=mt.createList(array_stud,std);
		array_stud=mt.createList(array_stud,std1);

		
//		System.out.println(array_stud);
		
		for(Student student:array_stud)
		{
			System.out.println("Student Name    :"+student.getName());
			System.out.println("Student PRN     :"+student.getPrn());
			System.out.println("Student ROll No :"+student.getRoll_no());
			System.out.println("Math Marks      :"+student.getStd_marks().getMaths());
			System.out.println("English Marks   :"+student.getStd_marks().getEnglish());
			System.out.println("Marathi Marks   :"+student.getStd_marks().getMarathi());
			System.out.println("Science MArks   :"+student.getStd_marks().getScience());



		}
		
		
		
//		mt.displayData();
		
//		String St="Hello Ankush Ingale this is return function";
////		
////		String data=mt.displayData(St);
////		
////		System.out.println(data);
//		
//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("Enter your choice ");
//		
//		int ch=sc.nextInt();
//		
//		if(ch==1)
//		{
//			mt.displayData();
//		}
//		if(ch==2)
//		{
//			System.out.println(mt.displayData(St));
//		}
		
//		ArrayList<Integer> arr=new ArrayList<>();
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter two nos");
//		arr=mt.createList(arr,sc);
//		
//		System.out.println("List is : "+arr);
	}

}

