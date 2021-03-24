package ArrayNString;

public class TwodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] [] = new int [3] [2];
		 //int a[] [] = { {100,200} , {300,400} ,{500,600}}; one way of initialisaion
		a[0] [0] = 100;
		a[0] [1] = 200;
		a [1] [0] = 300;
		a[1] [1] = 400;
		a[2] [0] = 500;
		a[2] [1] = 600;
		System.out.println("no.of rows=" +a.length);
		System.out.println("no.of coloumns="+a[0].length);
		 /*for (i=0;i<=a.length;i++)
		 {
			 for(j=0;i<=a[i].length;j++)
			 {
				 System.out.println(a[i][j]);
			 }
		 }*/
		for(int r[]:a)
		{
			for(int i:r)
			{
			System.out.println(i);
		}
		
		}

	}

}
