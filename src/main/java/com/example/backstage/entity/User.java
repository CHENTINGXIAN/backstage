package com.example.backstage.entity;

//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 用户实体
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/9/3 20:27
 * @since JDK17
 */

//@NoArgsConstructor      //自动创建无参构造方法
//@AllArgsConstructor     //自动创建有参构造方法
@TableName(value = "sys_user")
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    @JsonIgnore //忽略掉密码，使得前端后台无法看到用户密码
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;

    //其实把下面的avatar写成avatarUrl之后，也可以不写上面的别名
    @TableField(value = "avatar_url")   //指定数据库的字段别名
    private String avatar;



}
