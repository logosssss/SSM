package smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import smbms.entity.Provider;


/**
 * ������ӳ��ӿ�
 * @author 86185
 *
 */
public interface ProviderMapper {
	/**
	 * ����ݔ��Ĺ����̌�����ӹ�������Ϣ
	 * @param provider
	 * @return
	 */
	int addProvider(Provider provider);
	
	/**
	 * ����ݔ��Ĺ����̌����޸Ĺ�������Ϣ
	 * @param provider
	 * @return
	 */
	int updateProvider(Provider provider);
	
	/**
	 * ����ݔ��Ĺ�����id�h����������Ϣ
	 * ʹ��@Paramע�Ⅲ��
	 * @param provider
	 * @return
	 */
	int deleteProviider(@Param("providerId") Integer pId);
	
	/**
	 * ���ݹ�Ӧ��id �� ��Ӧ�����Ʋ�ѯ ��Ӧ�̶��󲢷��ع�Ӧ�̼��ϣ�֧��ģ����ѯ��ʵ�ַ�ҳ����
	 * @param id
	 * @return
	 */
	List<Provider>getAllBillByProviderid(@Param("id")Integer id,@Param("name")String name,
			@Param("from")Integer currentPageNo,@Param("pageSise")Integer pageSise);
	
	/**
	 * ��ȡ���й�Ӧ����Ϣ
	 * @param provider
	 * @return
	 */
	List<Provider>findProviderAll();
	
	/**
	 * ���ݹ�Ӧ�����ƻ�ȡ���й�Ӧ����Ϣ
	 * @param provider
	 * @return
	 */
	List<Provider>findProviderAllByName(@Param("name")String name);
	
}
