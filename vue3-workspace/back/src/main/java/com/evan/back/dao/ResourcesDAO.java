package com.evan.back.dao;

import com.evan.back.pojo.Resources;
import com.evan.back.pojo.ResourcesCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResourcesDAO extends JpaRepository<Resources,Integer>
{
    List<Resources> findAllByCategory(ResourcesCategory category);
    List<Resources> findAllByTitleLike(String keyword);
}
