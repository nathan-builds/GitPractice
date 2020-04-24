
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frame extends JFrame implements ActionListener {

    private Toolbar toolbar;
    private JTextArea textArea;
    private TextPanel textPanel;
    private JButton mainButton;

    public Frame() {
        super("Hello!");
      

        setSize(600, 400);
        setLayout(new BorderLayout());

       textPanel= new TextPanel();
       add(textPanel, BorderLayout.CENTER);
        
        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);
        toolbar.setTextPanel(textPanel);
        
        mainButton= new JButton("Press!");
        add(mainButton,BorderLayout.SOUTH);
        mainButton.addActionListener(this);
        
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        textPanel.appendText();
       
    }
    
    
  

}
