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

import org.w3c.dom.events.MouseEvent;

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

public class screen extends JFrame{

    private addButton addB;
    private ToDo todo;
public screen(){
        this.setSize(500,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


       
     

        // title
        JPanel Text = new JPanel();
        Text.setPreferredSize(new Dimension(500,100));
        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Sans-serif",Font.BOLD,25));
        titleText.setPreferredSize((new Dimension(200,20)));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        Text.add(titleText);
        this.add(Text,BorderLayout.NORTH);
        Text.setVisible(true);

        // Button
        addB = new addButton();
        this.add(addB,BorderLayout.SOUTH);

        // ToDo
        todo = new ToDo();
        this.add(todo,BorderLayout.EAST);


}

}
