import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
  
public class CandyMachine{  
JFrame f;  

int sum_candy = 0;
int kita = 0;

CandyMachine(){  
	
    f=new JFrame("Candy Machine");  
      
    JButton b1=new JButton("Candy1 || P1");  
    JButton b2=new JButton("Candy2 || P2");  
    JButton b3=new JButton("Candy3 || P3");  
    JButton b4=new JButton("Candy4 || P4");  
    JButton b5=new JButton("Candy5 || P5");  
    JButton b6=new JButton("Candy6 || P6");  
    JButton b7=new JButton("Candy7 || P7");  
    JButton b8=new JButton("Candy8 || P8");  
    JButton b9=new JButton("Candy9 || P9");
    JButton b10=new JButton("Candy10 || P10");
    JButton b11=new JButton("Candy11 || P11");  
    JButton b12=new JButton("Candy12 || P12");  
    JButton b13=new JButton("Candy13 || P13");  
    JButton b14=new JButton("Candy14 || P14");  
    JButton b15=new JButton("Candy15 || P15");  
    JButton b16=new JButton("Candy16 || P16");  
    JButton b17=new JButton("Candy17 || P17");  
    JButton b18=new JButton("Candy18 || P18");  
    JButton b19=new JButton("Candy19 || P19");
    JButton b20=new JButton("Candy20 || P20");
    JLabel l1 = new JLabel("Enter Amount of Money");
    JTextField tf1 = new JTextField();
    JLabel l2 = new JLabel("Total Price of Candies");
    JTextField tf2 = new JTextField(Integer.toString(sum_candy));
    tf2.setEditable(false);
    //JLabel sumcandy = new JLabel(Integer.toString(sum_candy));
    JButton bchange = new JButton("Change");
    JTextField tf3 = new JTextField();
    tf3.setEditable(false);
    JButton bclear = new JButton("Clear Contents");
    JTextField income = new  JTextField("    Total Kita: " + kita);
    income.setEditable(false);
    
          
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);  
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b10);
    f.add(b11);
    f.add(b12);
    f.add(b13);
    f.add(b14);
    f.add(b15);  
    f.add(b16);
    f.add(b17);
    f.add(b18);
    f.add(b19);  
    f.add(b20);
    f.add(l2);
    f.add(tf2);
    f.add(l1);
    f.add(tf1);
    f.add(bchange);
    f.add(tf3);
    f.add(bclear);
    f.add(income);
    
    f.setLayout(new GridLayout(7,4));  
    f.setSize(800,500);  
    f.setVisible(true); 
    
   
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 1;
			
			if(e.getSource()==b1)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 2;
			
			if(e.getSource()==b2)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 3;
			
			if(e.getSource()==b3)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 4;
			
			if(e.getSource()==b4)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 5;
			
			if(e.getSource()==b5)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 6;
			
			if(e.getSource()==b6)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 7;
			
			if(e.getSource()==b7)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 8;
			
			if(e.getSource()==b8)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 9;
			
			if(e.getSource()==b9)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 10;
			
			if(e.getSource()==b10)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b11.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 11;
			
			if(e.getSource()==b11)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b12.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 12;
			
			if(e.getSource()==b12)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b13.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 13;
			
			if(e.getSource()==b13)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b14.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 14;
			
			if(e.getSource()==b14)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b15.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 15;
			
			if(e.getSource()==b15)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b16.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 16;
			
			if(e.getSource()==b16)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 17;
			
			if(e.getSource()==b17)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b18.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 18;
			
			if(e.getSource()==b18)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b19.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 19;
			
			if(e.getSource()==b19)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	b20.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sum_candy = Integer.valueOf(tf2.getText()) + 20;
			
			if(e.getSource()==b20)
				tf2.setText(Integer.toString(sum_candy));
		}
	});
	
	bchange.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tf1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(f,"Please Put Amount of Money","Empty Amount of Money",JOptionPane.ERROR_MESSAGE);
			}
			else {
				
				if(Integer.valueOf(tf1.getText()) < Integer.valueOf(tf2.getText())) {
					JOptionPane.showMessageDialog(f,"BAWAL NA UTANG NGAYON!","WAG KANG BURAOT",JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					int change = Integer.valueOf(tf1.getText()) - Integer.valueOf(tf2.getText());
					
					if(e.getSource()==bchange)
						tf3.setText(Integer.toString(change));
				}
				
				
			}
			
		}
	});
	
	bclear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			kita = kita + Integer.valueOf(tf2.getText());
			
			
			if(e.getSource()==bclear) {
				income.setText("    Total kita: " + Integer.toString(kita));
			}
			
			tf1.setText("");
			tf2.setText("0");
			tf3.setText("");
			sum_candy = 0;

		}
		
	});
}  


public static void main(String[] args) {  
    new CandyMachine(); 
    
}  
}  