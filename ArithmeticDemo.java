public class ArithmeticDemo
{
	public static void main(String args[])
	{
		int result=1+2;
		System.out.println("1+2=" +result);
		int or_result=result;
		
		result=result-1;
		System.out.println(or_result+"-1=" +result);
		or_result=result;

		result=result*2;
		System.out.println(or_result+"*1=" +result);
		or_result=result;

		result=result/2;
		System.out.println(or_result+"-1=" +result);
		or_result=result;

		result=result+8;
		System.out.println(or_result+"+8=" +result);
		or_result=result;

		result=result%7;
		System.out.println(or_result+"%7=" +result);
		}
}