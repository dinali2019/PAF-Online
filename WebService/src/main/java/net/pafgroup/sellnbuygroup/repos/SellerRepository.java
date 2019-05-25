package net.pafgroup.sellnbuygroup.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.pafgroup.sellnbuygroup.models.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
