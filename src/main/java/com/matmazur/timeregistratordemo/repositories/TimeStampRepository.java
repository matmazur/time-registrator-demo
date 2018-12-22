package com.matmazur.timeregistratordemo.repositories;

import com.matmazur.timeregistratordemo.model.TimeStamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeStampRepository extends JpaRepository<TimeStamp,Long> {
}
