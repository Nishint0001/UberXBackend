package com.nishintgoyal.UberXBackend.Repositories;


import com.nishintgoyal.UberXBackend.Entities.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequestEntity,Long>
{

}
