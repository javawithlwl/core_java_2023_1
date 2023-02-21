package com.careerit.jfs.basics.collections.list.stu;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trainer {
    private int id;
    private String name;
    private String qualification;
    private float exp;
}
