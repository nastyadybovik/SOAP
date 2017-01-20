package by.bsu.soap.car_catalog.endpoint;

import by.bsu.soap.car_catalog.dao.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.bsu.by.carcatalog.CreateCarRequest;
import soap.bsu.by.carcatalog.GetCarByCriteriaRequest;
import soap.bsu.by.carcatalog.GetCarRequest;
import soap.bsu.by.carcatalog.GetCarResponse;

@Endpoint
public class CarEndpoint {
	private static final String NAMESPACE_URI = "http://by.bsu.soap/carCatalog";

	private CarDAO carDAO;

	@Autowired
	public CarEndpoint(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarRequest")
	@ResponsePayload
	public GetCarResponse getById(@RequestPayload GetCarRequest request) {
		GetCarResponse response = new GetCarResponse();
		response.setCar(carDAO.get(request.getId()));

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCarByCriteriaRequest")
	@ResponsePayload
	public GetCarResponse getByCriteria(@RequestPayload GetCarByCriteriaRequest request) {
		GetCarResponse response = new GetCarResponse();
		response.setCar(carDAO.get(request.getModel(), request.getMark(), request.getYear()));

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createCarRequest")
	@ResponsePayload
	public GetCarResponse create(@RequestPayload CreateCarRequest request) {
		GetCarResponse response = new GetCarResponse();
		response.setCar(carDAO.create(request.getCar()));

		return response;
	}
}
