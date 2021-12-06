import javax.swing.*;
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
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        panel = new EscapeRoomPanel();

        option1 = new JButton("Option1: ");
        option1.addActionListener(new OptionOneActionListener());

        option2 = new JButton("Option2: ");
        option2.addActionListener(new OptionTwoActionListener());

        option3 = new JButton("Option3: ");
        option3.addActionListener(new OptionThreeActionListener());


    panel.add(option1);
    panel.add(option2);
    panel.add(option3);
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
