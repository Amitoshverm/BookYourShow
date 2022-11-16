package com.scaler.bookyourshow.models;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Entity
@Table(name = "USERS")
public class User extends BaseModel{

    private String email;

}
