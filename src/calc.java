import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calc extends JFrame{
    private JLabel label1 = new JLabel("Число 1:");
    private JTextField field1 = new JTextField(10);
    private JLabel label2 = new JLabel("Число 2:");
    private JTextField field2 = new JTextField(10);
    private JLabel label3 = new JLabel("Сумма:");
    private JTextField result = new JTextField(10);
    private JButton sum = new JButton("Сложить");

    public calc() {
        super("Сумма двух чисел");
        this.setBounds(100, 100, 250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //по центру экрана
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2));

        container.add(label1);
        container.add(field1);
        container.add(label2);
        container.add(field2);
        container.add(label3);
        container.add(result);
        container.add(sum);

        ButtonGroup group = new ButtonGroup();
        sum.addActionListener(new calc.ButtonEvent());

    }
    class ButtonEvent implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            Integer summa = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
            result.setText(summa.toString());
            setLocationRelativeTo(null); //по центру экрана
        }
    }
}








