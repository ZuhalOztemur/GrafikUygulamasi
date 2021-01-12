
package org.jfree.deneme;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtils;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.*;
import org.jfree.chart.*;

public class BarGrafigi extends ApplicationFrame {
 public BarGrafigi (String title) {
  super(title);

  final CategoryDataset dataset = createDataset();
  final JFreeChart chart = createChart(dataset);

  final ChartPanel chartPanel = new ChartPanel(chart);
  chartPanel.setPreferredSize(new java.awt.Dimension(800, 500));
  setContentPane(chartPanel);
  }

    
    private CategoryDataset createDataset() { 
  final double[][] data = new double[][] {
  {210,300,320,265,299},
  {200,304,201,201,340},
  };
 return DatasetUtils.createCategoryDataset("Grup ", 
   "Maç ", data);
  }

  private JFreeChart createChart(final CategoryDataset dataset) {

  final JFreeChart chart = ChartFactory.createBarChart(
  "Bar Grafiği", "Kategori", "Skor", dataset,
  PlotOrientation.VERTICAL, true, true, false);
  return chart;
  }
  public static void main(final String[] args) {

  }
  public void start (){
  BarGrafigi chart = new BarGrafigi("Bar Grafiği");
  chart.pack();
  UIUtils.centerFrameOnScreen(chart);
  chart.setVisible(true);
  }
}
