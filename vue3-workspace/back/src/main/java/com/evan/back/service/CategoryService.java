package com.evan.back.service;

import com.evan.back.dao.CategoryDAO;
import com.evan.back.pojo.ResourcesCategory;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService
{
    @Autowired
    CategoryDAO categoryDAO;

    //排序分类中的项目
    public List<ResourcesCategory> list()
    {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    //通过id获取类别
    public ResourcesCategory get(int id)
    {
        ResourcesCategory c = categoryDAO.findById(id).orElse(null);
        return c;
    }
}
