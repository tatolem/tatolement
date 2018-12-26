package com.tatol.service;

import com.tatol.service.api.CalculatriceService;
import com.tatol.vo.OperationIn;
import com.tatol.vo.OperationOut;

public class CalculatriceServiceImpl implements CalculatriceService {

	public OperationOut addition(OperationIn in) {
		OperationOut result = null;
		if(in != null){
			int resultat = 0;
			result = new OperationOut();
			if(in.getOperator() != null){
				switch (in.getOperator()){
					case "+": resultat = in.getFirstNumber() + in.getSecondNumber();
					break;
					case "-": resultat = in.getFirstNumber() - in.getSecondNumber();
					break;
					case "*": resultat = in.getFirstNumber() * in.getSecondNumber();
					break;
					case "/": resultat = in.getFirstNumber() / in.getSecondNumber();
					break;
					default: resultat = in.getFirstNumber() + in.getSecondNumber();
					break;
				}
			} else {
				resultat = in.getFirstNumber() + in.getSecondNumber();
			}
			result.setResult(resultat);
		}
		return result;
	}

}
