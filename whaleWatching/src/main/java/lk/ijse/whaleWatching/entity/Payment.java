package lk.ijse.whaleWatching.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    private String pay_Id;
    private String date;
    private double amount;


}
