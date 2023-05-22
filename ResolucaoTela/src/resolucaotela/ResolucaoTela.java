
package resolucaotela;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    
    public static void main(String[] args) {
       Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
       int largura = (int)size.getWidth();
       int altura = (int)size.getHeight();
       
        System.out.println("sua resoluçao de tela é de :"
        +" " + largura
        +" "+ altura);
    }
    
}
