package smbms.dao.role;


import java.util.List;

import smbms.entity.Role;

public interface RoleMapper {
	
	/**
	 * ��������ĵȼ������޸ĵȼ������Ϣ
	 * @param role
	 * @return
	 */
	public int updateRoleByid(Role role);
	
}
