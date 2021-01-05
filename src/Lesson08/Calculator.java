package Lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private TextField textField;

    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 400, 600);
        setLayout(new BorderLayout());

        add(topInit(), BorderLayout.NORTH);
        add(bottomInit(), BorderLayout.CENTER);
        add(rav(), BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel rav() {
        JPanel rav = new JPanel();
        rav.setLayout(new BorderLayout());
        JButton submit = new JButton("=");
        submit.addActionListener(new CalculationListener(textField));
        submit.setFont(new Font(null, Font.CENTER_BASELINE, 50));
        rav.add(submit);
        return rav;
    }

    private JPanel topInit() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        textField = new TextField();
        textField.setFont(new Font(null, Font.ITALIC, 35));
        textField.setEditable(false);
        top.add(textField, BorderLayout.CENTER);
        return top;
    }

    private JPanel bottomInit() {
        ButtonsListener listenerButtons = new ButtonsListener(textField);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(6, 3));

        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(listenerButtons);
            btn.setFont(new Font(null, Font.CENTER_BASELINE, 30));
            bottom.add(btn);
        }

        JButton decimal = new JButton(".");
        decimal.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        decimal.addActionListener(listenerButtons);

        JButton zero = new JButton("0");
        zero.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        zero.addActionListener(listenerButtons);

        JButton clear = new JButton("C");
        clear.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("");
            }
        });

        JButton plus = new JButton("+");
        plus.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        plus.addActionListener(listenerButtons);

        JButton minus = new JButton("-");
        minus.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        minus.addActionListener(listenerButtons);

        JButton multiple = new JButton("*");
        multiple.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        multiple.addActionListener(listenerButtons);

        JButton divided = new JButton("\u00f7"); // деление
        divided.addActionListener(listenerButtons);
        divided.setFont(new Font(null, Font.CENTER_BASELINE, 30));

        // вычисление квадратного корня
        JButton sqr = new JButton("\u221a"); // квадратный корень
        sqr.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText(
                        String.valueOf(
                                Math.sqrt(Double.parseDouble(textField.getText()))
                        )
                );
            }
        });

        // возведение в степерь
        JButton exp = new JButton("x\u00B2"); // степень
        exp.setFont(new Font(null, Font.CENTER_BASELINE, 30));
        exp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText(
                        String.valueOf(
                                Double.parseDouble(textField.getText()) * Double.parseDouble(textField.getText())
                        )
                );
            }
        });

        bottom.add(plus);
        bottom.add(zero);
        bottom.add(decimal);
        bottom.add(minus);
        bottom.add(multiple);
        bottom.add(divided);
        bottom.add(sqr);
        bottom.add(exp);
        bottom.add(clear);
        return bottom;
    }
}