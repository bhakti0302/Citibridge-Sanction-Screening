package com.citibridge.pojos;

public class Transactions {
	
	
	private String TransactionId;
	private String TransactionRef;
	private String TransactionDate;
	private String PayerName;
	private String PayerAccount;
	private String PayeeName;
	private String PayeeAccount;
	private String Amount;
	private String Validations;
	private String Screening;
	/*
	 * private static int numb=0; private int primarykey;
	 */
	
	/*
	 * public Transaction() { numb++; this.primarykey=numb; }
	 */
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Transactions(String transactionId, String transactionRef, String transactionDate, String payerName,
			String payerAccount, String payeeName, String payeeAccount, String amount, String validations,
			String screening) {
		super();
		TransactionId = transactionId;
		TransactionRef = transactionRef;
		TransactionDate = transactionDate;
		PayerName = payerName;
		PayerAccount = payerAccount;
		PayeeName = payeeName;
		PayeeAccount = payeeAccount;
		Amount = amount;
		Validations = validations;
		Screening = screening;
	}

	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	public String getTransactionRef() {
		return TransactionRef;
	}
	public void setTransactionRef(String transactionRef) {
		TransactionRef = transactionRef;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getPayerName() {
		return PayerName;
	}
	public void setPayerName(String payerName) {
		PayerName = payerName;
	}
	public String getPayerAccount() {
		return PayerAccount;
	}
	public void setPayerAccount(String payerAccount) {
		PayerAccount = payerAccount;
	}
	public String getPayeeName() {
		return PayeeName;
	}
	public void setPayeeName(String payeeName) {
		PayeeName = payeeName;
	}
	public String getPayeeAccount() {
		return PayeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		PayeeAccount = payeeAccount;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	
	
	public String getValidations() {
		return Validations;
	}

	public void setValidations(String validations) {
		Validations = validations;
	}


	public String getScreening() {
		return Screening;
	}

	public void setScreening(String screening) {
		Screening = screening;
	}




	@Override
	public String toString() {
		return "Transactions [TransactionId=" + TransactionId + ", TransactionRef=" + TransactionRef
				+ ", TransactionDate=" + TransactionDate + ", PayerName=" + PayerName + ", PayerAccount=" + PayerAccount
				+ ", PayeeName=" + PayeeName + ", PayeeAccount=" + PayeeAccount + ", Amount=" + Amount
				+ ", Validations=" + Validations + ", Screening=" + Screening + "]";
	}
	
}
