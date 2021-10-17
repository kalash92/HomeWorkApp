package lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcButtonListener implements ActionListener {
    private JTextField resultField;

    public CalcButtonListener(JTextField resultField) {
        this.resultField = resultField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult = scriptEngine.eval(resultField.getText());
        resultField.setText(btn.getText(expResult));


    }
}
