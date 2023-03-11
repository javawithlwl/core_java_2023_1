package com.careerit.jfs.basics.json;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CurrencyWrapper {
    private Map<String,CurrencyDetails> map;
}
