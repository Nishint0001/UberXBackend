package com.nishintgoyal.UberXBackend.Strategies;

import com.nishintgoyal.UberXBackend.Strategies.impl.DriverMatchingHighestRatedDriverStrategy;
import com.nishintgoyal.UberXBackend.Strategies.impl.DriverMatchingNearestDriverStrategy;
import com.nishintgoyal.UberXBackend.Strategies.impl.RideFareDefaultFareCalculationStrategy;
import com.nishintgoyal.UberXBackend.Strategies.impl.RideFareSurgePricingFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager
{
    private final DriverMatchingHighestRatedDriverStrategy highestRatedDriverStrategy;
    private final DriverMatchingNearestDriverStrategy nearestDriverStrategy;
    private final RideFareSurgePricingFareCalculationStrategy surgePricingFareCalculationStrategy;
    private final RideFareDefaultFareCalculationStrategy defaultFareCalculationStrategy;

    public DriverMatchingStrategy driverMatchingStrategy(double riderRating)
    {
        if(riderRating >= 4.8)
        {
            return highestRatedDriverStrategy;
        }
        else
        {
            return nearestDriverStrategy;
        }
    }

    public RideFareCalculationStrategy rideFareCalculationStrategy()
    {
        // 6PM TO 9PM

        LocalTime surgeStartTime= LocalTime.of(18, 0);
        LocalTime surgeEndTime=LocalTime.of(21,0);
        LocalTime currentTime=LocalTime.now();

        boolean isSurgeTime=currentTime.isAfter(surgeEndTime) && currentTime.isBefore(surgeEndTime);

        if(isSurgeTime==true)
        {
            return surgePricingFareCalculationStrategy;
        }
        else
        {
            return defaultFareCalculationStrategy;
        }
    }
}
