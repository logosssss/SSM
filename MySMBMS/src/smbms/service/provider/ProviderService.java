package smbms.service.provider;

import java.util.List;

import org.springframework.stereotype.Service;

import smbms.dao.provider.ProviderMapper;
import smbms.entity.Provider;

/**
 * ��Ӧ�̷����
 * @author 86185
 *
 */
public interface ProviderService {
	
	/**
	 * ��ѯ���й�Ӧ��
	 * @return
	 */
	public List<Provider>findAllProvider();
	
	/**
	 * �������Ʋ�ѯ��Ӧ��
	 * @param name
	 * @return
	 */
	public List<Provider>findAllProviderByName(String name);
	
	/**
	 * ���ӹ�Ӧ��
	 * @param provide
	 * @return
	 */
	public int addProvider(Provider provider);
	
	/**
	 * ����idɾ����Ӧ��
	 * @param pid
	 * @return
	 */
	public int deleteProvider(Integer pid);
	
	
}
