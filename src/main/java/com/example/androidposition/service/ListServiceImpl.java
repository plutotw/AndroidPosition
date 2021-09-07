package com.example.androidposition.service;

import com.example.androidposition.dao.ListDao;
import com.example.androidposition.pojo.CourseList;
import com.example.androidposition.util.GetCurrentTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class ListServiceImpl implements ListService{

    @Resource
    private ListDao listDao;

    @Override
    public List<CourseList> getList() {
        List<CourseList> list = listDao.getList();
        return list;
    }

    @Override
    public int addList(CourseList list) {
        list.setUuid(String.valueOf(UUID.randomUUID()));
        list.setTime(GetCurrentTime.getCurrentTime());
        return listDao.addList(list);
    }
}
