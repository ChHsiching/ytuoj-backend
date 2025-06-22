package com.hsipig.ytuoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsipig.ytuoj.model.entity.Question;
import com.hsipig.ytuoj.service.QuestionService;
import com.hsipig.ytuoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author chhsich
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2025-06-22 18:51:16
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




