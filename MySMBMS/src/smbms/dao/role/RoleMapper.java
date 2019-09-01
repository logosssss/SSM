package smbms.dao.role;


import java.util.List;

import smbms.entity.Role;

public interface RoleMapper {
	
	/**
	 * 根据输入的等级对象修改等级表的信息
	 * @param role
	 * @return
	 */
	public int updateRoleByid(Role role);
	
}
