package com.company;

import com.company.shape.CCircle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CCircle cCircle = new CCircle();
        cCircle.init(2, 5, 3);
        cCircle.info();
    }
}
