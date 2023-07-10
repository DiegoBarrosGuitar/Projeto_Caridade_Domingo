package br.com.projeto.caridade.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.caridade.controlers.models.PaymentRequestModel;
import br.com.projeto.caridade.controlers.models.PaymentResponseModel;
import br.com.projeto.caridade.services.PaymentService;

@RestController

public class PaymentsController {

	@Autowired PaymentService paymentService;
	
	@PostMapping("/payments")
	public void post(@RequestBody PaymentRequestModel paymentModel) {
		paymentService.Save(paymentModel);
	}
	
	@GetMapping("/payments")
	public List<PaymentResponseModel> get() {
		return paymentService.getPayments();
	}
}
