package com.infy.poc.paas;

import org.ifxforum.ifx_2x.CustIdType;
import org.ifxforum.ifx_2x.MsgRqHdrType;

import com.ally.ifx.account.AccountAddRqType;
import com.ally.ifx.account.AccountAddRsType;
import com.ally.ifx.account.AccountInqRqType;
import com.ally.ifx.account.AccountInqRsType;
import com.ally.ifx.account.ObjectFactory;
import com.ally.wsd.account.v1.AccountPortType;

public class AccountPortTypeImpl implements AccountPortType {

	@Override
	public AccountInqRsType inq(AccountInqRqType requestMessage) {
		System.out.println("........................Got Request for inq...........");
		MsgRqHdrType msgRqHdr = requestMessage.getMsgRqHdr();
		ObjectFactory factory = new ObjectFactory();
		AccountInqRsType response = factory.createAccountInqRsType();
		response.setRqUID("1234");
		CustIdType custIdType= new CustIdType();
		custIdType.setCustPermId("PermanentId123");
		response.setCustId(custIdType);
		return response;
	}

	@Override
	public AccountAddRsType add(AccountAddRqType requestMessage) {
		// TODO Auto-generated method stub
		return null;
	}

}
