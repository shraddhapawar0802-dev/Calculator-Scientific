import javax.swing.*;
import java.awt.event.*;

class Calculator_Scientific
{
    static double num1,num2, result;
    static String op;

    public static void main(String [] args)
    {
        JFrame f = new JFrame("Calculator-Scientific");
        f.setLayout(null);
        JTextField t = new JTextField();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("X");
        JButton div = new JButton("/");
        JButton eq = new JButton("=");

        JButton sqrt = new JButton("√");
        JButton sq = new JButton("x²");
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton clr = new JButton("clear");
        JButton back = new JButton("⌫");
        back.setBounds(210,330,60,40);
        f.add(back);
        JLabel l =new JLabel();
        l.setBounds(30,0,260,20);
        f.add(l);

        t.setBounds(30,20,260,40);
        b1.setBounds(30,180,50,40);
        b2.setBounds(90,180,50,40);
        b3.setBounds(150,180,50,40);
        b4.setBounds(30,130,50,40);
        b5.setBounds(90,130,50,40);
        b6.setBounds(150,130,50,40);
        b7.setBounds(30,80,50,40);
        b8.setBounds(90,80,50,40);
        b9.setBounds(150,80,50,40);
        b0.setBounds(30,230,50,40);
        add.setBounds(150,230,50,40);
        sub.setBounds(210,180,50,40);
        mul.setBounds(210,130,50,40);
        div.setBounds(210,80,50,40);
        eq.setBounds(90,230,50,40);
        clr.setBounds(210,230,65,40);
        sin.setBounds(150,280,60,40);
        cos.setBounds(210,280,60,40);
        tan.setBounds(30,330,60,40);
        sqrt.setBounds(30,280,50,40);
        sq.setBounds(90,280,50,40);

         f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(eq);
        f.add(clr);
        f.add(sin);
        f.add(cos);
        f.add(tan);
        f.add(sqrt);
        f.add(sq);

        back.addActionListener(e->{
            String text = t.getText();
            if(!text.isEmpty())
            {
                t.setText(text.substring(0,text.length()-1));
            }
        });
         ActionListener num = e -> t.setText(t.getText() + ((JButton)e.getSource()).getText());
         b1.addActionListener(num);
         b2.addActionListener(num);
         b3.addActionListener(num);
         b4.addActionListener(num);
         b5.addActionListener(num);
         b6.addActionListener(num);
         b7.addActionListener(num);
         b8.addActionListener(num);
         b9.addActionListener(num);
         b0.addActionListener(num);
        
         add.addActionListener(e ->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
             num1 = Double.parseDouble(t.getText()); 
             op = "+"; 
             l.setText(num1+"+");
             t.setText("");
            });
        sub.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            num1 = Double.parseDouble(t.getText()); 
            op = "-"; 
           l.setText(num1+"-");
            t.setText("");
        });
        mul.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            num1 = Double.parseDouble(t.getText()); 
            op = "X"; 
            l.setText(num1+"X");
             t.setText("");
        });
        div.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            num1 = Double.parseDouble(t.getText()); 
            op = "/"; 
            l.setText(num1+"/");
            t.setText("");
        });
        eq.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            else if(op==null)
            {
                JOptionPane.showMessageDialog(f,"Select an operation!");
            }
            num2=Double.parseDouble(t.getText());
            switch(op){
                case "+": result = num1+num2;
                break;
                case "-": result = num1-num2;
                break;
                case "X": result = num1*num2;
                break;
                case "/": 
                if(num2==0)
                {
                    JOptionPane.showMessageDialog(f,"Cannt divide by 0!");
                }
                result = num1/num2;
                break;
            }
            t.setText(String.valueOf(result));
            l.setText("");
        });

        sqrt.addActionListener(e->{
            double n = Double.parseDouble(t.getText());
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            else if(n<0)
            {
                JOptionPane.showMessageDialog(f,"Can't find sqrt of -ve!");
            }
            
            t.setText(String.valueOf(Math.sqrt(n)));
        });
        sq.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            double n = Double.parseDouble(t.getText());
            t.setText(String.valueOf(n*n));
        });
        sin.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            double n= Double.parseDouble(t.getText());
            t.setText(String.valueOf(Math.sin(Math.toRadians(n))));
        });
        cos.addActionListener(e->{
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            double n= Double.parseDouble(t.getText());
            t.setText(String.valueOf(Math.cos(Math.toRadians(n))));
        });
        tan.addActionListener(e->{
            double n= Double.parseDouble(t.getText());
            if(t.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(f,"Enter a number!");
            }
            else if(n==90)
            {
                JOptionPane.showMessageDialog(f,"tan(90) is undefined!");
            }
            
            t.setText(String.valueOf(Math.tan(Math.toRadians(n))));
        });
        clr.addActionListener(e->{
            t.setText("");
            l.setText("");
             double num1,num2=0;
            op = null;
        });
        f.setSize(320,450);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
