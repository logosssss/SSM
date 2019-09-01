package smbms.service.user;

import java.util.List;

import smbms.entity.User;

/**
 * �û�ҵ��ӿ�
 * @author 86185
 *
 */
public interface UserService {
	
	/**
	 * ����������û���ȡ�û�
	 * @param user
	 * @return
	 */
	public List<User>findUserAllWithUserName(User user);
	
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
}
