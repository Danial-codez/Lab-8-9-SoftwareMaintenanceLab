
package com.uet.report;

import java.util.List;
import java.util.Objects;

public class ReportManager {

    private final ReportFormatter formatter;
    private final Notifier notifier;

    public ReportManager(ReportFormatter formatter, Notifier notifier) {

        this.formatter = Objects.requireNonNull(formatter);
        this.notifier = Objects.requireNonNull(notifier);

    }

    public void generate(List<String> data, boolean sendEmail) {

        Objects.requireNonNull(data, "Data cannot be null");

        String output = formatter.format(data);

        System.out.println("Generated Report: " + output);

        if (sendEmail) {
            notifier.send("admin@company.com", output);
        }

    }
}
