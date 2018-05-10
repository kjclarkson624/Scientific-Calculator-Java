import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
public class KRScientificCalculator extends JFrame implements ActionListener {

	private double temp, temp1, result, a;

	private static double m1, m2;

	private int k = 1, x = 0, y = 0, z = 0;

	private char ch;
	
	private JPanel textpanel, buttonpanel;
	
	JTextField textfield;

	private JButton one, two, three, four, five, six, seven, eight, nine, zero, 
					clear,squared, exponent,factorial, 
					plus, minus, division, log, rec, multiply, equals, addSubtract, 
					dot, mr, mc, mp,
					mm, sqrt, cubed, thirdpow,
					sine, cosine, tangent;

	Container cont;
	

	KRScientificCalculator() {

	  cont = getContentPane();
	  cont.setLayout(new BorderLayout());

	  JPanel textpanel = new JPanel();

	  textfield = new JTextField(30);
	  textfield.setHorizontalAlignment(SwingConstants.CENTER);
	  textfield.addKeyListener(new KeyAdapter() {
	    public void keyTyped(KeyEvent keyevent) {

	      char c = keyevent.getKeyChar(); 
         
         if (c >= '0' && c <= '9') {

	      } else {
	        keyevent.consume();
	      }
	  }
	});

	  textpanel.add(textfield);

	  buttonpanel = new JPanel();
	  buttonpanel.setLayout(new GridLayout(8, 5, 2, 2));

	  boolean t = true;
	  
	  mr = new JButton("MR");
	  buttonpanel.add(mr);
	  mr.addActionListener(this);

	  mc = new JButton("MC");
	  buttonpanel.add(mc);
	  mc.addActionListener(this);

	  mp = new JButton("M+");
	  buttonpanel.add(mp);
	  mp.addActionListener(this);

	  mm = new JButton("M-");
	  buttonpanel.add(mm);
	  mm.addActionListener(this);
	  
	  one = new JButton("1");
	  buttonpanel.add(one);
	  one.addActionListener(this);

	  two = new JButton("2");
	  buttonpanel.add(two);
	  two.addActionListener(this);

	  three = new JButton("3");
	  buttonpanel.add(three);
	  three.addActionListener(this);

	  plus = new JButton("+");
	  buttonpanel.add(plus);
	  plus.addActionListener(this);
	  
	  four = new JButton("4");
	  buttonpanel.add(four);
	  four.addActionListener(this);

	  five = new JButton("5");
	  buttonpanel.add(five);
	  five.addActionListener(this);

	  six = new JButton("6");
	  buttonpanel.add(six);
	  six.addActionListener(this);
	  
	  minus = new JButton("-");
	  buttonpanel.add(minus);
	  minus.addActionListener(this);

	  seven = new JButton("7");
	  buttonpanel.add(seven);
	  seven.addActionListener(this);

	  eight = new JButton("8");
	  buttonpanel.add(eight);
	  eight.addActionListener(this);

	  nine = new JButton("9");
	  buttonpanel.add(nine);
	  nine.addActionListener(this);

	  multiply = new JButton("X");
	  buttonpanel.add(multiply);
	  multiply.addActionListener(this);
	  
	  zero = new JButton("0");
	  buttonpanel.add(zero);
	  zero.addActionListener(this);
	  
	  dot = new JButton(".");
	  buttonpanel.add(dot);
	  dot.addActionListener(this);

	  addSubtract = new JButton("+/-");
	  buttonpanel.add(addSubtract);
	  addSubtract.addActionListener(this);
	  
	  division = new JButton("/");
	  division.addActionListener(this);
	  buttonpanel.add(division);

	  sqrt = new JButton("SQRT");
	  buttonpanel.add(sqrt);
	  sqrt.addActionListener(this);

	  rec = new JButton("1/x");
	  buttonpanel.add(rec);
	  rec.addActionListener(this);

	  log = new JButton("log");
	  buttonpanel.add(log);
	  log.addActionListener(this);

	  equals = new JButton("=");
	  buttonpanel.add(equals);
	  equals.addActionListener(this);
	  
	  squared = new JButton("x^2");
	  buttonpanel.add(squared);
	  squared.addActionListener(this);

	  exponent = new JButton("EXP");
	  exponent.addActionListener(this);
	  buttonpanel.add(exponent);

	  factorial = new JButton("n!");
	  factorial.addActionListener(this);
	  buttonpanel.add(factorial);
	  
	  cubed = new JButton("CUBE");
	  buttonpanel.add(cubed);
	  cubed.addActionListener(this);
	  
	  thirdpow = new JButton("x^3");
	  buttonpanel.add(thirdpow);
	  thirdpow.addActionListener(this);
	  
	  clear = new JButton("AC");
	  clear.addActionListener(this);
	  buttonpanel.add(clear);

	  cont.add("Center", buttonpanel);
	  cont.add("North", textpanel);

	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }

	public void actionPerformed(ActionEvent e) {

	  String userClick = e.getActionCommand();

	  if (userClick.equals("1")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "1");

	    } else {

	      textfield.setText("");
	      textfield.setText(textfield.getText() + "1");

	      z = 0;
	    }
	  }

	  if (userClick.equals("2")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "2");

	    } else {

	      textfield.setText("");
	      textfield.setText(textfield.getText() + "2");

	      z = 0;
	    }
	  }

	  if (userClick.equals("3")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "3");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "3");

	      z = 0;
	    }
	  }

	  if (userClick.equals("4")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "4");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "4");

	      z = 0;
	    }
	  }

	  if (userClick.equals("5")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "5");

	    } else {

	      textfield.setText("");
	      textfield.setText(textfield.getText() + "5");

	      z = 0;
	    }
	  }

	  if (userClick.equals("6")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "6");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "6");

	      z = 0;
	    }
	  }

	  if (userClick.equals("7")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "7");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "7");

	      z = 0;
	    }
	  }

	  if (userClick.equals("8")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "8");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "8");

	      z = 0;
	    }
	  }

	  if (userClick.equals("9")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "9");

	    } else {

	      textfield.setText("");

	      textfield.setText(textfield.getText() + "9");

	      z = 0;
	    }
	  }

	  if (userClick.equals("0")) {

	    if (z == 0) {

	      textfield.setText(textfield.getText() + "0");

	    } else {

	      textfield.setText("");
	      textfield.setText(textfield.getText() + "0");

	      z = 0;
	    }
	  }

	  if (userClick.equals("AC")) {

	    textfield.setText("");

	    x = 0;
	    y = 0;
	    z = 0;
	  }

	  if (userClick.equals("log")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.log(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  if (userClick.equals("1/x")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = (1 / Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  if (userClick.equals("EXP")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {
	      a = Math.exp(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  if (userClick.equals("x^2")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.pow(Double.parseDouble(textfield.getText()), 2);

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }
	  
	  if (userClick.equals("x^3")) {

		    if (textfield.getText().equals("")) {

		      textfield.setText("");

		    } else {

		      a = Math.pow(Double.parseDouble(textfield.getText()), 3);

		      textfield.setText("");
		      textfield.setText(textfield.getText() + a);
		    }
		  }
	  
	  
	  if (userClick.equals("+/-")) {

	    if (x == 0) {

	      textfield.setText("-" + textfield.getText());

	      x = 1;

	    } else {

	      textfield.setText(textfield.getText());

	    }
	  }

	  if (userClick.equals(".")) {

	    if (y == 0) {

	      textfield.setText(textfield.getText() + ".");

	      y = 1;

	    } else {

	      textfield.setText(textfield.getText());

	    }
	  }

	  if (userClick.equals("+")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	      temp = 0;

	      ch = '+';

	    } else {

	      temp = Double.parseDouble(textfield.getText());

	      textfield.setText("");

	      ch = '+';

	      y = 0;
	      x = 0;

	    }
	    textfield.requestFocus();
	  }

	  if (userClick.equals("-")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	      temp = 0;

	      ch = '-';

	    } else {

	      x = 0;
	      y = 0;

	      temp = Double.parseDouble(textfield.getText());

	      textfield.setText("");

	      ch = '-';
	    }

	    textfield.requestFocus();
	  }

	  if (userClick.equals("/")) {
	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	      temp = 1;

	      ch = '/';

	    } else {

	      x = 0;
	      y = 0;

	      temp = Double.parseDouble(textfield.getText());

	      ch = '/';

	      textfield.setText("");
	    }

	    textfield.requestFocus();
	  }

	  if (userClick.equals("X")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	      temp = 1;

	      ch = 'X';

	    } else {

	      x = 0;
	      y = 0;

	      temp = Double.parseDouble(textfield.getText());

	      ch = 'X';

	      textfield.setText("");
	    }

	    textfield.requestFocus();
	  }

	  if (userClick.equals("MC")) {

	    m1 = 0;

	    textfield.setText("");
	  }

	  if (userClick.equals("MR")) {

	    textfield.setText("");

	    textfield.setText(textfield.getText() + m1);
	  }

	  if (userClick.equals("M+")) {

	    if (k == 1) {

	      m1 = Double.parseDouble(textfield.getText());

	      k++;

	    } else {

	      m1 += Double.parseDouble(textfield.getText());

	      textfield.setText("" + m1);
	    }
	  }

	  if (userClick.equals("M-")) {

	    if (k == 1) {

	      m1 = Double.parseDouble(textfield.getText());

	      k++;

	    } else {

	      m1 -= Double.parseDouble(textfield.getText());

	      textfield.setText("" + m1);

	    }
	  }

	  if (userClick.equals("SQRT")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.sqrt(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);

	    }
	  }
	  
	  if (userClick.equals("CUBE")) {

		    if (textfield.getText().equals("")) {

		      textfield.setText("");

		    } else {

		      a = Math.cbrt(Double.parseDouble(textfield.getText()));

		      textfield.setText("");
		      textfield.setText(textfield.getText() + a);

		    }
		  }

	  if (userClick.equals("SIN")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.sin(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);

	    }
	  }

	  if (userClick.equals("COS")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.cos(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  if (userClick.equals("TAN")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = Math.tan(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  if (userClick.equals("=")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      temp1 = Double.parseDouble(textfield.getText());

	      switch (ch) {

	        case '+':
	        result = temp + temp1;
	        break;

	        case '-':
	        result = temp - temp1;
	        break;

	        case '/':
	        result = temp / temp1;
	        break;

	        case 'X':
	        result = temp * temp1;
	        break;
	      }

	      textfield.setText("");
	      textfield.setText(textfield.getText() + result);

	      z = 1;
	    }
	  }

	  if (userClick.equals("n!")) {

	    if (textfield.getText().equals("")) {

	      textfield.setText("");

	    } else {

	      a = fact(Double.parseDouble(textfield.getText()));

	      textfield.setText("");
	      textfield.setText(textfield.getText() + a);
	    }
	  }

	  textfield.requestFocus();

	  }

	  public double fact(double x) {

	    int er = 0;

	    if (x < 0) {

	      er = 20;
	      return 0;
	    }

	    double i, s = 1;

	    for (i = 2; i <= x; i += 1.0) 

	      s *= i;
	      return s;
	  }
	  

	  public static void main(String args[]) {

	    KRScientificCalculator calc = new KRScientificCalculator();

	    calc.setTitle("Ken and Robin's Scentific Calculator");
	    calc.pack();
	    calc.setVisible(true);
	  }

}
