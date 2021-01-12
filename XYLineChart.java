package org.jfree.deneme;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.*;
import org.jfree.data.*;

public class XYLineChart {
    public static void main(String arg[]){
  
  }
    public void start (){
        XYSeries series = new XYSeries("Ortalama Ağırlık");
        series.add(20.0, 20.0);
        series.add(40.0, 25.0);
        series.add(55.0, 50.0);
        series.add(70.0, 65.0);
        XYDataset xyDataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart
        ("XYÇizgi Grafiği", "Yaş", "Ağırlık",
       xyDataset, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frame1=new ChartFrame("XYLine Chart",chart);
        frame1.setVisible(true);
        frame1.setSize(800,500);
    }
}
