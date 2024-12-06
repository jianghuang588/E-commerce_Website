package com.ClothStore.service.impl;

import org.springframework.stereotype.Service;

import com.ClothStore.domain.ShippingAddress;
import com.ClothStore.domain.UserShipping;
import com.ClothStore.service.ShippingAddressService;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

	public ShippingAddress setByUserShipping(UserShipping deliveryInfo, ShippingAddress addressForShipping) {
		
		// assign recipient name to usershipping
		addressForShipping.setNameOfShippingAddress(deliveryInfo.getUserShippingName());
		
		// assign address1 to usershipping 
		addressForShipping.setStreetOneOfShippingAddress(deliveryInfo.getUserShippingStreet1());
		
		// assign address2 to usershipping 
		addressForShipping.setStreetTwoOfShippingAddress(deliveryInfo.getUserShippingStreet2());
		
		// assign city to usershipping 
		addressForShipping.setCityOfShippingAddress(deliveryInfo.getUserShippingCity());
		
		// assign state to usershipping 
		addressForShipping.setStateOfShippingAddress(deliveryInfo.getUserShippingState());
		
		// assign country to usershipping 
		addressForShipping.setCountryOfShippingAddress(deliveryInfo.getUserShippingCountry());
		
		// assign zipCode to usershipping 
		addressForShipping.setZipcodeOfShippingAddress(deliveryInfo.getUserShippingZipcode());
		
		
		return addressForShipping;
	}
}
