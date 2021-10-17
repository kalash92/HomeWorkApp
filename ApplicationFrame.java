package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame {

    private JTextField resultField;

    public ApplicationFrame() {
        setTitle("ApplicationFrame v1.0");
        setBounds(50,50, 250, 350);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH);
        add(createBottom(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(resultField);

        //ЦИФРЫ
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 10; i++) {
            String buttonName = (i == 10) ? "0" : String.valueOf(i);
            JButton btn = new JButton(buttonName);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        bottom.add(digitsPanel, BorderLayout.CENTER);

        //OPERATORS
        JPanel advPanel = new JPanel();
        advPanel.setLayout(new GridLayout(4, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        advPanel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        advPanel.add(plus);

        JButton calc = new JButton("=");
        calc.addActionListener(buttonListener);
        advPanel.add(calc);

        JButton clear = new JButton("C");
        calc.addActionListener(buttonListener);
        advPanel.add(clear);

        bottom.add(advPanel, BorderLayout.WEST);

        return bottom;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        resultField = new JTextField();
        resultField.setEditable(false);
        top.add(resultField);

        return top;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
        menu.add(new JMenuItem("Clear"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }
}
