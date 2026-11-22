
package com.uet.report;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> data = Arrays.asList(
                "Ali",
                "Ahmed",
                "Danial"
        );

        // PDF Report
        ReportFormatter pdfFormatter = new PdfFormatter();
        Notifier emailNotifier = new EmailNotifier();

        ReportManager pdfManager =
                new ReportManager(pdfFormatter, emailNotifier);

        System.out.println("===== PDF REPORT =====");
        pdfManager.generate(data, true);


        // CSV Report
        ReportFormatter csvFormatter = new CsvFormatter();

        ReportManager csvManager =
                new ReportManager(csvFormatter, emailNotifier);

        System.out.println("\n===== CSV REPORT =====");
        csvManager.generate(data, false);

    }
}
