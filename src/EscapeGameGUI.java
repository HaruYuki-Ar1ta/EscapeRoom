import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeGameGUI {

static JFrame window;
static JPanel panel;
static JButton option1, option2, option3;
static JTextArea story;
static JTextField item1, item2, item3, location;

boolean password = false;
static String where = "center";
static String action = " ";
    public EscapeGameGUI() {

        window = new JFrame("Escape Game");
        window.setSize(600, 300);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        panel = new JPanel();
        panel.setBackground(Color.black);

        story = new JTextArea(story());
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
        item2.setBounds(113, 200, 75, 50);

        item3 = new JTextField("You have:");
        item3.setBounds(200, 200, 75, 50);

        location = new JTextField("You are currently at the: " + where);
        location.setBounds(300, 220, 200, 25);


    panel.setLayout(null);
    panel.add(story);
    panel.add(option1);
    panel.add(option2);
    panel.add(option3);
    panel.add(item1);
    panel.add(item2);
    panel.add(item3);
    panel.add(location);
    window.add(panel);

        buttonNames();
        panel.updateUI();
    }

    public static String story() {
        String plot = "";
        if (where == "center"){
            plot = "...You wake up in a (from what you can tell) abandoned building \nwith no clue how you got here. Now you need to figure out how to \nescape before something bad might happen. " ;
            plot += "\n\nYou can see a desk, a bookshelf, and a bed. Where would you \nlike to go?";



        }else if (where == "desk"){
            plot = "The desk has 1 drawer and there is a small computer on it.";
            plot += "\n\nWould you like to check the drawer, try the computer, or look \nunder the desk?";

            option1.setText("Check drawer");
            option2.setText("Try computer");
            option3.setText("Look under desk");

        }else if (where == "bookshelf"){
            plot = "There is two shelves on the bookshelf";
            plot += "\n\nWould you like to look on the 1st or the second shelf ";

            option1.setText("Top shelf");
            option2.setText("Bottom shelf");

        }else if (where == "bed") {
            plot = "There is nothing on top of the bed" + "\n\nYou can look under it or go back.";

            option1.setText("Look under");
            option2.setText("Go back");
        }
        return plot;
    }


public static void buttonNames(){
        if(where == "center"){
            option1.setText("Desk");
            option2.setText("Bookshelf");
            option3.setText("Bed");
        }else if (where == "desk"){
            option1.setText("Check Computer");
            option2.setText("Check Drawer");
            option3.setText("Check Under");
            if(action == "computer"){

            }
        }else if (where == "bookshelf"){
            option1.setText("Top Shelf");
            option2.setText("Bottom Shelf");
            panel.remove(option3);
        }else if (where == "bed"){
            option1.setText("Look under the bed");
            option2.setText("Go Back");
            panel.remove(option3);
        }
}


    private class OptionOneActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(where == "center"){
                where = "desk";
                location.setText("You are currently at: " + where);
                story.setText(story());
               buttonNames();
                if (where == "desk"){
                    action = "computer";
                    story.setText(story());
                    if (action == "computer"){
                        if (password == true){
                            story.setText("You unlocked the Computer and got the\n passcode");
                        }
                    }

                }
            }else
            panel.updateUI();
        }
    }
    private class OptionTwoActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(where == "center"){
                where = "shelf";

                buttonNames();

            }
            panel.updateUI();
        }
    }
    private class OptionThreeActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            if (where == "center"){
                where = "bed";

                buttonNames();

            }
            panel.updateUI();
        }
    }
}
