package method.overriding; // rewrite the method in child class 1>> method definition should be same, 2>> body should be changed
class Banking
{
	double rateofinterest()
	{
		return 0;
	}
}

class SBI extends Banking
{
	double rateofinterest()
	{
		return 8.9;
	}
}

class ICICI extends Banking
{
	double rateofinterest()
	{
		return 8.3;
	}
}

class PNB extends Banking
{
	double rateofinterest()
	{
		return 8.1;
	}
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI sbi = new SBI();
System.out.println(sbi.rateofinterest());
ICICI icici= new ICICI();
System.out.println(icici.rateofinterest());
PNB pnb = new PNB();
System.out.println(pnb.rateofinterest());
}
}