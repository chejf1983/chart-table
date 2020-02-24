/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart.spchart.panel;

import java.awt.Color;
import java.awt.Paint;
import javax.swing.JColorChooser;

/**
 *
 * @author Administrator
 */
public final class ChartColorConfig extends javax.swing.JPanel {

    /**
     * Creates new form ColorSet
     */
    public ChartColorConfig() {
        initComponents();
        this.chartLine_ColorSample.setBackground((Color) GetMainLineColor());
        this.chartBackgound_ColorSample.setBackground((Color) GetChartBackGroundColor());
        this.chartGrid_ColorSample.setBackground((Color) GetGridColor());
        this.chartText_ColorSample.setBackground((Color) GetTextColor());
    }

    public static String LineColorKey = "SpColor";
    public static String DefaultLineColor = "#00FF00";

    public static Paint GetMainLineColor() {
        return Color.decode(SpectralChartPane.Config.getProperty(LineColorKey, DefaultLineColor));
    }

    public static String BKColorKey = "BGroundColor";
    public static String DefaultBKColor = "#808080";

    public static Paint GetChartBackGroundColor() {
        return Color.decode(SpectralChartPane.Config.getProperty(BKColorKey, DefaultBKColor));
    }

    public static String TextColorKey = "TextColor";
    public static String DefaultTextColor = "#00FF00";

    public static Paint GetTextColor() {
        return Color.decode(SpectralChartPane.Config.getProperty(TextColorKey, DefaultTextColor));
    }

    public static String GridColorKey = "GridColor";
    public static String DefaultGridColor = "#B8B8B8";

    public static Paint GetGridColor() {
        return Color.decode(SpectralChartPane.Config.getProperty(GridColorKey, DefaultGridColor));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        chartLine_ColorSample = new javax.swing.JTextField();
        chartBackgound_ColorSample = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chartGrid_ColorSample = new javax.swing.JTextField();
        chartText_ColorSample = new javax.swing.JTextField();
        Button_def = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        chartLine_ColorSample.setEditable(false);
        chartLine_ColorSample.setBackground(new java.awt.Color(51, 255, 0));
        chartLine_ColorSample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartLine_ColorSampleMouseClicked(evt);
            }
        });

        chartBackgound_ColorSample.setEditable(false);
        chartBackgound_ColorSample.setBackground(new java.awt.Color(153, 153, 153));
        chartBackgound_ColorSample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartBackgound_ColorSampleMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));

        jLabel3.setText("光谱颜色设置:");

        jLabel4.setText("背景颜色设置:");

        jLabel5.setText("网格线颜色设置:");

        jLabel6.setText("字体颜色设置:");

        chartGrid_ColorSample.setEditable(false);
        chartGrid_ColorSample.setBackground(new java.awt.Color(51, 255, 0));
        chartGrid_ColorSample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartGrid_ColorSampleMouseClicked(evt);
            }
        });

        chartText_ColorSample.setEditable(false);
        chartText_ColorSample.setBackground(new java.awt.Color(153, 153, 153));
        chartText_ColorSample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartText_ColorSampleMouseClicked(evt);
            }
        });

        Button_def.setText("恢复默认值");
        Button_def.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_defActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartText_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chartGrid_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chartBackgound_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chartLine_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_def, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chartLine_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chartBackgound_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chartGrid_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chartText_ColorSample, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(10, 10, 10)
                .addComponent(Button_def)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String ColorToString(Color color) {
        String R = Integer.toHexString(color.getRed());
        R = R.length() < 2 ? ('0' + R) : R;
        String B = Integer.toHexString(color.getBlue());
        B = B.length() < 2 ? ('0' + B) : B;
        String G = Integer.toHexString(color.getGreen());
        G = G.length() < 2 ? ('0' + G) : G;
        return '#' + R + G + B;
    }

    private void setColor(String key, String value) {
        SpectralChartPane.Config.setProperty(key, value);
        SpectralChartPane.GlobalColorEvent.CreateEvent(value);
    }

    private void Button_defActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_defActionPerformed
        setColor(ChartColorConfig.LineColorKey, DefaultLineColor);
        this.chartLine_ColorSample.setBackground(Color.decode(DefaultLineColor));
        setColor(ChartColorConfig.BKColorKey, DefaultBKColor);
        this.chartBackgound_ColorSample.setBackground(Color.decode(DefaultBKColor));
        setColor(ChartColorConfig.GridColorKey, DefaultGridColor);
        this.chartGrid_ColorSample.setBackground(Color.decode(DefaultGridColor));
        setColor(ChartColorConfig.TextColorKey, DefaultTextColor);
        this.chartText_ColorSample.setBackground(Color.decode(DefaultTextColor));
    }//GEN-LAST:event_Button_defActionPerformed

    private void chartLine_ColorSampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartLine_ColorSampleMouseClicked
        Color color = JColorChooser.showDialog(null, "选择需要设定的光谱颜色", null);
        if (color != null) {
            setColor(ChartColorConfig.LineColorKey, ColorToString(color));
            this.chartLine_ColorSample.setBackground(color);
        }
    }//GEN-LAST:event_chartLine_ColorSampleMouseClicked

    private void chartBackgound_ColorSampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartBackgound_ColorSampleMouseClicked
        Color color = JColorChooser.showDialog(null, "选择需要设定的背景颜色", null);
        if (color != null) {
            setColor(ChartColorConfig.BKColorKey, ColorToString(color));
            this.chartBackgound_ColorSample.setBackground(color);
        }
    }//GEN-LAST:event_chartBackgound_ColorSampleMouseClicked

    private void chartGrid_ColorSampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartGrid_ColorSampleMouseClicked
        Color color = JColorChooser.showDialog(null, "选择需要设定的背景颜色", null);
        if (color != null) {
            setColor(ChartColorConfig.GridColorKey, ColorToString(color));
            this.chartGrid_ColorSample.setBackground(color);
        }
    }//GEN-LAST:event_chartGrid_ColorSampleMouseClicked

    private void chartText_ColorSampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartText_ColorSampleMouseClicked
        Color color = JColorChooser.showDialog(null, "选择需要设定的背景颜色", null);
        if (color != null) {
            setColor(ChartColorConfig.TextColorKey, ColorToString(color));
            this.chartText_ColorSample.setBackground(color);
        }
    }//GEN-LAST:event_chartText_ColorSampleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_def;
    public javax.swing.JTextField chartBackgound_ColorSample;
    public javax.swing.JTextField chartGrid_ColorSample;
    public javax.swing.JTextField chartLine_ColorSample;
    public javax.swing.JTextField chartText_ColorSample;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
