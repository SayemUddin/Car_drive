import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image backgroundImage;
    Board(){
        ImageIcon imageIcon1 = new ImageIcon("background.png");
        backgroundImage = imageIcon1.getImage();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(backgroundImage,0,0,this);
    }
}
