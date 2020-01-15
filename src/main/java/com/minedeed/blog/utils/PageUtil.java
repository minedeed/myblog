package com.minedeed.blog.utils;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public @Data class PageUtil<T> {
    private int code;
    private String msg;
    private Long count;
    private List<T> data = new ArrayList<T>();
}
