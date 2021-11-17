package com.bootmvc.service;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService{

	@Override
	public String generateMsg() {
		System.out.println("WishMessageServiceImpl.generateMsg()");
		String msg = "Welcome to SPRING BOOT MVCC";
		return msg;
	}
	

}
