package com.careerit.sc.di.sp;

import org.springframework.stereotype.Service;

import java.io.File;
import java.time.LocalDate;

@Service
public class PdfReportService implements  ReportService{
  @Override
  public String generateReport(LocalDate fromDate, LocalDate toDate) {
    return "Pdf report";
  }
}
