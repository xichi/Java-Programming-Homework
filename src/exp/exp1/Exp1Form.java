/*
 * Created by JFormDesigner on Wed May 06 13:53:21 GMT+08:00 2020
 */

package exp.exp1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author unknown
 */
public class Exp1Form extends JFrame {
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - xichi
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        center = new JPanel();
        label1 = new JLabel();
        panel7 = new JPanel();
        rmb_panel = new JPanel();
        label4 = new JLabel();
        textField2 = new JTextField();
        dollar_panel = new JPanel();
        label3 = new JLabel();
        textField1 = new JTextField();
        exchange_panel = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(400, 300));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(20, 20));

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;
            panel1.setLayout(new BorderLayout());
        }
        contentPane.add(panel1, BorderLayout.NORTH);

        //======== panel2 ========
        {
            panel2.setLayout(new BorderLayout());
        }
        contentPane.add(panel2, BorderLayout.WEST);

        //======== panel3 ========
        {
            panel3.setLayout(new BorderLayout());
        }
        contentPane.add(panel3, BorderLayout.EAST);

        //======== panel4 ========
        {
            panel4.setLayout(new BorderLayout());
        }
        contentPane.add(panel4, BorderLayout.SOUTH);

        //======== center ========
        {
            center.setLayout(new BorderLayout(30, 50));

            //---- label1 ----
            label1.setText("\u4eba\u6c11\u5e01\u7f8e\u5143\u8f6c\u6362\u5668");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            center.add(label1, BorderLayout.PAGE_START);

            //======== panel7 ========
            {
                panel7.setLayout(new GridLayout());
            }
            center.add(panel7, BorderLayout.PAGE_END);

            //======== rmb_panel ========
            {
                rmb_panel.setLayout(new GridLayout(2, 1, 0, 20));

                //---- label4 ----
                label4.setText("\u4eba\u6c11\u5e01\uff08RMB\uff09:");
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                rmb_panel.add(label4);

                //---- textField2 ----
                textField2.setHorizontalAlignment(SwingConstants.LEFT);
                textField2.setColumns(1);
                rmb_panel.add(textField2);
            }
            center.add(rmb_panel, BorderLayout.LINE_START);

            //======== dollar_panel ========
            {
                dollar_panel.setLayout(new GridLayout(2, 1, 0, 20));

                //---- label3 ----
                label3.setText("\u7f8e\u5143\uff08Dollar\uff09\uff1a");
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                dollar_panel.add(label3);
                dollar_panel.add(textField1);
            }
            center.add(dollar_panel, BorderLayout.LINE_END);

            //======== exchange_panel ========
            {
                exchange_panel.setLayout(new GridLayout(2, 1, 80, 20));

                //---- button1 ----
                button1.setText("->");
                exchange_panel.add(button1);

                //---- button2 ----
                button2.setText("<-");
                exchange_panel.add(button2);
            }
            center.add(exchange_panel, BorderLayout.CENTER);
        }
        contentPane.add(center, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - xichi
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel center;
    private JLabel label1;
    private JPanel panel7;
    private JPanel rmb_panel;
    private JLabel label4;
    private JTextField textField2;
    private JPanel dollar_panel;
    private JLabel label3;
    private JTextField textField1;
    private JPanel exchange_panel;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public Exp1Form() {
        initComponents();
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double rmb = Double.valueOf(textField2.getText());
                double dollar = rmb * 0.1411;
                textField1.setText("" + dollar);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double dollar = Double.valueOf(textField1.getText());
                double rmb = dollar * 7.0875;
                textField2.setText("" + rmb);
            }
        });
    }


    public static void main(String[] args){
        new Exp1Form().setVisible(true);
    }
}
