package com.cyn.docker.controller;

import cn.hutool.core.util.IdUtil;
import com.cyn.docker.entity.User;
import com.cyn.docker.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Random;

/**
 * 用户表(User)表控制层
 *
 * @author makejava
 * @since 2022-01-24 09:33:38
 */
@Api(value = "用户表")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @ApiOperation("数据库新增3条记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addUser()
    {
        for (int i = 1; i <=3; i++) {
            User user = new User();

            user.setUsername("cyn"+i);
            user.setPassword(IdUtil.simpleUUID().substring(0,6));
            user.setSex((int) new Random().nextInt(2));
            user.setDeleted(0);
            userService.addUser(user);
        }
    }

    @ApiOperation("查询1条记录")
    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable Integer id)
    {
        return userService.findUserById(id);
    }


    /**
     * 分页查询
     *
     * @param user        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<User>> queryByPage(User user, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userService.queryByPage(user, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

