package com.careerit.iplstats.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Player {

    private int id;
    private String name;
    private String country;
    private String role;
    private String team;
    private double amount;
}
