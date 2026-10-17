package com.javabyabhishek.payments.transfer.repository;

import com.javabyabhishek.payments.transfer.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransferRepository extends JpaRepository<TransferEntity, String> {


}
