package br.com.projeto.caridade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.caridade.controlers.models.PaymentRequestModel;
import br.com.projeto.caridade.controlers.models.PaymentResponseModel;
import br.com.projeto.caridade.entities.Payment;
import br.com.projeto.caridade.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired PaymentRepository paymentRepository;
	
	public void Save(PaymentRequestModel paymentRequest) {
		var payment = new Payment(paymentRequest);
		paymentRepository.Save(payment);
	}
	
	public List<PaymentResponseModel> getPayments() {
		return paymentRepository.getPayments().stream().map(payment -> new PaymentResponseModel(payment)).toList();
	}
	
}
