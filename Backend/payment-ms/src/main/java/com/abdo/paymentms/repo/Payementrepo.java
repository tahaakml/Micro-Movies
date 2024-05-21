package com.abdo.paymentms.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abdo.paymentms.Client.StripeClient;

public interface Payementrepo extends  MongoRepository<StripeClient, String>{

}


