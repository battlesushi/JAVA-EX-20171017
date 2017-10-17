import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalculateFrame extends JFrame{
    private Container cp;
    JTextField jtf=new JTextField();
    public CalculateFrame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        this.setBounds(300,300,500,600);
        this.setLocationRelativeTo(null);
        cp.add(jtf,BorderLayout.NORTH);
        jtf.setHorizontalAlignment(jtf.RIGHT);
    }
}
