
package org.jfree.deneme;
import java.awt.*;
import java.io.*;
import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.chart.plot.*;

public class AreaChart {
    public static void main(String arg[]){
        
  }
    
    public  void start(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(4.0, "Fen", "Ramazan");
        dataset.addValue(3.0, "Matematik", "Ramazan");
        dataset.addValue(5.0, "Fen", "Varol");
        dataset.addValue(2.0,"Matematik", "Varol");
        dataset.addValue(3.0, "Fen", "Ali");
        dataset.addValue(5.0, "Matematik", "Ali");
        dataset.addValue(6.0, "Fen", "Tolga");
        dataset.addValue(2.0, "Matematik", "Tolga");
        dataset.addValue(3.0,"Fen", "Sinan");
        dataset.addValue(5.0, "Matematik", "Sinan");

        JFreeChart chart = ChartFactory.createAreaChart
         ("Öğrenci İşaretleri arasında Karşılaştırma","Öğrenciler", "isaretler ",
          dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.blue); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setForegroundAlpha(0.7f);
        p.setRangeGridlinePaint(Color.red); 
        p.setDomainGridlinesVisible(true);
        p.setDomainGridlinePaint(Color.black);
        CategoryItemRenderer renderer = p.getRenderer();
        renderer.setSeriesPaint(1, Color.red);
        renderer.setSeriesPaint(0, Color.green);
        ChartFrame frame1=new ChartFrame("Alan Grafiği",chart);
        frame1.setVisible(true);
        frame1.setSize(800,500);
    }
}
