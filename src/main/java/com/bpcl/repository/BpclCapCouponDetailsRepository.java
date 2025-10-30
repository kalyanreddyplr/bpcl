package com.bpcl.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bpcl.entity.BpclCapCouponDetails;
import com.bpcl.entity.BpclLabelRegister;

@Repository
public interface BpclCapCouponDetailsRepository extends JpaRepository<BpclCapCouponDetails, Integer> {

    // Custom finder methods (examples):
    BpclCapCouponDetails findByCapQrCode(String capQrCode);  

    BpclCapCouponDetails findByCouponQrCode(String couponQrCode);

    BpclCapCouponDetails findByCapQrCodeAndCouponQrCode(String capQrCode, String couponQrCode);

	Optional<BpclCapCouponDetails> findBycapQrCode(String capCode);
}
