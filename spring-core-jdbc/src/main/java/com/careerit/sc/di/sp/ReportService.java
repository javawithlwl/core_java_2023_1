package com.careerit.sc.di.sp;

import java.io.File;
import java.time.LocalDate;

public interface ReportService {

    String generateReport(LocalDate fromDate, LocalDate toDate);
}
