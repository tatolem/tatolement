package com.tatol.service;

import com.tatol.service.api.CalculatriceService;
import com.tatol.vo.OperationIn;
import com.tatol.vo.OperationOut;

public class CalculatriceServiceImpl implements CalculatriceService {

	public OperationOut addition(OperationIn in) {
		OperationOut result = null;
		if(in != null){
			result = new OperationOut();
			result.setResult(in.getFirstNumber() + in.getSecondNumber());
		}
		return result;
	}
	
	public OperationOut soustraction(OperationIn in) {
		OperationOut result = null;
		if(in != null){
			result = new OperationOut();
			result.setResult(in.getFirstNumber() - in.getSecondNumber());
		}
		return result;
	}

}
