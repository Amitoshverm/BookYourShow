package com.scaler.bookyourshow.models;
import com.scaler.bookyourshow.enums.TicketStatus;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Ticket extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> seats = new ArrayList<>();
    private Double amount;

    @Enumerated
    private TicketStatus status;

    @OneToOne
    private Payment payment;

}
