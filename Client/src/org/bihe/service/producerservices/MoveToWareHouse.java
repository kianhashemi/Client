package org.bihe.service.producerservices;

import java.io.Serializable;

import org.bihe.bean.Demand;
import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class MoveToWareHouse implements Service,Serializable {

	/**
	 * adding serial ID to this class's object in order to be able to write and read in network
	 */
	private static final long serialVersionUID = 580151038057113548L;
	// -------------------------------------------------
	// -------------Instance Fields---------------------
	private Demand demand;
	// -------------------------------------------------
	// -----------------Constructor---------------------
	public MoveToWareHouse(Demand demand) {
		this.demand=demand;;
	}
	

	// -------------------------------------------------
	// ---------------------Methods---------------------
	@Override
	public void execute() {
		HandleCommand.moveToWareHouse(demand);
		
	}

}
