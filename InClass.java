
import java.swing.*;
import java.awt.*;
import java.awt.event.*;

Public class GUI extends JFrame
{
	JPanel myPanel;
	JButton okButton, cxlButton, clearButton, add;
	JLabel myLabel, textField1, textField2;
	JTextField inputField, num1, num2;
	Public static void main(String[] args)
	{
		GUI window = new GUI();
		window.setTitle(“My first App”);
		window.setSize(1000, 200);

		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	Public GUI()
	{
	 	myPanel = new JPanel();
		add(myPanel);
        okButton = new JButton("OK");
        cxlButton = new JButton("Cancel");
        clearButton = new JButton("Clear");
        add = new JButton("Add");

        myPanel.add(okButton);
        myPanel.add(cxlButton);
        myPanel.add(clearButton);
        myPanel.add(add);

        myLabel = new JLabel("enter some text: ");
        myPanel.add(myLabel);
        inputField = new JTextField("Text?");
        myPanel.add(inputField);

        textField1 = new JLabel("text field 1");
        myPanel.add(textField1);
        num1 = new JTextField("text field");
        myPanel.add(num1);

        textField2 = new JLabel("text field 2");
        myPanel.add(textField2);
        num2 = new JTextField("text field");
        myPanel.add(num2);
       
        okButton.addActionListener(this);
        cxlButton.addActionListener(this);
        clearButton.addActionListener(this);
	}

    @Override
    publid void actionPerdormed(ActionEvent e)
    {
        if(e.getSource() == okButton)
        {
            inputField.setText("OK Button is pressed!");
        }
        else if(e.getSource() == cxlButton)
        {
            inputField.setText("Cancel Button is pressed!");
        }
         else if(e.getSource() == clearButton)
        {
            inputField.setText("");
        }

        int num1 = Interger.parseInt(textfield.getText());
        int num2 = Interger.parseInt(textfield.getText());
        
        int sum = num1 + num2;
        else if(e.getSource() == add)
        {
            inputField.setText(sum);
        }
    }
}