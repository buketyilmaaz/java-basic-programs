import javax.swing.JOptionPane;

public class TCKimKontrol {
	public static void main(String[] args) {
		String tc=JOptionPane.showInputDialog("TC kimlik numarasını giriniz");
		if (tc == null) return; 

        if (tc.length() != 11 || tc.charAt(0) == '0') {
            JOptionPane.showMessageDialog(null, "Geçersiz TC");
            return;
        }

        int[] d = new int[11];
        for (int i = 0; i < 11; i++) d[i] = tc.charAt(i) - '0';

        int tek = d[0] + d[2] + d[4] + d[6] + d[8];
        int cift = d[1] + d[3] + d[5] + d[7];
        int h10 = ((tek * 7) - cift) % 10;

        int toplam = 0;
        for (int i = 0; i < 10; i++) toplam += d[i];
        int h11 = toplam % 10;

        if (h10 == d[9] && h11 == d[10])
            JOptionPane.showMessageDialog(null, "TC Kimlik Numarası GEÇERLİ");
        else
            JOptionPane.showMessageDialog(null, "TC Kimlik Numarası GEÇERSİZ");
        }
	}
