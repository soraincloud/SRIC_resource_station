package com.evan.back.controller;

import com.evan.back.pojo.Resources;
import com.evan.back.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourcesController
{
    @Autowired
    ResourcesService resourcesService;

    @CrossOrigin
    @GetMapping("/api/resources")
    public List<Resources> list() throws Exception
    {
        return resourcesService.list();
    }

    @CrossOrigin
    @PostMapping("/api/resources")
    public Resources addOrUpdate(@RequestBody Resources resources) throws Exception
    {
        resourcesService.addOrUpdate(resources);
        return resources;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void delete(@RequestBody Resources resources) throws Exception
    {
        resourcesService.deleteById(resources.getId());
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/resources")
    public List<Resources> listByCateGory(@PathVariable("cid") int cid) throws Exception
    {
        if(0 != cid)
        {
            return resourcesService.listByCategory(cid);
        }
        else
        {
            return list();
        }
    }

    @CrossOrigin
    @GetMapping("/api/search")
    public List<Resources> searchResult(@RequestParam("keywords") String keywords)
    {
        // 关键词为空时查询出所有书籍
        if ("".equals(keywords))
        {
            return resourcesService.list();
        }
        else
        {
            return resourcesService.Search(keywords);
        }
    }

}
