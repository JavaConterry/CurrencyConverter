import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        InstantiateForm();
    }

    public static void InstantiateForm(){
        JFrame Frame = new JFrame("App");
        Frame.setContentPane(new CurrencyConverter().mainPannel);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }
}
