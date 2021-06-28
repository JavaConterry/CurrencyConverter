import com.guiformpractice.Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    private JLabel label;
    public JPanel mainPannel;
    private JSpinner spinner1;
    private JButton button1;
    private JTextField textField1;
    public JComboBox comboBoxCource1;
    public JComboBox comboBoxCource2;
    private ConvertLogic Logic = new ConvertLogic();


    public CurrencyConverter() {
        FillCurrencyBoxes();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.ConvertCurrency(spinner1, textField1);
            }
        });
    }

    public void FillCurrencyBoxes(){
        Currency USD = new Currency("USD", 1);
        Currency EUR = new Currency("EUR", 0.8384);
        Currency GBP = new Currency("GBP", 0.7195);

        comboBoxCource1.addItem(USD.GetName());
        comboBoxCource1.addItem(EUR.GetName());
        comboBoxCource1.addItem(GBP.GetName());

        comboBoxCource2.addItem(USD.GetName());
        comboBoxCource2.addItem(EUR.GetName());
        comboBoxCource2.addItem(GBP.GetName());
    }
}
