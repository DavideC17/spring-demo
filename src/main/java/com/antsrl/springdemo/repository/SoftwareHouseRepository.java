package com.antsrl.springdemo.repository;

import com.antsrl.springdemo.modele.SoftwareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareHouseRepository extends JpaRepository<SoftwareHouse, Long> {
}
