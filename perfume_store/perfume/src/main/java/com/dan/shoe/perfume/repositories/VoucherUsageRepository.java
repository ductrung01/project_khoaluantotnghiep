package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.User;
import com.dan.shoe.perfume.models.Voucher;
import com.dan.shoe.perfume.models.VoucherUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherUsageRepository extends JpaRepository<VoucherUsage, Long> {
    boolean existsByUserAndVoucher(User user, Voucher voucher);
}