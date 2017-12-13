package pe.buendato.functions.handler;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import pe.buendato.functions.domain.RequestDeletePerson;

import pe.buendato.functions.domain.ResponseTx;

public class DeletePersonFunctionHandler implements RequestHandler<RequestDeletePerson, ResponseTx> {
	
	private static final Logger logger = Logger.getLogger(DeletePersonFunctionHandler.class);
	
	@Override
	public ResponseTx handleRequest(RequestDeletePerson rq, Context arg1) {

		logger.info(String.format("UserId: [%s], PersonId: [%s]", rq.getUserId(), rq.getPersonId()));


		
		ResponseTx responseTx = new ResponseTx();
		
		return responseTx;
	}

}
