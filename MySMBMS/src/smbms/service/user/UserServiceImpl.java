package smbms.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smbms.dao.user.UserMapper;
import smbms.entity.User;

//ע���������
//ע������
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

	//ע���Զ���װ
	@Autowired
	private UserMapper userMapper;//����UserMapper�ӿ�����
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Override
	public List<User> findUserAllWithUserName(User user) {
	
		try {
			return userMapper.getUserListByUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@Override
	public boolean addUser(User user) {
		boolean flag = false;
		try {
			if(userMapper.addUser(user) ==1){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}

}
