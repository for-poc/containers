package com.infy.poc.paas;

import org.ifxforum.ifx_2x.CustIdType;
import org.ifxforum.ifx_2x.MsgRqHdrType;

import com.ally.ifx.account.AccountInqRqType;
import com.ally.wsd.account.v1.AccountPortType;


public class AccountServiceTester {

	AccountPortType account;

	public AccountPortType getAccount() {
		return account;
	}

	public void setAccount(AccountPortType account) {
		this.account = account;
	}
	
	public void testAccountInq(){
		AccountInqRqType requestMessage = new AccountInqRqType();
		requestMessage.setRqUID("1234");
		CustIdType custId = new CustIdType();
		custId.setCustPermId("Request-PermId");
		requestMessage.setCustId(custId);
		MsgRqHdrType msgHeader = new MsgRqHdrType();
		
		System.out.println("Sending request for Account Inq");
		account.inq(requestMessage);
		System.out.println("Respone Recd");
	}
}
