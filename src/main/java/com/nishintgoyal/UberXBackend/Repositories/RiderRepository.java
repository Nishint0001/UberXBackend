package com.nishintgoyal.UberXBackend.Repositories;


import com.nishintgoyal.UberXBackend.Entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<com.nishintgoyal.UberXBackend.Entities.RiderEntity,Long>
{

}
