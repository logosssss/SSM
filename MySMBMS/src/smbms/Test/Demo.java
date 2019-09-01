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
	 * 根据trim 条件来查询用户信息
	 */
	/*@Test
	public void testUser(){
		List<User> users = new LinkedList<User>();
		Integer currentPageNo = 2;
		Integer pageSize = 3;
		users = sqlSession.getMapper(UserMapper.class).getUserList("",null,currentPageNo*3,pageSize);
		logger.debug("UserSise："+users.size());
		for (User user : users) {
			logger.debug("User ToString："+user.toString());
		} 
	}
	@Test
	*//**
	 * 利用if 条件判断sql语句查询订单信息
	 *//*
	public void testBillAsIf(){
		logger.debug("--------------------------");
		logger.debug("billListTest--------------");
		List<Bill> bills = sqlSession.getMapper(BillMapper.class).getBillByIdAndName(2, "", null);
		logger.debug("billsSise："+bills.size());
		for (Bill bill : bills) {
			logger.debug("billToString："+bill.toString());
		}
	}
	
	*//**
	 * 利用where 条件查询供应商信息
	 *//*
	@Test
	public void testProviderAsWhere(){
		Integer currentPageNo = 1;
		Integer pageSize = 3;
		logger.debug("--------------------------");
		logger.debug("providerListTest--------------");
		List<Provider> providers = sqlSession.getMapper(ProviderMapper.class).getAllBillByProviderid(null, "",currentPageNo*pageSize,pageSize);
		logger.debug("providersSise："+providers.size());
		for (Provider p : providers) {
			logger.debug("providerToString："+p.toString());
		}
	}
	
	*//**
	 * 更新用户信息
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
	 * 修改订单信息（利用trim-if 方法）
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
			p.setProAddress("测试地址");
			p.setProCode("测试编码");
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
	 * 根据输入的权限id数组来查询用户集合（利用foreach方法）
	 *//*
	@Test
	public void getUserListByRoleId_foreach_arrayTest(){
		logger.debug("--------------------------");
		logger.debug("getUserListByRoleId_foreach_arrayTest--------------");
		Integer[] roles = {3};
		List<Integer> ros = new LinkedList<Integer>();
		ros.add(2);
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserListByRoleId_foreach_array(ros);
		logger.debug("UserSise："+users.size());
		for (User user : users) {
			logger.debug("User ToString："+user.toString());
		}
	}
	
	*//**
	 * 根据输入的性别和等级集合来查询用户集合（利用foreach方法 map作参数）
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
		
		logger.debug("UserSise："+users.size());
		for (User user : users) {
			logger.debug("User ToString："+user.toString());
		}
	}
	
	*//**
	 * 根据输入的参数条件查询用户信息（利用 choose 方法）
	 *//*
	@Test
	public void getUserList_chooseTest(){
		logger.debug("--------------------------");
		logger.debug("getUserList_chooseTest--------------");
		String name = "张";
		String userCode = "";
		Integer role = 2;
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<User> users = sqlSession.getMapper(UserMapper.class).getUserList_choose(name, role, userCode, date);
		logger.debug("UserSise："+users.size());
		for (User user : users) {
			logger.debug("User ToString："+user.toString());
		}
	}
	
	*//**
	 * 根据供应商id数组获取订单集合（利用foreach 方法）
	 *//*
	@Test
	public void getBillListByProviderIds_array(){
		logger.debug("--------------------------");
		logger.debug("getBillListByProviderIds_array--------------");
		Integer[] providerIds = {1,2,3};
		List<Bill> bills = sqlSession.getMapper(BillMapper.class).getBillByProviderIds_foreach(providerIds);
		for (Bill bill : bills) {
			logger.debug("BillToString："+bill.toString());
		}
	}
	
	*//**
	 * 根据等级参数集合获取用户信息集合（利用foreach 和 单参数封装map 的方法）
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
		logger.debug("UserSise："+users.size());
		for (User user : users) {
			logger.debug("User ToString："+user.toString());
		}
	}
	
	*//**
	 * 根据等级id来修改等级表信息（利用 if-set 方法）
	 *//*
	@Test
	public void updateRoleByRoleid(){
		Role role = new Role();
		role.setId(1);
		role.setRoleCode("测试编码");
		role.setRoleName("测试名称");
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
	 * spring 和 mybatis 组合使用测试：用户信息查询
	 */
	@Test
	public void springUser(){
		System.out.println(1);
		
		UserService userService = (UserService) context.getBean("userService");
		User u = new User();
		u.setUserName("赵");
		u.setUserRole(2);
		List<User> userList = new ArrayList<User>();
		userList = userService.findUserAllWithUserName(u);
		
		for (User user : userList) {
			logger.debug("UserListTest："+user.toString());
		}
	}
	
	/**
	 * 查询所有供应商
	 */
	@Test
	public void findAllProviderTest() {
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		List<Provider> providerList = providerService.findAllProvider();
		for (Provider provider : providerList) {
			logger.debug("ProviderListTest："+provider.toString());
		}
	}
	
	/**
	 * 根据名称查询所有供应商
	 */
	@Test
	public void findAllProviderByNameTest() {
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		List<Provider> providerList = providerService.findAllProviderByName("家");
		for (Provider provider : providerList) {
			logger.debug("ProviderListTest："+provider.toString());
		}
	}
	
	/**
	 * 使用@Param注解參數入參的方式查詢訂單對象集合
	 * 功能：根據輸入的供应商id、商品名稱和是否付款查找全部訂單對象
	 * @param id
	 * @param name
	 * @return
	 */
	@Test
	public void findBillByParamTest(){
		BillService billService = (BillService) context.getBean("billService");
		List<Bill> billList = billService.findBillListByParam(null, "洗", null);
		for (Bill bill : billList) {
			logger.debug("billListTest："+bill.toString());
		}
	}
	
	/**
	 * 添加供应商
	 */
	@Test
	public void addProviderTest(){
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		Provider provider = new Provider();
		provider.setProName("添加测试名字");
		provider.setProPhone("12345678901");
		provider.setProCode("1");
		int count = providerService.addProvider(provider);
		logger.info("addProviderTest rows---->"+count);
	}
	
	/**
	 * 根据id删除供应商
	 */
	@Test
	public void deleteProviderTest(){
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		int count = providerService.deleteProvider(16);
		logger.info("deleteProviderTest rows---->"+count);
	}
	/**
	 * 事务配置 测试
	 */
	@Test
	public void transactionTest(){
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setAddress("测试地址");
		user.setPhone("12345678902");
		user.setUserCode("测试型号");
		user.setUserName("测试名称");
		boolean result = userService.addUser(user);
		logger.debug("testAdd result："+result);
	}
}
