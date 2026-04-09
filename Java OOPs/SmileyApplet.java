import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<!DOCTYPE html>
<html>
<head>
    <title>Smiley Applet</title>
</head>
<body>
    <applet code="SmileyApplet.class" width="300" height="200"></applet>
</body>
</html> */
public class SmileyApplet extends Applet implements ActionListener {
    private TextField nameField;
    private Button submitButton;
    private String userName;

    public void init() {
        // Create and add components
        Label nameLabel = new Label("Enter your name:");
        nameField = new TextField(20);
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(nameLabel);
        add(nameField);
        add(submitButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Get the user's name from the text field
            userName = nameField.getText();

            // Repaint the applet to draw the smiley face
            repaint();

            // Display the welcome message
            showStatus("Welcome, " + userName + "!");
        }
    }

    public void paint(Graphics g) {
        // Draw a smiley face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100); // Head
        g.setColor(Color.BLACK);
        g.drawArc(75, 80, 50, 40, 180, -180); // Smile
        g.fillOval(80, 70, 10, 10); // Left eye
        g.fillOval(110, 70, 10, 10); // Right eye
    }
}