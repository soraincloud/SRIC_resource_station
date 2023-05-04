package com.evan.back.dao;

import com.evan.back.pojo.ResourcesCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<ResourcesCategory,Integer> { }
