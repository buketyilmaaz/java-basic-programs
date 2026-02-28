
import javax.swing.JOptionPane;

public class DolapProblemi {
    public static void main(String[] args) {

        boolean[] dolap = new boolean[21]; 
        for (int ogr = 1; ogr <= 20; ogr++) {
            for (int d = ogr; d <= 20; d += ogr) {
                dolap[d] = !dolap[d]; 
            }
        }

        StringBuilder acikDolaplar = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            if (dolap[i]) acikDolaplar.append("L").append(i).append(" ");
        }

        JOptionPane.showMessageDialog(
                null,
                "Açık dolaplar:\n" + acikDolaplar.toString()
        );
    }
}


