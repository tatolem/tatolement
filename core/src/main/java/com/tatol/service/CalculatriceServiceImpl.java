package com.tatol.service;

import org.apache.log4j.Logger;

import com.tatol.service.api.CalculatriceService;
import com.tatol.vo.OperationIn;
import com.tatol.vo.OperationOut;

public class CalculatriceServiceImpl implements CalculatriceService {

	private static Logger logger = Logger.getLogger(CalculatriceServiceImpl.class);

	public OperationOut operation(OperationIn in) {
		OperationOut result = null;
		if (in != null) {
			int resultat = 0;
			result = new OperationOut();
			if (in.getOperator() != null) {
				try {
					switch (in.getOperator()) {
					case "+":
						resultat = in.getFirstNumber() + in.getSecondNumber();
						break;
					case "-":
						resultat = in.getFirstNumber() - in.getSecondNumber();
						break;
					case "*":
						resultat = in.getFirstNumber() * in.getSecondNumber();
						break;
					case "/":
						resultat = in.getFirstNumber() / in.getSecondNumber();
						break;
					default:
						resultat = in.getFirstNumber() + in.getSecondNumber();
						break;
					}
				} catch (Exception e) {
					logger.error("Error while processin addition with operator" + in.getOperator(), e);
				}
			} else {
				resultat = in.getFirstNumber() + in.getSecondNumber();
			}
			result.setResult(resultat);
		}
		return result;
	}

}
