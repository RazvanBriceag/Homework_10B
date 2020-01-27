import java.util.Scanner;
public class problema2 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int a=br.nextInt();
		int b=br.nextInt();
		double c=Math.sqrt(a*a+b*b);
		System.out.println("Ipotenuza este egala cu " +c);
		br.close();
	}

}
