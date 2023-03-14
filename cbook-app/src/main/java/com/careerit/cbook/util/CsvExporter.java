package com.careerit.cbook.util;

import org.supercsv.io.CsvMapWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class CsvExporter {

    private CsvMapWriter csvMapWriter;
    private String[] headings;
    private String[] headingKeys;

    public CsvExporter(String fileName,String[] headings,String[] headingKeys){
        try {
            csvMapWriter = new CsvMapWriter(new FileWriter(fileName), CsvPreference.STANDARD_PREFERENCE);
            this.headings = headings;
            this.headingKeys = headingKeys;
            csvMapWriter.writeHeader(headings);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeMap(Map<String,Object> map){
        try {
            if (headingKeys != null) {
                System.out.println(map);
                csvMapWriter.write(map, headingKeys);
            } else {
                csvMapWriter.write(map,headings);
            }
        }catch(Exception e){
                e.printStackTrace();
        }
    }
    public void close(){
        try {
            csvMapWriter.flush();
            csvMapWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
