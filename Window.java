package columbus.calculator;

import javax.swing.*;

public class Window extends JFrame
{
    private static String[] mStr = {"4 lines", "5 lines"};
    public static JComboBox mCombo = new JComboBox(mStr);

    private Resistor4 mResistor4;
    private Resistor5 mResistor5;

    public Window(String title)
    {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        set5();
        set4();
        set5();

        mResistor4.mButton.addActionListener(mResistor4.getListener());
        mResistor5.mButton.addActionListener(mResistor5.getListener());

        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300, 200);
    }

    private void set4()
    {
        getContentPane().removeAll();
        repaint();

        setLayout(mResistor4.mLayout);
        add(mResistor4.mLabel1);
        add(mResistor4.mCombo1);
        add(mResistor4.mLabel2);
        add(mResistor4.mCombo2);
        add(mResistor4.mLabel3);
        add(mResistor4.mCombo3);
        add(mResistor4.mLabel4);
        add(mResistor4.mCombo4);
        add(mCombo);
        add(mResistor4.mButton);

        setVisible(true);
        setSize(300, 200);
    }

    private void set5()
    {
        getContentPane().removeAll();
        repaint();

        setLayout(mResistor5.mLayout);
        add(mResistor5.mLabel1);
        add(mResistor5.mCombo1);
        add(mResistor5.mLabel2);
        add(mResistor5.mCombo2);
        add(mResistor5.mLabel3);
        add(mResistor5.mCombo3);
        add(mResistor5.mLabel4);
        add(mResistor5.mCombo4);
        add(mResistor5.mLabel5);
        add(mResistor5.mCombo5);
        add(mCombo);
        add(mResistor5.mButton);

        setVisible(true);
        setSize(300, 240);
    }
}
