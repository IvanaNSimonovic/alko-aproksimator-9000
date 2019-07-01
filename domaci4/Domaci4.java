package domaci4;

import java.util.Scanner;

public class Domaci4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bac=0;
		double mlAlc=0;
	    System.out.println("Dobrodosli u alko aproksimator 9000! \nUnesite Vasu tezinu (kg)");
		double t=sc.nextDouble();
		t=t*1000;
		System.out.println("Unesite Vas pol(M:0/Ž:1)");
		double pol=sc.nextDouble();
		if (pol==0)pol=0.68;
		else if(pol==1)pol=0.55;
		else System.err.println("Musko 0 Žensko 1");
		System.out.println("Sta ste i koliko popili(id_pica kolicina_u_ml):");
		while(true) {
		int id=sc.nextInt();
		if(id==0) {
		 double id0=sc.nextDouble();
		 double id0k=sc.nextDouble();
		 mlAlc+=id0k*id0/100;
		 continue;}
		else if (id==-1) {System.out.println("poruka "+bac);break;}
		else {
			switch(id) {
			case 1:double mlP1=sc.nextDouble();mlAlc+=mlP1*0.5; break;
			case 2:double mlP2=sc.nextDouble();mlAlc+=mlP2*0.4; break;
			case 3:double mlP3=sc.nextDouble();mlAlc+=mlP3*0.047; break;
			case 4:double mlP4=sc.nextDouble();mlAlc+=mlP4*0.11; break;
			default: System.err.println("greska");break;
			
			}
		 }
		bac=(mlAlc/(t*pol))*1000;
	  }
		}
}