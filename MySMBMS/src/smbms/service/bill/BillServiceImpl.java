package smbms.service.bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import smbms.dao.bill.BillMapper;
import smbms.entity.Bill;

@Service("billService")
@Transactional
public class BillServiceImpl implements BillService {

	@Autowired
	private BillMapper billMapper;
	
	@Override
	public List<Bill> findBillListByParam(Integer proId, String name, Integer isPay) {
		return billMapper.getBillByIdAndName(proId, name, isPay);
	}

}
