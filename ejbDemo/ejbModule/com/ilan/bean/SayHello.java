package com.ilan.bean;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SayHello
 */
@Stateless
public class SayHello implements SayHelloLocal {

    /**
     * Default constructor. 
     */
    public SayHello() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String say(String msg) {
		// TODO Auto-generated method stub
		return "I say :"+msg;
	}

}
