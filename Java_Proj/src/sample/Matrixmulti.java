
package sample;

public class Matrixmulti {
public static void main(String[] args) {
	int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
	int a1[][] = {{1,1,1},{2,2,2},{3,3,3}};
	int res[][] = new int [3][3]; // another matrix to store result value
	// multiplaying and printing multiplication of two matrices
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			res[i][j]=0;
			for(int k=0;k<3;k++) {
				res [i][j]+= a[i][k]*a1[k][j];
			}// end of k loop
			System.out.print(res[i][j]+" "); // print instead of println it will print matrix element
		}//end of j loop
		System.out.println(); // for new line
	}//end of i loop
}
}
	