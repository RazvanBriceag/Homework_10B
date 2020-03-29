import java.util.Scanner;
public class FOR {
	public static void main(String[] args) {
	double sum=0.0;
			Scanner rez=new Scanner(System.in);
			int n=rez.nextInt();
			for(int i=1; i<=n; i++) {
				sum=sum+(double)i/(i+1);
			}
System.out.println(sum);
rez.close();
	}
    
}
