package cn.jikuodong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jikuodong.mapper.CategoryMapper;
import cn.jikuodong.pojo.Category;
import cn.jikuodong.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;
     
    public List<Category> list(){
        return categoryMapper.list();
    };
 
}
