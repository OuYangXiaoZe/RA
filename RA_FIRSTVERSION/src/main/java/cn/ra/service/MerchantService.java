package cn.ra.service;

import cn.ra.pojo.Merchant;

public interface MerchantService {
	public Merchant findMerchantById(int merchantid);
	public void deleteMerchantById(int merchantid);
	public void insert(Merchant merchant);
	public void deleteMerchant(Merchant merchant);
	public void updateMerchantInfoById(Merchant merchant);
}
