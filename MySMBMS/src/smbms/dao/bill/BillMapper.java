package smbms.dao.bill;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import smbms.entity.Bill;

/**
 * ����ӳ��ӿ�
 * @author 86185
 *
 */
public interface BillMapper {
	
	/**
	 * ��������Ķ����������Ϣ���ط��������Ķ�������
	 * @param bill
	 * @return
	 */
	public List<Bill> getBillList(Bill bill);
	
	/**
	 * ʹ��@Paramע�Ⅲ���녢�ķ�ʽ��ԃӆ�Ό��󼯺�
	 * ���ܣ�����ݔ��Ĺ�Ӧ��id����Ʒ���Q���Ƿ񸶿����ȫ��ӆ�Ό���
	 * @param id
	 * @param name
	 * @return
	 */
	public List<Bill> getBillByIdAndName(@Param("proId")Integer id,@Param("name") String name,@Param("isP")Integer isp);
	
	/**
	 * ��������Ĺ�Ӧ��id�����ѯ��������
	 * @param providerIds
	 * @return
	 */
	public List<Bill> getBillByProviderIds_foreach(Integer[] providerIds);
}
