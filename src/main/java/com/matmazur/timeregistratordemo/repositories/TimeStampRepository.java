package com.matmazur.timeregistratordemo.repositories;

import com.matmazur.timeregistratordemo.model.TimeStamp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeStampRepository extends CrudRepository<TimeStamp,Long> {
}
