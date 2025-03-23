package com.nishintgoyal.UberXBackend.Services.impl;

import com.nishintgoyal.UberXBackend.Services.DistanceService;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class DistanceServiceImpl implements DistanceService
{
    private static final String OSRM_API_BASE_URL="http://router.project-osrm.org/route/v1/driving/13.388860,52.517037;13.397634,52.529407";
    @Override
    public double calculateDistance(Point src, Point dest)
    {
        //will call 3rd party api here called OSRm to calc dist
        try
        {
            String uri=src.getX()+","+ src.getY()+";"+dest.getX()+","+dest.getY();
           OSRMResponseDto osrmResponseDto=RestClient.builder()
                    .baseUrl(OSRM_API_BASE_URL)
                    .build()
                    .get()
                    .uri(uri)
                    .retrieve()
                    .body(OSRMResponseDto.class);
            return osrmResponseDto.getRoutes().get(0).getDistance()/1000.0;
        }
        catch(Exception e)
        {
            throw new RuntimeException("Error getting data from OSRM "+e.getMessage());
        }
    }
}

@Data
class OSRMResponseDto
{
    private List<OSRMRoute> routes;
}

@Data
class OSRMRoute
{
    private Double distance;
}
