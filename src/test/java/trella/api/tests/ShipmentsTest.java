package trella.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.Shipment;
import org.junit.Test;
import parameters.TrellaAPI;

import static org.junit.Assert.assertEquals;

public class ShipmentsTest {
    @Test
    public void getShipmentsTest() {
        RestAssured.baseURI = TrellaAPI.baseURL;
        RequestSpecification request = RestAssured.given();
        request.header(TrellaAPI.authKey, TrellaAPI.authValue);
        Response response = request.get(TrellaAPI.marketPlace);
        Shipment[] shipments = response.getBody().as(Shipment[].class);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(7,shipments.length);
    }

    @Test
    public void filterShipmentsTest() {
        RestAssured.baseURI = TrellaAPI.baseURL;
        RequestSpecification request = RestAssured.given();
        request.header(TrellaAPI.authKey, TrellaAPI.authValue);
        request.param("lng", "30");
        request.param("lat", "30");
        Response response = request.get(TrellaAPI.marketPlace);
        Shipment[] shipments = response.getBody().as(Shipment[].class);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(3,shipments.length);
    }
}
