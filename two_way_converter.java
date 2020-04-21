import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Converter
{
public static void main(String args[])
{
//first window and button placements
JFrame f1=new JFrame("Lb and Kg Converter");
f1.getContentPane().setBackground(Color.yellow);
//because why not

f1.setLayout(null);

JLabel lblPound=new JLabel("Pound (lbs)");
JTextField txtPound=new JTextField();
lblPound.setBounds(50,80,100,30);
txtPound.setBounds(150,80,100,30);
f1.add(lblPound);
f1.add(txtPound);

JLabel lblKg=new JLabel("Kilo (kg)");
JTextField txtKg=new JTextField();
lblKg.setBounds(50,130,100,30);
txtKg.setBounds(150,130,100,30);
f1.add(lblKg);
f1.add(txtKg);

JButton btnConvert=new JButton("kg -> lbs");
JButton btnLbs=new JButton("lbs -> kg");
JButton btnClear=new JButton("clear");
btnConvert.setBounds(60,210,100,30);
btnLbs.setBounds(60,180,100,30);
btnClear.setBounds(160,195,80,30);
f1.add(btnConvert);
f1.add(btnLbs);
f1.add(btnClear);


//action listener 


btnLbs.addActionListener(new ActionListener() 
{	
public void actionPerformed(ActionEvent ae)
{
try
{
double pounds=Double.parseDouble(txtPound.getText());
double kg = pounds * 0.454;     //conversion factor
txtKg.setText(kg+" kg");
}
catch(Exception a)
{

JFrame f2=new JFrame("ERROR 01"); //not working idk why
f2.getContentPane().setBackground(Color.red);  //because why not
f2.setLayout(null);

JOptionPane.showMessageDialog(f2,"Error! Enter numbers only!");
txtPound.setText("0"); 
}
// trying to add another exception that will detect when the wrong conversion is selected
//think that if i set it to 0 after an error message i can then have an if statement that reads
//if lbs=0 or 
//	if (kg=0) {
//		JFrame f2=new JFrame("ERROR 03");
//		JOptionPane.showMessageDialog(f2,"Select correct conversion");
	}
//}

//maybe another fix could be having the lbs number be copied onto the kg if the return is null
});


btnConvert.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
try
{
double kg=Double.parseDouble(txtKg.getText());
double pounds = kg * 2.205;
txtPound.setText(pounds+" lbs");
}
catch(Exception a)
{
JFrame f2=new JFrame("ERROR 02");
f2.getContentPane().setBackground(Color.red);  //because why not

JOptionPane.showMessageDialog(f2,"Error! Enter numbers only!");
txtPound.setText("0"); 
}
}
});

btnClear.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
txtPound.setText("");
txtKg.setText("");
}
});

f1.setVisible(true);
f1.setSize(320,320);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setBackground(Color.yellow);  // so it wont be white then turn yellow once the frame ;pads

}
}
