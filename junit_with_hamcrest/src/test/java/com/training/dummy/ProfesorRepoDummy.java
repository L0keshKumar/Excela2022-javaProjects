package com.training.dummy;

import com.training.ifaces.ProfesorRepository;

public class ProfesorRepoDummy implements ProfesorRepository{

	@Override
	public String Qualification() {
		
		throw new AssertionError("This is a dummy method for testing");
	}

	
}
