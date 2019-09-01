package smbms.dao.bill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import smbms.entity.Bill;

/**
 * 订单映射接口
 * @author 86185
 *
 */
public interface BillMapper {
	
	/**
	 * 根据输入的订单对象的信息返回符合条件的订单集合
	 * @param bill
	 * @return
	 */
	public List<Bill> getBillList(Bill bill);
	
	/**
	 * 使用@Param注解參數入參的方式查詢訂單對象集合
	 * 功能：根據輸入的供应商id、商品名稱和是否付款查找全部訂單對象
	 * @param id
	 * @param name
	 * @return
	 */
	public List<Bill> getBillByIdAndName(@Param("proId")Integer id,@Param("name") String name,@Param("isP")Integer isp);
	
	/**
	 * 根据输入的供应商id数组查询订单集合
	 * @param providerIds
	 * @return
	 */
	public List<Bill> getBillByProviderIds_foreach(Integer[] providerIds);
}
