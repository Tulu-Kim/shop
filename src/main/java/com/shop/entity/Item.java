package com.shop.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
    private  Long id;        //상품코드
    private String itemNm;   //상품명
    private int price;       //가격
    private int stockNumver; //재고수량

}
