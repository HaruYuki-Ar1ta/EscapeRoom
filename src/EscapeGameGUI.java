import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeGameGUI {

JFrame window;
JPanel panel;
JButton option1, option2, option3;
JTextArea story;
JTextField item1, item2, item3;

static String where = "center";

    public EscapeGameGUI(){
        window = new JFrame("Escape Game");
        window.setSize(600, 300);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        panel = new EscapeRoomPanel();

        story = new JTextArea("This is where the story goes");
        story.setBounds(25, 25, 350, 150);

        option1 = new JButton("Option1: ");
        option1.addActionListener(new OptionOneActionListener());
        option1.setBounds(400, 30, 150, 25);

        option2 = new JButton("Option2: ");
        option2.addActionListener(new OptionTwoActionListener());
        option2.setBounds(400, 80, 150, 25);

        option3 = new JButton("Option3: ");
        option3.addActionListener(new OptionThreeActionListener());
        option3.setBounds(400, 130, 150, 25);

        item1 = new JTextField("You have:");
        item1.setBounds(25, 200, 75, 50);

        item2 = new JTextField("You have:");
        item2.setBounds(100, 200, 75, 50);

        item3 = new JTextField("You have:");
        item3.setBounds(150, 200, 75, 50);

    panel.setLayout(null);
    panel.add(story);
    panel.add(option1);
    panel.add(option2);
    panel.add(option3);
    panel.add(item1);
    panel.add(item2);
    panel.add(item3);
    window.add(panel);
    }

    public class EscapeRoomPanel extends JPanel{
        public EscapeRoomPanel(){
            setBackground(Color.black);
        }

    public void paintComponent(Graphics g){
            super.paintComponent(g);

        }
    }
    private class OptionOneActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(where == "center "){

            }
        }
    }
    private class OptionTwoActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(where == "center "){

            }
        }
    }
    private class OptionThreeActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            if (where == "center ");
        }
    }
}
