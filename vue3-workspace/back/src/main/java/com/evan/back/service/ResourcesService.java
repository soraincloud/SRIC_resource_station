package com.evan.back.service;

import com.evan.back.dao.ResourcesDAO;
import com.evan.back.pojo.Resources;
import com.evan.back.pojo.ResourcesCategory;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService
{
    @Autowired
    ResourcesDAO resourcesDAO;
    @Autowired
    CategoryService categoryService;

    //将所有内容排序
    public List<Resources> list()
    {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return resourcesDAO.findAll(sort);
    }

    //添加或更改内容
    public void addOrUpdate(Resources resources)
    {
        resourcesDAO.save(resources);
    }

    //通过id删除
    public void deleteById(int id)
    {
        resourcesDAO.deleteById(id);
    }

    //通过分类查询
    public List<Resources> listByCategory(int cid)
    {
        ResourcesCategory resourcesCategory = categoryService.get(cid);
        return resourcesDAO.findAllByCategory(resourcesCategory);
    }
}
