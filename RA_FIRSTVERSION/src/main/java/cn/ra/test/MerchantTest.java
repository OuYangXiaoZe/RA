package cn.ra.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ra.pojo.Merchant;
import cn.ra.service.MerchantService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class MerchantTest {
	
	@Resource 
	private MerchantService merchantService = null;
	
	/*
	 * 插入一条商家记录
	 */
//  @Test  
//  public void test2() {  
//	 Merchant merchant=new Merchant();
//	 merchant.setId(2);
//	 merchant.setMerchantaddress("深圳南山区");
//	 merchant.setMerchantlever(5);
//	 merchant.setMerchantname("穗味小站");
//	 merchant.setMerchanttype(1);
//	 merchant.setUserid(2);
//	 this.merchantService.insert(merchant);
//	 
//  	
//  }
//	/*
//	 * 删除一条商家记录
//	 */
//  @Test  
//  public void test3() {  
//	
//	 this.merchantService.deleteMerchantById(2);
//	 
//  	
//  }
	
//	/*
//	 * 更改一条商家记录
//	 */
//  @Test  
//  public void test3() {  
//	Merchant merchant=new Merchant();
//	merchant.setId(1);
//	merchant.setMerchantaddress("深圳南山区华侨城");
//	merchant.setMerchantlever(5);
//
//	 this.merchantService.updateMerchantInfoById(merchant);
//	 
//  	
//  }
	
	
//	/*
//	 * 查找一条商家记录
//	 */
//	
//	@Test  
//  public void test3() {  
//	Merchant merchant=this.merchantService.findMerchantById(1);
//	System.out.println(merchant.getMerchantaddress());
//	System.out.println(merchant.getMerchantname());
//	System.out.println(merchant.getId());
//	System.out.println(merchant.getMerchantlever());
//	System.out.println(merchant.getMerchanttype());
//	
//	 
//  	
//  }
	
	

}
