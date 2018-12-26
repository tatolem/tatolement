package com.tatol.service.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.tatol.vo.OperationIn;
import com.tatol.vo.OperationOut;

@WebService
public interface CalculatriceService {
	@WebMethod
	public OperationOut addition(OperationIn in);
}
