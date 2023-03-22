package com.careerit.sc.di;

import java.io.File;
import java.util.List;

public interface ReportService {

      File getReport(List<List<String>> data);

}
