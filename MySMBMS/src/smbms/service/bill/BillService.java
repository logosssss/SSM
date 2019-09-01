package smbms.service.bill;

import java.util.List;

import smbms.entity.Bill;

/**
 * 订单服务层
 * @author 86185
 *
 */
public interface BillService {
	/**
	 * 根据条件查询订单
	 * @return
	 */
	public List<Bill>findBillListByParam(Integer proId,String name,Integer isPay);
}
