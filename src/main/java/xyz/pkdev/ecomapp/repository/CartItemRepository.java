package xyz.pkdev.ecomapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.pkdev.ecomapp.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
