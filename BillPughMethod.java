
public class BillPughMethod {
private BillPughMethod()
{
	System.out.println("New captian selected for our team");
}
private static class BillPughSingletone
{
   private static final INSTANCE=new BillPughMethod();
}
public static BillPughMethod getInstance()
{
	return BillPughSingletone.INSTANCE;
}
}
