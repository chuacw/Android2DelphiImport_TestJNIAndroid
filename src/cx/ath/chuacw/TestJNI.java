package cx.ath.chuacw;

public class TestJNI {

	int A, B, C, D;
	
   public void A1(int A, int B, int C, int D) {
	   System.out.println("In A1");
	   System.out.println(A);
	   System.out.println(B);
	   System.out.println(C);
	   System.out.println(D);
   }
   
   public void setParams(int A, int B, int C, int D) {
	   System.out.println("setting params");
	   this.A = A;
	   this.B = B;
	   this.C = C;
	   this.D = D;
   }
   
   public void showSelf() {
	   System.out.println("Showing self");
	   System.out.println(A);
	   System.out.println(B);
	   System.out.println(C);
	   System.out.println(D);
   }
   
   public static void main(String[] args) {
	   System.out.println("args length: "+args.length);
	   if (args.length>0) {
		   for (int i=0;i<args.length;i++)
			   System.out.println(String.format("args %d: '%s'", new Object[]{i, args[i]}));
	   }
	   TestJNI t = new TestJNI();
	   t.A1(0x1000, 0x2000, 0x3000, 0x4000);
	   t.setParams(0x1000, 0x2000, 0x3000, 0x4000);
	   t.showSelf();
   }
   
}
