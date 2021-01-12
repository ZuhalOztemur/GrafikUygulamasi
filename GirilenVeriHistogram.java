package org.jfree.deneme;
import org.jfree.chart.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GirilenVeriHistogram {
    public static void main(String[] args) throws IOException {
    // deneme
    }
    public void start() throws IOException {
        int i, s = 0;
        double vals[] = new double[15];
        Scanner sc = new Scanner(System.in);
        
         System.out.println("15 tane sayı girin. !!! Her sayı girdiğinizde enter'a basın.!!!");
         
          for (i = 0; i < vals.length; i++) {
            vals[i] = sc.nextInt();
        }
          
        var dataset = new HistogramDataset();
        dataset.addSeries("değişken", vals, 2000);
        
        JFreeChart histogram = ChartFactory.createHistogram("Girdiğiniz Veri Histogramı",
                "Değişken Değerleri", "Görülme Sayıları", dataset);
        
                ChartUtils.saveChartAsPNG(new File("histogram.png"), histogram, 450, 400); 
                ChartFrame frame1=new ChartFrame("Histogram",histogram);
                frame1.setVisible(true);
                frame1.setSize(800,500);
    }
}
