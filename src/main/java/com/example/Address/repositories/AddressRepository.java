package com.example.Address.repositories;

import com.example.Address.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    @Query("select a from Address a where a.empId = :id")
    Optional<Address> findByEmpId(@Param("id") int id);
}
