package br.com.projeto.caridade.repository;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import br.com.projeto.caridade.entities.Payment;

@Repository
@Scope("singleton")
public class PaymentRepository {
	private ArrayList<Payment> payments;

	public PaymentRepository() {
		this.payments = new ArrayList<Payment>();
	}  
	public void Save(Payment payment) {
		payments.add(payment);
	}
	
	public ArrayList<Payment> getPayments() {
		return payments;
	}
}
