package tr.edu.medipol.yazilimaraclari.metekarahan;

import java.util.Scanner;

public class MuhasebeProgrami {

	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Calisilan saat giriniz : ");
        int calisilanSaat = scan.nextInt();

        System.out.println("Saatlik ucreti giriniz: ");
        int saatlikucret = scan.nextInt();

        System.out.println("Ucret : " + (calisilanSaat * saatlikucret));
       

	}
	
	
	public static Ucret ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return new Ucret(calisilanSaat, saatlikUcret);
	}

	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		@Override
		public String toString() {
			return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
		}
	}

}
