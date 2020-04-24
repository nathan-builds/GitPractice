
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
//nate was here 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nathan
 */
public class Toolbar extends JPanel implements ActionListener {

    private JButton win;
    private JButton loose;
    private TextPanel textPanel;

    public Toolbar() {
        super(new FlowLayout());
        
        

        win = new JButton("win");
        loose = new JButton("loose");
        this.add(win);
        this.add(loose);
        
        win.addActionListener(this);
        loose.addActionListener(this);
        
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       JButton clicked =(JButton)e.getSource();
       
       if (clicked== win){
           textPanel.appendText("We Won!");
       }
        
       else{
           textPanel.appendText("We lost!");
       }
        
        
    }
    
    public void setTextPanel(TextPanel textPanel){
        this.textPanel=textPanel;
    }
    

}
