package com.example.siam.diamservice.rings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RingRepository extends JpaRepository<Rings,Long> {
}
