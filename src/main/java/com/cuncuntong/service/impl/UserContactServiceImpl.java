package com.cuncuntong.service.impl;

import com.cuncuntong.entity.po.UserContact;
import com.cuncuntong.mapper.UserContactMapper;
import com.cuncuntong.service.UserContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户通讯录表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2025-08-31
 */
@Service
public class UserContactServiceImpl extends ServiceImpl<UserContactMapper, UserContact> implements UserContactService {

}
