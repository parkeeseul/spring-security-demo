package com.seul.springsecuritydemo.controller;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithMockUser(username = "seul", roles = "USER")
public @interface WithUser {
}
