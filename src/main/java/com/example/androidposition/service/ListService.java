package com.example.androidposition.service;

import com.example.androidposition.pojo.CourseList;

import java.util.List;


public interface ListService {
    List<CourseList> getList();

    int addList(CourseList list);
}
