import javax.swing.*;

public class ConvertLogic {

    private int defaultCurrencieFactor = 1;

    public void ConvertCurrency(JSpinner spinnerValue, JTextField textField){
        int SpinnerValue = (int)spinnerValue.getValue();
        CurrencyConverter ourform = new CurrencyConverter();
        //double factor = GetFactorByTwoCurrencyBoxes(ourform.comboBoxCource1, ourform.comboBoxCource2);
        textField.setText(Double.toString(SpinnerValue * defaultCurrencieFactor));
    }

//    private double GetFactorByTwoCurrencyBoxes(JComboBox comboBox1, JComboBox comboBox2){
//        Currency currency = new Currency("0", 0);
//        double factor = currency.DefaultCurrencyList[comboBox1.getSelectedIndex()][1] / currency.DefaultCurrencyList[comboBox2.getSelectedIndex()][1];
//        return factor;
//    }
}
