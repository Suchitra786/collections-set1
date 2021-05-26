
public class CheckCaptian {
public static void main(String[] args) {
	System.out.println("***Singleton pattern***");
	System.out.println("Trying to make a captian for our team");
	BillPughMethod d1=BillPughMethod.getInstance();
	System.out.println("Trying to make another captian for our team");
	BillPughMethod d2=BillPughMethod.getInstance();
	if(d1==d2)
	{
		System.out.println("You already have captian please send him for toss");
		System.out.println("d1 and d2 are sam instance");
	}
}
}
