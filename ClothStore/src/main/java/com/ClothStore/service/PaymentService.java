package com.ClothStore.service;

import com.ClothStore.domain.Payment;
import com.ClothStore.domain.UserPayment;

public interface PaymentService {
	
	// define contract for setByUserPayment
	Payment setByUserPayment(UserPayment userPayment, Payment payment);

}
