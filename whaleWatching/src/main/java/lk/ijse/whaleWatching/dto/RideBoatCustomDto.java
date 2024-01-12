package lk.ijse.whaleWatching.dto;

import lombok.Data;

import java.util.List;

@Data
public class RideBoatCustomDto {
     private RideDto rideDto;
     private List<RideBoatDto> rideBoatDtos;
}
