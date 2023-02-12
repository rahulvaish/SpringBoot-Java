package com.example.users.valueObject;

import com.example.users.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseValueObject {

    private Department department;
    private Users users;
    private String errorResponse;
}
