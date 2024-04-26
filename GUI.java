import javax.swing.*;
// import javax.swing.BorderFactory;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// this is getting ridiculous

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.Window;

public class GUI implements ActionListener{

    public enum windowState{
        INICIO,
        INGAME,
        POSTGAME
    }
    private JLabel label;
    private JFrame frame, ingameFrame;
    private JPanel panel;
    private JLabel userLabel;
    private windowState currentWindow = windowState.INICIO;

    public GUI(){
        switch(currentWindow){
            case INICIO:
                // Create a new frame
                frame = new JFrame();
                        
                // Create a new panel
                panel = new JPanel();
                panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
                panel.setLayout(new GridLayout(0, 2));

                // Nickname field
                userLabel = new JLabel("Nickname: ");
                userLabel.setBounds(10, 20, 80, 25);
                panel.add(userLabel);

                // Text fields
                JTextField userText = new JTextField(20);
                userText.setBounds(100, 20, 165, 25);
                panel.add(userText);

                // Create a button
                JButton button = new JButton("Jogar");
                button.addActionListener(this);
                panel.add(button);

                // Frame settings
                frame.add(panel, BorderLayout.CENTER);
                frame.setSize(350, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Batalha Javal");
                frame.pack();
                frame.setVisible(true);
                break;
            
            case INGAME:
                System.out.println("case ingame");
                ingameFrame = new JFrame();
                ingameFrame.setTitle("NIGGA BALLS");
                ingameFrame.add(panel, BorderLayout.CENTER);
                ingameFrame.setSize(350, 200);
                ingameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ingameFrame.pack();
                ingameFrame.setVisible(true);
                break;
            
            case POSTGAME:
                break;
            
            default:
                // default case
        }
        
    }
    
    // Methods
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(getCurrentWindow());
        setCurrentWindow(windowState.INGAME);
        System.out.println(getCurrentWindow());
    }

    public void setCurrentWindow(windowState window){
        this.currentWindow = window;
    }

    public windowState getCurrentWindow(){
        return this.currentWindow;
    }
}
