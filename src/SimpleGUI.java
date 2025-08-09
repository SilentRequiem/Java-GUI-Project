import javax.swing.*; //Importing all javax tools that have to do with swing 

public class SimpleGUI {
    public static void main(String args[]) { 
//Step 1: Creating a Window

    //Create a Window (Using JFrame) Jframe ObjectName = new JFrame("Title");
    JFrame frame = new JFrame("This is my title");

    //Change the Icon of the "App" using a relative path way of doing it
    ImageIcon icon = new ImageIcon(SimpleGUI.class.getResource("/Resources/WindowIcon.png"));
    frame.setIconImage(icon.getImage());
    
    frame.setSize(300, 150); //Width x Height of the Window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make it close when trying to close
    frame.setLayout(null); //We are not using a layout helper for this, hence null
    
//Step 2: Adding Components to the Window
 
    //Text field for user
    JTextField textField = new JTextField("Type here!"); //NameOfAction ObjectName = new JTextField();
    textField.setBounds(20, 20, 150, 25); //Set the position and size of the text field (x, y, width, height)

    //Button for user to click
    JButton button = new JButton("Submit"); //NameOfAction ObjectName = new JButton();
    button.setBounds(180, 20, 90, 25);

    //Label to display text
    JLabel label = new JLabel("What's your name?"); //NameOfAction ObjectName = new JLabel();
    label.setBounds(20, 60, 250, 25);

    //Adding them!
    frame.add(textField); //Add the text field to the frame
    frame.add(button); //Add the button to the frame
    frame.add(label); //Add the label to the frame

//Step 3: Adding an action for the button
    button.addActionListener(e -> {
        String text = textField.getText(); //Get the text from the text field
        label.setText("Hello, " + text); //Set the label text to what the user typed

        if (text.isEmpty()) { //Check if the text field is empty
            label.setText("Please enter your name!"); //Set label to prompt user
        }
    });

frame.setVisible(true); //Let there be light! Allows for the user to see the window

    }
}