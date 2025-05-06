public class Department{
       static String  department="HR";
	String employeeName;
	
public static void main(String[] args){
	System.out.println("Department:"+Department.department);
	Department depart1 =new Department();
        Department depart2 =new Department();
	depart1.employeeName="John";
	depart2.employeeName="Alice";
		System.out.println("Employee 1:" + depart1.employeeName);
		System.out.println("Employee 2 :"+depart2.employeeName);
		System.out.println("After Modification:");
                department="Marketing";
		System.out.println("Department:"+Department.department);
		System.out.println("Employee 1:" + depart1.employeeName);
		System.out.println("Employee 2:" + depart2.employeeName);


}
}


	
