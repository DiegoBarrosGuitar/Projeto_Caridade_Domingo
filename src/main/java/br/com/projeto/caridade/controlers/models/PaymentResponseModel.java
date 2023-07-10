package br.com.projeto.caridade.controlers.models;

import br.com.projeto.caridade.entities.Payment;

public class PaymentResponseModel {
	private int id;
	private double valor;
	private String name;
	private String cpf;
	private int transactionId;
	
	public PaymentResponseModel(Payment payment) {
		id = payment.getId();
		valor = payment.getValor();
		cpf = payment.getCpf();
		name = payment.getName();
		transactionId = payment.getTransactionId();
	}
	
	public int getId() {
		return id;
	}

	public double getValor() {
		return valor;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public int getTransactionId() {
		return transactionId;
	}
}
