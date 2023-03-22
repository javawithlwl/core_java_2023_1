package com.careerit.sc.di;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.List;

@Getter
@Setter
public class ContactService {

    private ReportService reportService;



    public void export(List<List<String>> data){
          File file = reportService.getReport(data);
          System.out.println(file+" is going to upload into s3");

    }
}
