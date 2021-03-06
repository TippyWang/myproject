package com.tippy;

import java.util.ArrayList;
import java.util.List;

public class ReportTest {
    public static void main(String[] args) {
        Report financeReport = new FinanceReport();
        Report healthReport = new HealthReport();
        List<Report> reports = new ArrayList<>();
        reports.add(financeReport);
        reports.add(healthReport);
        for(Report report : reports){
            report.load();
            report.print();
        }
    }
}
