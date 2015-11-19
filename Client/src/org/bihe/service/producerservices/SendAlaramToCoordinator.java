package org.bihe.service.producerservices;

import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class SendAlaramToCoordinator implements Service {
	
	public SendAlaramToCoordinator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		HandleCommand.sendAlarmToCoordinator();
	}

}
