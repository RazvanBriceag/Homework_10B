import java.util.Scanner;
public class BriceagRazvanSiPaola {
	public static void main(String[] args) {
		Scanner rp=new Scanner(System.in);
		System.out.println("Introduceti orele:");
		int h= rp.nextInt();
		System.out.println("Introduceti minutele: ");
		int min= rp.nextInt();
		
		int tot=(h*60) + min;
		System.out.println("Timpul in min=" + tot + "min");
	}

}
