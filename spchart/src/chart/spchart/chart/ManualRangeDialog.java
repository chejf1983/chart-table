/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart.spchart.chart;

import org.jfree.data.Range;

/**
 *
 * @author jiche
 */
public class ManualRangeDialog extends javax.swing.JDialog {

    /**
     * Creates new form ManualRangeDialog
     * @param parent
     * @param modal
     */
    public ManualRangeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.ManualX1_Lable.setText("X.min");
        this.ManualX2_Lable.setText("X.max");
        this.ManualY1_Lable.setText("Y.min");
        this.ManualY2_Lable.setText("Y.max");
        this.Button_ManualRangeOK.setText("设置");
    }

    public void SetCurrentRange(Range yrange, Range xrange) {
        this.TextField_X1.setText(String.format("%.2f", xrange.getLowerBound()));
        this.TextField_X2.setText(String.format("%.2f", xrange.getUpperBound()));
        this.TextField_Y1.setText(String.format("%.2f", yrange.getLowerBound()));
        this.TextField_Y2.setText(String.format("%.2f", yrange.getUpperBound()));
    }

    // <editor-fold defaultstate="collapsed" desc="坐标轴大小">  
    private Range yrange;
    public Range GetYRange() {
        return yrange;
    }

    private Range xrange;
    public Range GetXRange() {
        return xrange;
    }
    // </editor-fold>

    //是否有设置
    private boolean isOk = false;
    public boolean IsOk() {
        return this.isOk;
    }

    private void GetValue() {
        this.isOk = false;
        this.yrange = null;
        this.xrange = null;

        try {
            double y1 = Double.valueOf(this.TextField_Y1.getText());
            double y2 = Double.valueOf(this.TextField_Y2.getText());
            if (y1 <= y2) {
                yrange = new Range(y1, y2);
            } else {
                return;
            }

            double x1 = Double.valueOf(this.TextField_X1.getText());
            double x2 = Double.valueOf(this.TextField_X2.getText());

            if (x1 <= x2) {
                xrange = new Range(x1, x2);
            } else {
                return;
            }
        } catch (Exception ex) {
            return;
        }

        this.isOk = true;
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManualX1_Lable = new javax.swing.JLabel();
        TextField_X1 = new javax.swing.JTextField();
        TextField_X2 = new javax.swing.JTextField();
        ManualX2_Lable = new javax.swing.JLabel();
        TextField_Y1 = new javax.swing.JTextField();
        ManualY1_Lable = new javax.swing.JLabel();
        TextField_Y2 = new javax.swing.JTextField();
        ManualY2_Lable = new javax.swing.JLabel();
        Button_ManualRangeOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ManualX1_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManualX1_Lable.setText("jLabel1");

        TextField_X1.setText("0");

        TextField_X2.setText("0");

        ManualX2_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManualX2_Lable.setText("jLabel1");

        TextField_Y1.setText("0");

        ManualY1_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManualY1_Lable.setText("jLabel1");

        TextField_Y2.setText("0");

        ManualY2_Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManualY2_Lable.setText("jLabel1");

        Button_ManualRangeOK.setText("设置");
        Button_ManualRangeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ManualRangeOKActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nexus/chart/resource/test.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_ManualRangeOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManualY1_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManualY2_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ManualX1_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextField_X1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ManualX2_Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(TextField_X2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ManualX1_Lable, ManualX2_Lable, ManualY1_Lable, ManualY2_Lable});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TextField_X1, TextField_X2, TextField_Y1, TextField_Y2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManualY2_Lable)
                            .addComponent(TextField_Y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManualY1_Lable)
                            .addComponent(TextField_Y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManualX2_Lable)
                    .addComponent(TextField_X2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManualX1_Lable)
                    .addComponent(TextField_X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_ManualRangeOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Button_ManualRangeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ManualRangeOKActionPerformed
        this.GetValue();
    }//GEN-LAST:event_Button_ManualRangeOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_ManualRangeOK;
    private javax.swing.JLabel ManualX1_Lable;
    private javax.swing.JLabel ManualX2_Lable;
    private javax.swing.JLabel ManualY1_Lable;
    private javax.swing.JLabel ManualY2_Lable;
    private javax.swing.JTextField TextField_X1;
    private javax.swing.JTextField TextField_X2;
    private javax.swing.JTextField TextField_Y1;
    private javax.swing.JTextField TextField_Y2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
