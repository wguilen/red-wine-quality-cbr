package app.util;

import javax.swing.ImageIcon;

public class ImageUtil 
{
    
    public ImageIcon loadIcon(String path)
    {
        return new ImageIcon(getClass().getResource("/app/view/assets/" + path));
    }
    
}
