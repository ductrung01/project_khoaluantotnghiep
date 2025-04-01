package com.dan.shoe.perfume.services;

import com.dan.shoe.perfume.dtos.requests.CartRequest;
import com.dan.shoe.perfume.dtos.requests.OrderNowCreation;
import com.dan.shoe.perfume.dtos.responses.CartResponse;
import com.dan.shoe.perfume.dtos.responses.ResponseMessage;

public interface CartService {
    CartResponse getCartByUser(String username);
    ResponseMessage addToCart(String username, CartRequest cartRequest);
    ResponseMessage updateCart(String username, Long cartItemId, int quantity);
    ResponseMessage removeFromCart(String username, Long cartItemId);
    ResponseMessage clearCart(String username);
    Integer getCartTotal(String username);
    ResponseMessage addCartNow(String username, OrderNowCreation orderNowCreation);
}
