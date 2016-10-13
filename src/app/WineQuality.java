/**
    http://revistaadega.uol.com.br/artigo/a-importancia-do-ph-no-vinho_1552.html
    http://www.inmetro.gov.br/consumidor/produtos/vinho.pdf
    http://www.scielo.br/pdf/pab/v43n7/16.pdf
 */

package app;

import app.view.MainWindow;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WineQuality 
{

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            try
            {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {}
            
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
        });
    }
    
}
