package Main;
import java.awt.*;
import javax.swing.*;
public class bgQR extends JPanel{
    private Image image;
    public bgQR(){
        image = new ImageIcon(getClass().getResource("image2.png")).getImage();
    }
    @Override
    protected void paintComponent (Graphics graphcs){
        super.paintComponent(graphcs);
        
        Graphics2D gd = (Graphics2D) graphcs.create();
        gd.drawImage(image, 0, 0, getWidth(), getHeight(),null);
        gd.dispose();
    }
}
