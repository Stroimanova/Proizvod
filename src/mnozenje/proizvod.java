package mnozenje;
import java.util.Scanner;
public class proizvod {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
			System.out.print("Presmetaj go i ispecati go proizvodot na clenovite vo nizata");
			System.out.print("Vcitaj broj na clenovi vo niza");
			int n=input.nextInt();
			int niza[]=new int[n];
			System.out.print("Vcitaj clenovi vo niza");
			for(int i=0; i<niza.length; i++) {
				System.out.print(i+ "-->");
				niza[i]=input.nextInt(); //Vcitaj niza [i]- i-ti clen na niza
			}
			double p=1;
			for(int i=0; i<niza.length; i++) {
				p=p*niza[i];
			}
			System.out.print("p=" +p);
}
}
