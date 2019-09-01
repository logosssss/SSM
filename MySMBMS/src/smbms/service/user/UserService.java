package smbms.service.user;

import java.util.List;

import smbms.entity.User;

/**
 * 用户业务接口
 * @author 86185
 *
 */
public interface UserService {
	
	/**
	 * 根据输入的用户获取用户
	 * @param user
	 * @return
	 */
	public List<User>findUserAllWithUserName(User user);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
}
