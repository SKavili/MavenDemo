package com.audintel.tsm.transport.repository;

import com.audintel.tsm.transport.dao.Bookings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingsRepository extends CrudRepository<Bookings, Integer> {
}
