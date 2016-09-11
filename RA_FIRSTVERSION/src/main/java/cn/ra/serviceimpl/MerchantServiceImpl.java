package cn.ra.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ra.dao.DishMapper;
import cn.ra.dao.MerchantMapper;
import cn.ra.pojo.Merchant;
import cn.ra.service.MerchantService;
@Service("merchantService")
public class MerchantServiceImpl implements MerchantService {
	@Resource
	public MerchantMapper merchantDao;

	public Merchant findMerchantById(int merchantid) {
		return this.merchantDao.selectByPrimaryKey(merchantid);

	}

	public void deleteMerchantById(int merchantid) {
		this.merchantDao.deleteByPrimaryKey(merchantid);

	}

	public void insert(Merchant merchant) {
	  
      this.merchantDao.insert(merchant);
	}

	public void updateMerchantInfoById(Merchant merchant) {
	this.merchantDao.updateByPrimaryKeySelective(merchant);

	}

	public void deleteMerchant(Merchant merchant) {
	
		
	}

}
