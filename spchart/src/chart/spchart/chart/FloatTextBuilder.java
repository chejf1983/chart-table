/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart.spchart.chart;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Paint;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartPanel;

/**
 * 浮动文字
 *
 * @author jiche
 */
public class FloatTextBuilder {

    private final ChartPanel dataChartPane;

    public FloatTextBuilder(ChartPanel dataChartPane) {
        this.dataChartPane = dataChartPane;
        this.dataChartPane.setLayout(new ListFlowLayout(FlowLayout.LEADING, 30, 0, 20, true, false));
    }

    private final ArrayList<JLabel> lables = new ArrayList();

    // <editor-fold defaultstate="collapsed" desc="创建删除浮动字">
    public JLabel CreateNewLable(String input) {
        JLabel FreeText = new JLabel();

        FreeText.setText(input);
        FreeText.setHorizontalAlignment(SwingConstants.RIGHT);
        FreeText.setForeground((Color) def_color);
        FreeText.setFont(new Font(null, Font.BOLD, 15));
        this.lables.add(FreeText);
        this.dataChartPane.add(FreeText);
        this.dataChartPane.updateUI();
        return FreeText;
    }

    //移除浮动字
    public void RemoveLable(JLabel lable) {
        if (this.lables.remove(lable)) {
            this.dataChartPane.remove(lable);
            this.dataChartPane.updateUI();
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="设置默认颜色">
    private Paint def_color = Color.red;

    public void SetColor(Paint color) {
        lables.forEach((label) -> {
            label.setForeground((Color) color);
        });
        def_color = color;
    }
    // </editor-fold>

}
