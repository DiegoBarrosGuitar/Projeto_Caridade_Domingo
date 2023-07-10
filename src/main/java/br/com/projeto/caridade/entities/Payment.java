package br.com.projeto.caridade.entities;
import br.com.projeto.caridade.controlers.models.PaymentRequestModel;

public class Payment {
	private int id;
	private double valor;
	private String name;
	private String cpf;
	private int transactionId;

	public Payment(double valor, String name, String cpf, int transactionId) {
		init(valor, name, cpf,transactionId);
	}

	public Payment(PaymentRequestModel paymentRequest) {
		init(paymentRequest.getValor(),
				paymentRequest.getName(),
				paymentRequest.getCpf(),
				paymentRequest.getTransactionId());
	}

	private void init(double valor, String name, String cpf, int transactionId)	{
		this.id = (int)Math.random()*10;
		this.valor = valor;
		this.name = name;
		this.cpf = cpf;
		this.transactionId = transactionId;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
