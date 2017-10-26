package columbus.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Resistor4
{
    private static String[] mStr1 = {"Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Gray", "White"};
    private static String[] mStr2 = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Gray", "White"};
    private static String[] mStr3 = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Gold", "Silver"};
    private static String[] mStr4 = {"Brown", "Red", "Gold", "Silver"};
    private static Listener mListener = new Listener();

    public static GridLayout mLayout = new GridLayout(5, 2);
    public static JButton mButton = new JButton("Calculate");
    public static JLabel mLabel1 = new JLabel("First line");
    public static JLabel mLabel2 = new JLabel("Second line");
    public static JLabel mLabel3 = new JLabel("Third line");
    public static JLabel mLabel4 = new JLabel("Fourth line");
    public static JComboBox mCombo1 = new JComboBox(mStr1);
    public static JComboBox mCombo2 = new JComboBox(mStr2);
    public static JComboBox mCombo3 = new JComboBox(mStr3);
    public static JComboBox mCombo4 = new JComboBox(mStr4);

    public static Listener getListener()
    {
        return mListener;
    }

    private static int convertLine1()
    {
        switch (mStr1[mCombo1.getSelectedIndex()])
        {
            case "Brown": return 1;
            case "Red": return 2;
            case "Orange": return 3;
            case "Yellow": return 4;
            case "Green": return 5;
            case "Blue": return 6;
            case "Purple": return 7;
            case "Gray": return 8;
            case "White": return 9;
        }

        return -1;
    }

    private static int convertLine2()
    {
        switch (mStr2[mCombo2.getSelectedIndex()])
        {
            case "Black": return 0;
            case "Brown": return 1;
            case "Red": return 2;
            case "Orange": return 3;
            case "Yellow": return 4;
            case "Green": return 5;
            case "Blue": return 6;
            case "Purple": return 7;
            case "Gray": return 8;
            case "White": return 9;
        }

        return -1;
    }

    private static int convertLine3()
    {
        switch (mStr3[mCombo3.getSelectedIndex()])
        {
            case "Black": return 0;
            case "Brown": return 1;
            case "Red": return 2;
            case "Orange": return 3;
            case "Yellow": return 4;
            case "Green": return 5;
            case "Blue": return 6;
            case "Gold": return -1;
            case "Silver": return -2;
        }

        return 0;
    }

    private static int convertLine4()
    {
        switch (mStr3[mCombo3.getSelectedIndex()])
        {
            case "Brown": return 1;
            case "Red": return 2;
            case "Gold": return 5;
            case "Silver": return 10;
        }

        return 5;
    }

    static class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == mButton)
            {
                String mes = String.valueOf(convertLine1());
                mes += String.valueOf(convertLine2());
                float val = Integer.parseInt(mes);
                val *= Math.pow(10, convertLine3());
                float percent = convertLine4();
                JOptionPane.showMessageDialog(null, val + "\n" + percent + "%");
            }
        }
    }
}
