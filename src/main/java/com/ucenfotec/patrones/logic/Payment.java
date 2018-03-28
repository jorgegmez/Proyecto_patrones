package com.ucenfotec.patrones.logic;

public class Payment {
	private int paymentNumber;
	
	public Payment(int pPaymentNumber) {
		this.setPaymentNumber(pPaymentNumber);
	}
	
	public void makePayment() {
		//Refactorizar después
	}

	public int getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(int pPaymentNumber) {
		this.paymentNumber = pPaymentNumber;
	}

	@Override
	public String toString() {
		return "Payment [paymentNumber=" + paymentNumber + "]";
	}
	
	
}
