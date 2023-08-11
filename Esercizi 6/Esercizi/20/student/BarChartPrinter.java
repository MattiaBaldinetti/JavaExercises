import java.util.ArrayList;

public class BarChartPrinter
{
    public static void main(String[] args)
    {
        BarChart chart = new BarChart();
        ArrayList<Integer> list = chart.readValues();
        chart.printBarChart(list);
    }
}
