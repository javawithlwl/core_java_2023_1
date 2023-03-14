package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private int cid;
    private String name;
    private String email;
    private String mobile;
    private boolean status;
}
