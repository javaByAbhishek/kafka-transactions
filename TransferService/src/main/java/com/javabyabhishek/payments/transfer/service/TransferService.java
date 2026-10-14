package com.javabyabhishek.payments.transfer.service;

import com.javabyabhishek.payments.transfer.model.TransferRestModel;

public interface TransferService {
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
