package sample;

public class GraNSmall {

	public static void main(String[] args) {
		int a[] = new int []  { 74,7,83,76,84,100,45,73};
		int gra = a[0];
		int sma = a[0];
		for (int i=0; i<a.length;i++)
		{
			if(a[i]>gra)
			{
				gra = a[i];
				
			}
			if(a[i]<sma)
			{
				sma=a[i];
				
			}
			
		}
		System.out.println("gratest number is"+ gra);
		System.out.println("smallestnumber is"+ sma);
	}

}
