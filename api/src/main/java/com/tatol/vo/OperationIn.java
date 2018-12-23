package com.tatol.vo;

import java.io.Serializable;

public class OperationIn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7504348483482467372L;
	private int firstNumber;
	private int secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
