package com.careerit.sc.di;

import java.io.File;
import java.util.List;

public class CsvReportService implements  ReportService{
  @Override
  public File getReport(List<List<String>> data) {
    //Logic
    return new File("sample_"+System.currentTimeMillis()+".csv");
  }
}
