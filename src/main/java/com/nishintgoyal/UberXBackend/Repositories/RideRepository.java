package com.nishintgoyal.UberXBackend.Repositories;

import com.nishintgoyal.UberXBackend.Entities.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<com.nishintgoyal.UberXBackend.Entities.RideEntity,Long>
{

}
