package com.example.backstage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backstage.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户接口
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/9/8 22:54
 * @since JDK17
 */

//@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from sys_user")
//    List<User> findAll();
//
//
//    @Insert("INSERT into sys_user(username,password,nickname,email,phone,address) values (#{username},#{password},#{nickname},#{email},#{phone},#{address})")
//    int insert(User  user);
//
////    @Update("update sys_user " +
////            "set username = #{username},password = #{password},nickname = #{nickname},email = #{email},phone = #{phone}," +
////            "address = #{address} where id = #{id}")
//    int update(User user);
//
//
//    @Delete("delete from sys_user where id = #{id}")
//    Integer deleteById(@Param("id") Integer id);
//
////    @Select("select * from sys_user where username like  #{username} limit #{pageNum},#{pageSize}")
//    @Select("select * from sys_user where username like #{username} limit #{pageNum},#{pageSize}")
//    List<User> selectPage(Integer pageNum, Integer pageSize,String username);
//
//
//    /**
//     * 查询出sys_user总的条数
//     * @return  sys_user总的条数
//     */
//    @Select("select count(*) from sys_user where username like #{username} ")
//    Integer selectTotal(String username);


}





/*



    @Insert("INSERT into sys_user(username,password,nickname,email,phone,address) values (#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User  user);


//    @Update("update sys_user " +
//            "set username = #{username},password = #{password},nickname = #{nickname},email = #{email},phone = #{phone}," +
//            "address = #{address} where id = #{id}")
    int update(User user);

    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);


    @Select("select * from sys_user where username like #{username} limit #{pageNum},#{pageSize}")
    List<User> selectPage(Integer pageNum, Integer pageSize,String username);

    /**
     * 查询出sys_user总的条数
     * @return  sys_user总的条数
     */
    /*
    @Select("select count(*) from sys_user where username like concat('%',#{username},'%')")
    Integer selectTotal(String username);
*/
