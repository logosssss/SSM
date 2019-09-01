package smbms.service.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smbms.dao.provider.ProviderMapper;
import smbms.entity.Provider;

@Transactional
@Service("providerService")
public class ProviderServiceImpl implements ProviderService{

	@Autowired
	private ProviderMapper providerMapper;
	
	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}
	
	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}
	
	@Override
	public List<Provider> findAllProvider() {
		return providerMapper.findProviderAll();
	}

	@Override
	public List<Provider> findAllProviderByName(String name) {
		return providerMapper.findProviderAllByName(name);
	}

	@Override
	public int addProvider(Provider provider) {
		return providerMapper.addProvider(provider);
	}
	
	public int deleteProvider(Integer pid) {
		return providerMapper.deleteProviider(pid);
	}
	
	
	

}
