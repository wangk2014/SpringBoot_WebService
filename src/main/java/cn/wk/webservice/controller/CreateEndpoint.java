package cn.wk.webservice.controller;

import cn.wk.webservice.model.CreateMatchedInfo;
import cn.wk.webservice.model.CreateSuspectIris;
import cn.wk.webservice.model.WSResultDTO;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * ${DESCRIPTION}
 *
 * @author autumn
 * @create on 2017-07-12-下午4:29.
 */
@Endpoint
public class CreateEndpoint {

    private static final String NAMESPACE_URI = "http://www.wk.cn/webservice";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createSuspectIris")
    @ResponsePayload
    public WSResultDTO createSuspectIris(@RequestPayload CreateSuspectIris request) {
        WSResultDTO response = new WSResultDTO();

        System.out.println(request.getXmlData());
        System.out.println(request.getOperName());
        System.out.println(request.getPassword());

        response.setErrorCode(1);
        response.setErrorDescriptiion("error");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createMatchedInfo")
    @ResponsePayload
    public WSResultDTO createMatchedInfo(@RequestPayload CreateMatchedInfo request) {
        WSResultDTO response = new WSResultDTO();

        System.out.println(request.getMatchedSuspectID());
        System.out.println(request.getOperName());
        System.out.println(request.getPassword());
        System.out.println(request.getSuspectID());

        response.setErrorCode(0);
        response.setErrorDescriptiion("success");
        return response;
    }
}
