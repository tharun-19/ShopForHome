package eshop.homedecor.report.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eshop.homedecor.report.entity.ProductInfo;
import eshop.homedecor.report.repository.ProductInfoRepository;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
@Service
public class ProductServiceImpl  {

    @Autowired
    ProductInfoRepository productInfoRepository;

   


	
	@Transactional
	public List<ProductInfo> findAll() {
		
		return productInfoRepository.findAll();
	}


}
