package com.careerit.sc.di.sp;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service

public class ProductService {

  private final ReportService reportService;

  public ProductService(@Qualifier("pdfReportService") ReportService reportService) {
    this.reportService = reportService;
  }

  public void downloadReport(LocalDate from, LocalDate to) {
    String message = reportService.generateReport(from, to);
    System.out.println(message);
  }
}
