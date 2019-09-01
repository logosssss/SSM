package smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import smbms.entity.Provider;


/**
 * 供應商映射接口
 * @author 86185
 *
 */
public interface ProviderMapper {
	/**
	 * 根據輸入的供應商對象添加供應商信息
	 * @param provider
	 * @return
	 */
	int addProvider(Provider provider);
	
	/**
	 * 根據輸入的供應商對象修改供應商信息
	 * @param provider
	 * @return
	 */
	int updateProvider(Provider provider);
	
	/**
	 * 根據輸入的供應商id刪除供應商信息
	 * 使用@Param注解參數
	 * @param provider
	 * @return
	 */
	int deleteProviider(@Param("providerId") Integer pId);
	
	/**
	 * 根据供应商id 和 供应商名称查询 供应商对象并返回供应商集合（支持模糊查询）实现分页功能
	 * @param id
	 * @return
	 */
	List<Provider>getAllBillByProviderid(@Param("id")Integer id,@Param("name")String name,
			@Param("from")Integer currentPageNo,@Param("pageSise")Integer pageSise);
	
	/**
	 * 获取所有供应商信息
	 * @param provider
	 * @return
	 */
	List<Provider>findProviderAll();
	
	/**
	 * 根据供应商名称获取所有供应商信息
	 * @param provider
	 * @return
	 */
	List<Provider>findProviderAllByName(@Param("name")String name);
	
}
