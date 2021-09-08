package com.example.androidposition.dao;

import com.example.androidposition.pojo.CourseList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ListDao {

    @Select(value = "SELECT * FROM list ORDER BY time")
    List<CourseList> getList();

    @Insert(value = "INSERT INTO list VALUES(#{uuid},#{courseId},#{courseName},#{teacher},#{time},#{number},#{signNumber})")
    int addList(CourseList list);
}
