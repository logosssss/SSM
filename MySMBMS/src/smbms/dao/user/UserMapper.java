package smbms.dao.user;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

import smbms.entity.User;

/**
 * 用户数据映射接口
 * @author 86185
 *
 */
public interface UserMapper {
	/**
	 * 通過@Param參數注解的方式實現多參數入參并且实现翻页
	 * 
	 * @param user
	 * @return
	 */
	List<User>getUserList(@Param("uName")String name,@Param("uRole")Integer role,
			@Param("from")Integer currentPageNo,@Param("pageSize")Integer pageSize);
	
	List<User>getUserListByUser(User user);
	
	/**
	 * 根据输入的用户对象增加一个用户信息
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 根据输入的用户信息修改用户信息
	 * @param user
	 * @return
	 */
	int modifyUser(User user);
	
	/**
	 * 通過@Param參數注解的方式實現多參數入參
	 * 功能：根據id和修改后的密碼來修改密碼
	 * @param id
	 * @param pwd
	 * @return
	 */
	int updatePassWord(@Param("id")Integer id,@Param("userPassWord")String pwd);
	
	/**
	 * 通過@Param參數注解的方式實現多參數入參
	 * 功能：根據roleid獲取用戶對象集合
	 * @param roleid
	 * @return
	 */
	List<User>getUserListByRoleId(@Param("userRole")Integer roleid);
	
	/**
	 * 通過@Param參數注解的方式實現參數入參
	 * 功能：根據userid獲取地址對象集合
	 * @param userId
	 * @return
	 */
	List<User>getAddressListByUserId(@Param("id")Integer userId);
	
	/**
	 * 根据输入的用户角色id查询用户对象集合
	 * 参数：数组
	 * @param roleIds
	 * @return
	 */
	List<User>getUserListByRoleId_foreach_array(Integer[] roles);
	
	/**
	 * 根据输入的用户角色id查询用户对象集合
	 * 参数：集合
	 * @param roleIds
	 * @return
	 */
	List<User>getUserListByRoleId_foreach_array(List<Integer> roles);
	
	/**
	 * 根据性别和等级id集合来获取用户集合
	 * 参数 map
	 * @param maps
	 * @return
	 */
	List<User>getUserByGenderandRolesMap(Map<String, Object> maps);
	
	/**
	 * 根据输入的参数来返回用户集合（选择其中一个）
	 * @param name 名称 1
	 * @param role 等级 2
	 * @param code 编码 3
	 * @param date 时间（默认）
	 * @return
	 */
	List<User>getUserList_choose(@Param("userName")String name,
			@Param("userRole")Integer role,@Param("userCode")String code,
			@Param("creationDate")Date date);
	
	/**
	 * 根据等级id获取用户集合
	 * 参数：单参数map
	 * @param map
	 * @return
	 */
	List<User>getUserByRoleIds_foreach_map(Map<String, Object> map);
}
