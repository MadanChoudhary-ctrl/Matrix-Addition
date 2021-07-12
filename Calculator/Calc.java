import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Calc {

    private static float num1;
    private static float num2;
    private static float result;
    private static String action;
    public static void main(String args []) {

        JFrame box = new JFrame("Calculator");
        JTextField field = new JTextField();
        JLabel label1 = new JLabel("C A S I O");
        JButton btnPoint = new JButton(".");
        JButton btnMod = new JButton("%");
        JButton btnPermutation = new JButton("P(n, r)");
        JButton btnCombination = new JButton("C(n, r)");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMultiply = new JButton("*");
        JButton btnDivide = new JButton("/");
        JButton btnClear = new JButton("C");
        JButton btnEqual = new JButton("=");

        field.setBounds(40, 40, 400, 30);
        btnClear.setBounds(380, 120, 45, 25);
        btnMod.setBounds(380, 185, 45, 25);
        btnPermutation.setBounds(350, 250, 75, 25);
        btnCombination.setBounds(350, 315, 75, 25);
        btn1.setBounds(60, 120, 45, 25);
        btn2.setBounds(130, 120, 45, 25);
        btn3.setBounds(200, 120, 45, 25);
        btnPlus.setBounds(280, 120, 45, 25);
        btn4.setBounds(60, 185, 45, 25);
        btn5.setBounds(130, 185, 45, 25);
        btn6.setBounds(200, 185, 45, 25);
        btnMinus.setBounds(280, 185, 45, 25);
        btn7.setBounds(60, 250, 45, 25);
        btn8.setBounds(130, 250, 45, 25);
        btn9.setBounds(200, 250, 45, 25);
        btnMultiply.setBounds(280, 250, 45, 25);
        btn0.setBounds(60, 315, 45, 25);
        btnPoint.setBounds(130, 315, 45, 25);
        btnEqual.setBounds(200, 315, 45, 25);
        btnDivide.setBounds(280, 315, 45, 25);
        label1.setBounds(50, 10, 100, 25);

        box.add(field);
        box.add(btnPoint);
        box.add(btnMod);
        box.add(btnPermutation);
        box.add(btnCombination);
        box.add(btn1);
        box.add(btn2);
        box.add(btn3);
        box.add(btnPlus);
        box.add(btn4);
        box.add(btn5);
        box.add(btn6);
        box.add(btnMinus);
        box.add(btn7);
        box.add(btn8);
        box.add(btn9);
        box.add(btnMultiply);
        box.add(btnClear);
        box.add(btn0);
        box.add(btnEqual);
        box.add(btnDivide);
        box.add(label1);

        box.setLayout(null);
        box.setVisible(true);
        box.setSize(500, 420);
        btnPlus.setForeground(Color.RED);
        btnMinus.setForeground(Color.RED);
        btnMultiply.setForeground(Color.RED);
        btnDivide.setForeground(Color.RED);
        label1.setForeground(Color.BLUE);
        btnClear.setForeground(Color.BLUE);
        btnEqual.setForeground(Color.BLUE);
        btnMod.setForeground(Color.RED);
        btnCombination.setForeground(Color.RED);
        btnPermutation.setForeground(Color.RED);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPoint.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btnPoint.getText());
                }
            });

        btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn1.getText());
                }
            });

        btn2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn2.getText());
                }
            });

        btn3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn3.getText());
                }
            });

        btn4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn4.getText());
                }
            });

        btn5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn5.getText());
                }
            });

        btn6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn6.getText());
                }
            });

        btn7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn7.getText());
                }
            });

        btn8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn8.getText());
                }
            });

        btn9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn9.getText());
                }
            });

        btn0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText(field.getText()+btn0.getText());
                }
            });

        btnPlus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "+";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");
                }
            });

        btnMinus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "-";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");
                }
            });

        btnMultiply.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "*";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");
                }
            });

        btnDivide.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "/";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");;
                }
            });

        btnMod.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "%";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");;
                }
            });

        btnCombination.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "C(n, r)";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");
                }
            });

        btnPermutation.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    action = "P(n, r)";
                    num1 = Float.valueOf(field.getText());
                    field.setText("");;
                }
            });

        btnEqual.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    num2 = Float.valueOf(field.getText());

                    if(action == "+") {
                        result = (float)num1 + num2;
                    }
                    else if(action == "-") {
                        result = (float)num1 - num2;
                    }
                    else if(action == "*") {
                        result = (float)num1 * num2;
                    }
                    else if(action == "/" ) {
                        result = (float)num1 / num2;
                    }
                    else if(action == "%") {
                        result = (float)num1 % num2;
                    }
                    else if(action == "C(n, r)") {
                        float f1 = 1;
                        float f2 = 1;
                        float f3 = 1;
                        float num3 = num1 - num2;

                        for(int i = 1; i <= num1; i++) {
                            f1 = f1 * i;
                        }

                        for(int j = 1; j <= num2; j++) {
                            f2 = f2 * j;
                        }

                        for(int k = 1; k <= num3; k++) {
                            f3 = f3 * k;
                        }

                        result = (float) f1/(f2 * f3);
                    }

                    if(action == "P(n, r)") {
                        float f1 = 1;
                        float f2 = 1;
                        float num3 = num1 - num2;

                        for(int i = 1; i <= num1; i++) {
                            f1 = f1 * i;
                        }

                        for(int i = 1; i <= num3; i++) {
                            f2 = f2 * i;
                        }

                        result = f1/f2;    
                    }

                    field.setText(String.valueOf(result));
                }
            });

        btnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    field.setText("");
                }
            });
    }
}

