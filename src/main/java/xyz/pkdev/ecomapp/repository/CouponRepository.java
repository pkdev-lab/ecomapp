package xyz.pkdev.ecomapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import xyz.pkdev.ecomapp.entity.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

	@Query("SELECT MAX(c.discount) FROM Coupon c")
	Integer findMaxDiscount();

}
