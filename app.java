import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends Calculator{
    private JPanel RootPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new app().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
    public app() {

        super();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean numeric1=isNumeric(textField1.getText());
                boolean numeric2=isNumeric(textField2.getText());
                if((numeric1== true && numeric2==true)) {

                    setA(textField1.getText());
                    setB(textField2.getText());

                    int d = Integer.parseInt(a) + Integer.parseInt(b);
                    StringBuffer sb = new StringBuffer( a+ "+" + b + "=" + d);

                    JOptionPane.showConfirmDialog(null, sb, "Suma", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false || numeric2==false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
                }

        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean numeric1=isNumeric(textField1.getText());
                boolean numeric2=isNumeric(textField2.getText());
                if(numeric1== true && numeric2==true) {


                    setA(textField1.getText());
                    setB(textField2.getText());
                    int d = Integer.parseInt(a) - Integer.parseInt(b);
                    StringBuffer sb = new StringBuffer(a + "-" + b + "=" + d);

                    JOptionPane.showConfirmDialog(null, sb, "Diferenta", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false || numeric2==false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean numeric1=isNumeric(textField1.getText());
                boolean numeric2=isNumeric(textField2.getText());
                if(numeric1== true && numeric2==true) {


                    setA(textField1.getText());
                    setB(textField2.getText());
                    int d = Integer.parseInt(a) * Integer.parseInt(b);
                    StringBuffer sb = new StringBuffer(a + "*" + b + "=" + d);

                    JOptionPane.showConfirmDialog(null, sb, "Inmultire", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false || numeric2==false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean numeric1=isNumeric(textField1.getText());
                boolean numeric2=isNumeric(textField2.getText());
                if(numeric1== true && numeric2==true) {


                    setA(textField1.getText());
                    setB(textField2.getText());
                    Double d = Double.parseDouble(a) / Double.parseDouble(b);
                    StringBuffer sb = new StringBuffer(a + "/" + b + "=" + d);

                    JOptionPane.showConfirmDialog(null, sb, "Impartire", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false || numeric2==false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean numeric1=isNumeric(textField1.getText());
                if(numeric1== true) {


                    setA(textField1.getText());
                    Double d = 2 *  Double.parseDouble(a) * PI;
                    StringBuffer sb = new StringBuffer(2+ "*"+ a +"*" + "PI" +"="+ d);

                    JOptionPane.showConfirmDialog(null, sb, "Lungimea Cercului cu Raza A ", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean numeric1=isNumeric(textField1.getText());
                if(numeric1== true) {


                    setA(textField1.getText());
                    Double d = Integer.parseInt(a) *  Double.parseDouble(a) * PI;
                    StringBuffer sb = new StringBuffer(a + "^" + "2" +"*"+ " PI " + "=" + d);

                    JOptionPane.showConfirmDialog(null, sb, "Aria Cercului cu Raza A", JOptionPane.DEFAULT_OPTION);
                }
                if(numeric1== false) {
                    JOptionPane.showConfirmDialog(null, "Valorile nu sunt corespunzatoare \n Lipsa Valori/Ati introdus Litere", "Eroare", JOptionPane.DEFAULT_OPTION);
                }
            }
        });
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
