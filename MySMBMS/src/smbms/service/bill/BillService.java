package smbms.service.bill;

import java.util.List;

import smbms.entity.Bill;

/**
 * ���������
 * @author 86185
 *
 */
public interface BillService {
	/**
	 * ����������ѯ����
	 * @return
	 */
	public List<Bill>findBillListByParam(Integer proId,String name,Integer isPay);
}
