package com.example.springdemoapp.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class DemoModel {
    private String name;
    private int score;
    private boolean done;
    private float value;
}
