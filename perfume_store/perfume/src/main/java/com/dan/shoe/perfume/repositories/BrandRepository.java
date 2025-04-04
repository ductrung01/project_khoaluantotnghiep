package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand findByName(String name);
    boolean existsByName(String name);
    Page<Brand> findAllByNameContaining(String name, Pageable pageable);
}
