package accessmodifier;


  // private  >> applicable for methods and variables, if we want to make it completely secure
	/*class A
	{
		private int data = 10;
		private void m1() {}
	}
	public class PrivateNDefault {
		public static void main(String[] args) {
			A aobj = new A();
			aobj.data=20; // compile error since data is private
			aobj.m1(); // compile error method is private
			}
}*/

	// default>> donot specific any other modifier it will be treated as default, accesabile only with in the package
	class A
	{
		int data =10;
		void m1() {
			System.out.println(data);
		}
	}
	public class PrivateNDefault {
		public static void main(String[] args) {
			A obj = new A();
			obj.data = 20;
			obj.m1();
		}
	}