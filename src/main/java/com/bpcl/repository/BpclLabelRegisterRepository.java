package com.bpcl.repository;

import com.bpcl.entity.BpclLabelRegister;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BpclLabelRegisterRepository extends JpaRepository<BpclLabelRegister, String> {

    // You can define custom queries here if needed
    BpclLabelRegister findByCouponNo(String couponNo);

    BpclLabelRegister findByCapQrCode(String capQrCode);

    // Example: find by label code and status
    BpclLabelRegister findByLabelCodeAndStatus(String labelCode, String status);

	Optional<BpclLabelRegister> findBylabelCode(String labelCode);
}
