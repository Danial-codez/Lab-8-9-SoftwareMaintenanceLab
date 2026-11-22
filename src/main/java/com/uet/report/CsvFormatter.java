/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uet.report;

import java.util.List;

public class CsvFormatter implements ReportFormatter {

    @Override
    public String format(List<String> data) {
        return "CSV Report: " + String.join(",", data);
    }
}
