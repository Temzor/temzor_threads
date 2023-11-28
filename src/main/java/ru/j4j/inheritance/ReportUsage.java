package ru.j4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        HtmlReport htmlReport = new HtmlReport();
        System.out.println(textReport.generate("Report's name", "Report's body"));
        System.out.println(htmlReport.generate("Report's name", "Report's body"));

    }
}
