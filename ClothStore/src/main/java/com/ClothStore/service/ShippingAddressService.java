package com.ClothStore.service;

import com.ClothStore.domain.ShippingAddress;
import com.ClothStore.domain.UserShipping;

public interface ShippingAddressService {
	
	// define contract for setByUserShipping
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);

}
