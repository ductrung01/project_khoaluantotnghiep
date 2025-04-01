package com.dan.shoe.perfume.services;

import com.dan.shoe.perfume.models.User;

public interface EmailService {
    public void sendVerificationEmail(User user);
    public void sendForgotPasswordEmail(User user);
}
