package com.careerit.jfs.basics.ems;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Currency {
    private String code;
    private String country;
    private String symbol;
}
