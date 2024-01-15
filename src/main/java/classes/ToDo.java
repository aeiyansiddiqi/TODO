package classes;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class ToDo extends JPanel{
    

    private JTextField name;
    //private JButton complete;

   // private boolean flag;

 ToDo(){
        this.setPreferredSize(new Dimension(25,100));

        this.setLayout(new BorderLayout());

        //flag = false;
        name = new JTextField("Enter ToDo");

        name.setBorder(BorderFactory.createEmptyBorder());
        name.setBackground(Color.WHITE);

        this.add(name, BorderLayout.CENTER);

        
    }


   
    
}
