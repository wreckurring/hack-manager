package com.hackmanager.dto;

import lombok.Data;

@Data
public class HackRequestDTO {

    private String title;

    private String description;

    private boolean completed;
}