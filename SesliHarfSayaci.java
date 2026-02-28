package ödev1;

import java.util.Scanner;

public class SesliHarfSayaci {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz: ");
		String kelime=input.next();
		System.out.println("Sesli harf sayiyi= "+SesliHarf(kelime));
	}
public static int SesliHarf(String x){
	String Sesliler="aeouüıiöAEOUÜÖIİ";
	int sesliSayisi=0;
	for(int i=0; i<x.length(); i++) {
		if(Sesliler.indexOf(x.charAt(i))!=-1) {
			sesliSayisi++;
		}
	}
	return sesliSayisi;
	
}

}
