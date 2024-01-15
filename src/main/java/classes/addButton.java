package classes;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.BorderLayout;

public class addButton extends JPanel {
    
    private JButton addButton;
    addButton()
    {
        this.setPreferredSize(new Dimension(400,60));

        addButton = new JButton("Lets Add");
        //might remove this
        //addButton.setBorder(getBorder());
        addButton.setFont(new Font("Sans-serif", Font.ITALIC,10));
        this.add(addButton);
    }
    
    public JButton getAddButton(){
        return addButton;
    }
}
