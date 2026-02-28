
import java.util.Scanner;
import javax.swing.JOptionPane;
public class GuessGame {
	public static void main(String[] args) {
	int emb=Integer.parseInt(JOptionPane.showInputDialog("MERHABA\n"
			+ "SİFRENİZİ BELİRLEYİNİZ: "));
	int hak=5;
	int pass;
	while(hak>0) {
		pass=Integer.parseInt(JOptionPane.showInputDialog("tahmininizi giriniz:"));
		if(pass==emb) {
			JOptionPane.showMessageDialog(null, "TEBRİKLER GİRİŞ BAŞARILI ");
			break;
		}
		else {
			hak--;
			JOptionPane.showMessageDialog(null,"Kalan deneme sayısı:"+hak,null, JOptionPane.WARNING_MESSAGE);
		}
		if(hak==0) {
			JOptionPane.showMessageDialog(null, "Kalan denme sayısı:"+hak+"\nGiriş başaraısız",null, JOptionPane.WARNING_MESSAGE);
		}
	}
	}
	

}



