package cn.xiaoze.ra.service;

import cn.xiaoze.ra.pojo.Merchant;

public interface MerchantService {
	public void findMerchantById(int merchantid);
	public void deleteMerchantById(int merchantid);
	public void insert(Merchant merchant);
	public void updateMerchantInfoById(int merchantid,Merchant merchant);
}
