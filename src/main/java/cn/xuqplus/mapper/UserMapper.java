package cn.xuqplus.mapper;

import cn.xuqplus.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017-04-08.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id} limit 1")
    User findById(@Param("id") Long id);

    @Select("select * from user")
    List<User> findAll();
}
