import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

class LinearEquation {
    JFrame frame;
    int A1, B1, C1, A2, B2, C2;
    public static final Color Purple = new Color(255, 190, 250);
    public LinearEquation()
    {
        frame = new JFrame("Linear Equations");

        JTextField fldA1 = new JTextField();
        fldA1.setBounds(60, 30, 40, 25);
        frame.add(fldA1);
        JLabel a1 = new JLabel("X");
        a1.setBounds(110, 30, 40, 25);
        frame.add(a1);

        JLabel plus1 = new JLabel("+");
        plus1.setBounds(140, 30, 40, 25);
        frame.add(plus1);

        JTextField fldB1 = new JTextField();
        fldB1.setBounds(170, 30, 40, 25);
        frame.add(fldB1);
        JLabel b1 = new JLabel("Y");
        b1.setBounds(220, 30, 40, 25);
        frame.add(b1);

        JLabel plus2 = new JLabel("+");
        plus2.setBounds(250, 30, 40, 25);
        frame.add(plus2);

        JTextField fldC1 = new JTextField();
        fldC1.setBounds(280, 30, 40, 25);
        frame.add(fldC1);

        ////

        JTextField fldA2 = new JTextField();
        fldA2.setBounds(60, 70, 40, 25);
        frame.add(fldA2);
        JLabel a2 = new JLabel("X");
        a2.setBounds(110, 70, 40, 25);
        frame.add(a2);

        JLabel plus3 = new JLabel("+");
        plus3.setBounds(140, 70, 40, 25);
        frame.add(plus3);

        JTextField fldB2 = new JTextField();
        fldB2.setBounds(170, 70, 40, 25);
        frame.add(fldB2);
        JLabel b2 = new JLabel("Y");
        b2.setBounds(220, 70, 40, 25);
        frame.add(b2);

        JLabel plus4 = new JLabel("+");
        plus4.setBounds(250, 70, 40, 25);
        frame.add(plus4);

        JTextField fldC2 = new JTextField();
        fldC2.setBounds(280, 70, 40, 25);
        frame.add(fldC2);

        JButton btnX = new JButton("X");
        btnX.setBounds(60, 160, 50, 30);
        frame.add(btnX);
        JTextField fldX = new JTextField();
        fldX.setBounds(130, 160, 40, 25);
        frame.add(fldX);

        JButton btnY = new JButton("Y");
        btnY.setBounds(60, 200, 50, 30);
        frame.add(btnY);
        JTextField fldY = new JTextField();
        fldY.setBounds(130, 200, 40, 25);
        frame.add(fldY);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(60, 270, 70, 25);
        frame.add(btnClear);

        btnX.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {   
                    try {
                        A1 = Integer.parseInt(fldA1.getText());
                        B1 = Integer.parseInt(fldB1.getText());
                        C1 = Integer.parseInt(fldC1.getText());
                        A2 = Integer.parseInt(fldA2.getText());
                        B2 = Integer.parseInt(fldB2.getText());
                        C2 = Integer.parseInt(fldC2.getText());
                        float x = (float)(B1 * C2 - B2 * C1) / (A1 * B2 - A2 * B1);
                        fldX.setText(String.valueOf(x));
                    } catch (NumberFormatException e) {

                    } catch (NullPointerException e) {

                    }
                }
            });

        btnY.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    try {
                        A1 = Integer.parseInt(fldA1.getText());
                        B1 = Integer.parseInt(fldB1.getText());
                        C1 = Integer.parseInt(fldC1.getText());
                        A2 = Integer.parseInt(fldA2.getText());
                        B2 = Integer.parseInt(fldB2.getText());
                        C2 = Integer.parseInt(fldC2.getText());
                        float y = (float)(A1 * C2 - A2 * C1) / (A2 * B1 - A1 * B2);
                        fldY.setText(String.valueOf(y));
                    } catch (NumberFormatException e) {

                    } catch (NullPointerException e) {

                    }
                }
            });

        btnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    fldA1.setText("");
                    fldB1.setText("");
                    fldC1.setText("");
                    fldA2.setText("");
                    fldB2.setText("");
                    fldC2.setText("");
                    fldX.setText("");
                    fldY.setText("");
                }
            });

        frame.setSize(450, 370);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Purple);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args []) {
        new LinearEquation().frame.setVisible(true);
    }
}