package com.cyn.docker.service;

import com.cyn.docker.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2022 -01-24 09:33:54
 */
public interface UserService {

    /**
     * Add user.
     *
     * @param user the user
     */
    void addUser(User user);

    /**
     * Find user by id user.
     *
     * @param id the id
     * @return the user
     */
    User findUserById(Integer id);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象 user
     */
    User queryById(Integer id);

    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果 page
     */
    Page<User> queryByPage(User user, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象 user
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象 user
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功 boolean
     */
    boolean deleteById(Integer id);

}
