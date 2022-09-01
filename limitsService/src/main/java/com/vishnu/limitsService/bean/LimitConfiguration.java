package com.vishnu.limitsService.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitConfiguration {
    private int minimum;
    private int maximum;

    protected LimitConfiguration() {
    }
}
