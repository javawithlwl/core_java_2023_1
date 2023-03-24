package com.careerit.sc.di.sp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Primary
public class ExcelReportService implements  ReportService{
  @Override
  public String generateReport(LocalDate fromDate, LocalDate toDate) {
    return "Excel report";
  }
}
