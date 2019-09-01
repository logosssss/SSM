package smbms.service.provider;

import java.util.List;

import org.springframework.stereotype.Service;

import smbms.dao.provider.ProviderMapper;
import smbms.entity.Provider;

/**
 * 供应商服务层
 * @author 86185
 *
 */
public interface ProviderService {
	
	/**
	 * 查询所有供应商
	 * @return
	 */
	public List<Provider>findAllProvider();
	
	/**
	 * 根据名称查询供应商
	 * @param name
	 * @return
	 */
	public List<Provider>findAllProviderByName(String name);
	
	/**
	 * 增加供应商
	 * @param provide
	 * @return
	 */
	public int addProvider(Provider provider);
	
	/**
	 * 根据id删除供应商
	 * @param pid
	 * @return
	 */
	public int deleteProvider(Integer pid);
	
	
}
