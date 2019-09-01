package smbms.dao.user;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

import smbms.entity.User;

/**
 * �û�����ӳ��ӿ�
 * @author 86185
 *
 */
public interface UserMapper {
	/**
	 * ͨ�^@Param����ע��ķ�ʽ���F�������녢����ʵ�ַ�ҳ
	 * 
	 * @param user
	 * @return
	 */
	List<User>getUserList(@Param("uName")String name,@Param("uRole")Integer role,
			@Param("from")Integer currentPageNo,@Param("pageSize")Integer pageSize);
	
	List<User>getUserListByUser(User user);
	
	/**
	 * ����������û���������һ���û���Ϣ
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * ����������û���Ϣ�޸��û���Ϣ
	 * @param user
	 * @return
	 */
	int modifyUser(User user);
	
	/**
	 * ͨ�^@Param����ע��ķ�ʽ���F�������녢
	 * ���ܣ�����id���޸ĺ���ܴa���޸��ܴa
	 * @param id
	 * @param pwd
	 * @return
	 */
	int updatePassWord(@Param("id")Integer id,@Param("userPassWord")String pwd);
	
	/**
	 * ͨ�^@Param����ע��ķ�ʽ���F�������녢
	 * ���ܣ�����roleid�@ȡ�Ñ��󼯺�
	 * @param roleid
	 * @return
	 */
	List<User>getUserListByRoleId(@Param("userRole")Integer roleid);
	
	/**
	 * ͨ�^@Param����ע��ķ�ʽ���F�����녢
	 * ���ܣ�����userid�@ȡ��ַ���󼯺�
	 * @param userId
	 * @return
	 */
	List<User>getAddressListByUserId(@Param("id")Integer userId);
	
	/**
	 * ����������û���ɫid��ѯ�û����󼯺�
	 * ����������
	 * @param roleIds
	 * @return
	 */
	List<User>getUserListByRoleId_foreach_array(Integer[] roles);
	
	/**
	 * ����������û���ɫid��ѯ�û����󼯺�
	 * ����������
	 * @param roleIds
	 * @return
	 */
	List<User>getUserListByRoleId_foreach_array(List<Integer> roles);
	
	/**
	 * �����Ա�͵ȼ�id��������ȡ�û�����
	 * ���� map
	 * @param maps
	 * @return
	 */
	List<User>getUserByGenderandRolesMap(Map<String, Object> maps);
	
	/**
	 * ��������Ĳ����������û����ϣ�ѡ������һ����
	 * @param name ���� 1
	 * @param role �ȼ� 2
	 * @param code ���� 3
	 * @param date ʱ�䣨Ĭ�ϣ�
	 * @return
	 */
	List<User>getUserList_choose(@Param("userName")String name,
			@Param("userRole")Integer role,@Param("userCode")String code,
			@Param("creationDate")Date date);
	
	/**
	 * ���ݵȼ�id��ȡ�û�����
	 * ������������map
	 * @param map
	 * @return
	 */
	List<User>getUserByRoleIds_foreach_map(Map<String, Object> map);
}
