package org.bihe.service.entityService;

import org.bihe.bean.Person;
import org.bihe.service.Service;

public class Login implements Service {
	
	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private Person pers;
	
	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public Login(Person pers) {
		super();
		this.pers = pers;
	}

	@Override
	public Service execute() {
		
		return null;
	}

}
