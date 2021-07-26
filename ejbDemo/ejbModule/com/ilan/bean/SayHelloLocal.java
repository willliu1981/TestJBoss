package com.ilan.bean;

import javax.ejb.Local;

@Local
public interface SayHelloLocal {
	public String say(String msg);
}
