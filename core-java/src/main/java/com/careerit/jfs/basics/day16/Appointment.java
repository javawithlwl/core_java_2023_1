package com.careerit.jfs.basics.day16;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.StringJoiner;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Appointment {

  private String expertName;
  private String patientName;
  private String location;
  private LocalTime startTime;
  private LocalTime endTime;
  private LocalDate date;
  public static void main(String[] args) {

          Appointment appointment = Appointment.builder()
              .patientName("Rajesh")
              .expertName("Dr Suman")
              .date(LocalDate.now())
              .startTime(LocalTime.of(10,30,0))
              .endTime(LocalTime.of(11,0,0))
              .location("Bangalore")
              .build();
    System.out.println(appointment);
  }
}
