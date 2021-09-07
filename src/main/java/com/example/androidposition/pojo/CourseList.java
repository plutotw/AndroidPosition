package com.example.androidposition.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseList {
    private String uuid;
    private String courseId;
    private String courseName;
    private String teacher;
    private String time;
    private int number;
    private int signNumber;
}
