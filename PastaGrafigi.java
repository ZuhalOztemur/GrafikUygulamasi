package org.jfree.deneme;
import java.awt.*;
import org.jfree.chart.*;
import org.jfree.chart.title.*;
import org.jfree.data.general.DefaultPieDataset;

public class PastaGrafigi {
    public static void main(String arg[]){
  
  }
    public void start (){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("EGE BÖLGESİ", new Integer(15));
        pieDataset.setValue("İÇ ANADOLU BÖLGESİ", new Integer(30));
        pieDataset.setValue("MARMARA BÖLGESİ", new Integer(40));
        pieDataset.setValue("AKDENİZ BÖLGESİ", new Integer(20));
        pieDataset.setValue("KARADENİZ BÖLGESİ", new Integer(20));
        pieDataset.setValue("DOĞU ANADOLU BÖLGESİ", new Integer(20));
        pieDataset.setValue("GÜNEY DOĞU ANADOLU BÖLGESİ", new Integer(15));
        JFreeChart chart = ChartFactory.createPieChart
       ("BÖLGELERE GÖRE NÜFUS DAĞILIMI", pieDataset, true,true,true);

        ChartFrame frame1=new ChartFrame("Pasta Grafiği",chart);
        frame1.setVisible(true);
        frame1.setSize(800,500);
    }
}

