package com.users.service.usersservice;

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
