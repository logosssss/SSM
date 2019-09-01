package smbms.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import smbms.dao.bill.BillMapper;
import smbms.dao.provider.ProviderMapper;
import smbms.dao.role.RoleMapper;
import smbms.dao.user.UserMapper;
import smbms.entity.Bill;
import smbms.entity.Provider;
import smbms.entity.Role;
import smbms.entity.User;
import smbms.service.bill.BillService;
import smbms.service.provider.ProviderService;
import smbms.service.user.UserService;

public class Demo {
	/*SqlSession sqlSession = null;*/
	Logger logger = Logger.getLogger(Demo.class.getName());
	
	
	/**
	 * ����trim ��������ѯ�û���Ϣ
	 */
	/*@Test
	public void testUser(){
		List<User> users = new LinkedList<User>();
		Integer currentPageNo = 2;
		Integer pageSize = 3;
		users = sqlSession.getMapper(UserMapper.class).getUserList("",null,currentPageNo*3,pageSize);
		logger.debug("UserSise��"+users.size());
		for (User user : users) {
			logger.debug("User ToString��"+user.toString());
		} 
	}
	@Test
	*//**
	 * ����if �����ж�sql����ѯ������Ϣ
	 *//*
	public void testBillAsIf(){
		logger.debug("--------------------------");
		logger.debug("billListTest--------------");
		List<Bill> bills = sqlSession.getMapper(BillMapper.class).getBillByIdAndName(2, "", null);
		logger.debug("billsSise��"+bills.size());
		for (Bill bill : bills) {
			logger.debug("billToString��"+bill.toString());
		}
	}
	
	*//**
	 * ����where ������ѯ��Ӧ����Ϣ
	 *//*
	@Test
	public void testProviderAsWhere(){
		Integer currentPageNo = 1;
		Integer pageSize = 3;
		logger.debug("--------------------------");
		logger.debug("providerListTest--------------");
		List<Provider> providers = sqlSession.getMapper(ProviderMapper.class).getAllBillByProviderid(null, "",currentPageNo*pageSize,pageSize);
		logger.debug("providersSise��"+providers.size());
		for (Provider p : providers) {
			logger.debug("providerToString��"+p.toString());
		}
	}
	
	*//**
	 * �����û���Ϣ
	 *//*
	@Test
	public void testUpdateUserAsSet(){
		logger.debug("--------------------------");
		logger.debug("UserUpdateTest--------------");
		User user = new User();
		user.setId(16);
		
		int n = sqlSession.getMapper(UserMapper.class).modifyUser(user);
		logger.debug("testUpdateUserAsSet Count----->"+n);
		if(n>0){
			sqlSession.commit();
			logger.debug("sqlComit");
		}else{
			sqlSession.rollback();
			logger.debug("sqlrollback");
		}
	}

	*//**
	 * �޸Ķ�����Ϣ������trim-if ������
	 *//*
	@Test
	public void updateProvider(){
		logger.debug("--------------------------");
		logger.debug("ProviderUpdateTest--------------");
		Provider p = new Provider();
		int count = 0;
		try {
			p.setId(2);
			p.setModifyBy(1);
			p.setModifyDate(new Date());
			p.setProAddress("���Ե�ַ");
			p.setProCode("���Ա���");
			count = sqlSession.getMapper(ProviderMapper.class).updateProvider(p);
			sqlSession.commit();
			logger.debug("sqlComit");
			logger.debug("ProviderUpdateTest Count----->"+count);
		} catch (Exception e) {
			sqlSession.rollback();
			logger.debug("sqlrollback");
		}
	}
	
	*//**
	 * ���������Ȩ��id��������ѯ�û����ϣ�����foreach������
	 *//*
	@Test
	public void getUserListByRoleId_foreach_arrayTest(){
		logger.debug("--------------------------");
		logger.debug("getUserListByRoleId_foreach_arrayTest--------------");
		Integer[] roles = {3};
		List<Integer> ros = new LinkedList<Integer>();
		ros.add(2);
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserListByRoleId_foreach_array(ros);
		logger.debug("UserSise��"+users.size());
		for (User user : users) {
			logger.debug("User ToString��"+user.toString());
		}
	}
	
	*//**
	 * ����������Ա�͵ȼ���������ѯ�û����ϣ�����foreach���� map��������
	 *//*
	@Test
	public void getUserByGenderandRolesMap(){
		logger.debug("--------------------------");
		logger.debug("getUserByGenderandRolesMap--------------");
		
		Map<String, Object> maps = new HashMap<String,Object>();
		List<Integer> rodes = new LinkedList<Integer>();
		rodes.add(2);
		maps.put("gender", 2);
		maps.put("rodes",rodes);
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserByGenderandRolesMap(maps);
		
		logger.debug("UserSise��"+users.size());
		for (User user : users) {
			logger.debug("User ToString��"+user.toString());
		}
	}
	
	*//**
	 * ��������Ĳ���������ѯ�û���Ϣ������ choose ������
	 *//*
	@Test
	public void getUserList_chooseTest(){
		logger.debug("--------------------------");
		logger.debug("getUserList_chooseTest--------------");
		String name = "��";
		String userCode = "";
		Integer role = 2;
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserList_choose(name, role, userCode, date);
		logger.debug("UserSise��"+users.size());
		for (User user : users) {
			logger.debug("User ToString��"+user.toString());
		}
	}
	
	*//**
	 * ���ݹ�Ӧ��id�����ȡ�������ϣ�����foreach ������
	 *//*
	@Test
	public void getBillListByProviderIds_array(){
		logger.debug("--------------------------");
		logger.debug("getBillListByProviderIds_array--------------");
		Integer[] providerIds = {1,2,3};
		List<Bill> bills = sqlSession.getMapper(BillMapper.class).getBillByProviderIds_foreach(providerIds);
		for (Bill bill : bills) {
			logger.debug("BillToString��"+bill.toString());
		}
	}
	
	*//**
	 * ���ݵȼ��������ϻ�ȡ�û���Ϣ���ϣ�����foreach �� ��������װmap �ķ�����
	 *//*
	@Test
	public void getUserListByRoleIds_foreach_Map_Test(){
		List<Integer> roles = new LinkedList<Integer>();
		roles.add(3);
		Map<String, Object>  maps = new HashMap<String,Object>();
		maps.put("roles", roles);
		
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserListByRoleId_foreach_array(roles);
		logger.debug("--------------------------");
		logger.debug("getUserListByRoleIds_foreach_Map_Test--------------");
		logger.debug("UserSise��"+users.size());
		for (User user : users) {
			logger.debug("User ToString��"+user.toString());
		}
	}
	
	*//**
	 * ���ݵȼ�id���޸ĵȼ�����Ϣ������ if-set ������
	 *//*
	@Test
	public void updateRoleByRoleid(){
		Role role = new Role();
		role.setId(1);
		role.setRoleCode("���Ա���");
		role.setRoleName("��������");
		try {
			sqlSession.getMapper(RoleMapper.class).updateRoleByid(role);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
	}*/
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/**
	 * spring �� mybatis ���ʹ�ò��ԣ��û���Ϣ��ѯ
	 */
	@Test
	public void springUser(){
		System.out.println(1);
		
		UserService userService = (UserService) context.getBean("userService");
		User u = new User();
		u.setUserName("��");
		u.setUserRole(2);
		List<User> userList = new ArrayList<User>();
		userList = userService.findUserAllWithUserName(u);
		
		for (User user : userList) {
			logger.debug("UserListTest��"+user.toString());
		}
	}
	
	/**
	 * ��ѯ���й�Ӧ��
	 */
	@Test
	public void findAllProviderTest() {
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		List<Provider> providerList = providerService.findAllProvider();
		for (Provider provider : providerList) {
			logger.debug("ProviderListTest��"+provider.toString());
		}
	}
	
	/**
	 * �������Ʋ�ѯ���й�Ӧ��
	 */
	@Test
	public void findAllProviderByNameTest() {
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		List<Provider> providerList = providerService.findAllProviderByName("��");
		for (Provider provider : providerList) {
			logger.debug("ProviderListTest��"+provider.toString());
		}
	}
	
	/**
	 * ʹ��@Paramע�Ⅲ���녢�ķ�ʽ��ԃӆ�Ό��󼯺�
	 * ���ܣ�����ݔ��Ĺ�Ӧ��id����Ʒ���Q���Ƿ񸶿����ȫ��ӆ�Ό���
	 * @param id
	 * @param name
	 * @return
	 */
	@Test
	public void findBillByParamTest(){
		BillService billService = (BillService) context.getBean("billService");
		List<Bill> billList = billService.findBillListByParam(null, "ϴ", null);
		for (Bill bill : billList) {
			logger.debug("billListTest��"+bill.toString());
		}
	}
	
	/**
	 * ��ӹ�Ӧ��
	 */
	@Test
	public void addProviderTest(){
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		Provider provider = new Provider();
		provider.setProName("��Ӳ�������");
		provider.setProPhone("12345678901");
		provider.setProCode("1");
		int count = providerService.addProvider(provider);
		logger.info("addProviderTest rows---->"+count);
	}
	
	/**
	 * ����idɾ����Ӧ��
	 */
	@Test
	public void deleteProviderTest(){
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		int count = providerService.deleteProvider(16);
		logger.info("deleteProviderTest rows---->"+count);
	}
	/**
	 * �������� ����
	 */
	@Test
	public void transactionTest(){
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setAddress("���Ե�ַ");
		user.setPhone("12345678902");
		user.setUserCode("�����ͺ�");
		user.setUserName("��������");
		boolean result = userService.addUser(user);
		logger.debug("testAdd result��"+result);
	}
}
