# SpringBoot_WebService
## A simple demo which combines SpringBoot with webservice.

## Get wsdl file
http://127.0.0.1:8844/ws/define.wsdl

--------

## Test
### Request 
Post Xml(test/xml)
http://127.0.0.1:8844/ws
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:gs="http://www.wk.cn/webservice">
<soapenv:Header/>
<soapenv:Body>
<gs:createSuspectIris>
<gs:xmlData>7</gs:xmlData>
<gs:operName>8</gs:operName>
<gs:password>9</gs:password>
</gs:createSuspectIris>
</soapenv:Body>
</soapenv:Envelope>
```

### Response 
```
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
<SOAP-ENV:Header/>
<SOAP-ENV:Body>
<ns2:WSResultDTO xmlns:ns2="http://www.wk.cn/webservice">
<ns2:errorCode>1</ns2:errorCode>
<ns2:errorDescriptiion>error</ns2:errorDescriptiion>
</ns2:WSResultDTO>
</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
-----

### Request 
Post Xml(test/xml)
http://127.0.0.1:8844/ws
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:gs="http://www.wk.cn/webservice">
<soapenv:Header/>
<soapenv:Body>
<gs:createMatchedInfo>
<gs:suspectID>1</gs:suspectID>
<gs:matchedSuspectID>2</gs:matchedSuspectID>
<gs:operName>3</gs:operName>
<gs:password>4</gs:password>
</gs:createMatchedInfo>
</soapenv:Body>
</soapenv:Envelope>
```
### Response 
```
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
<SOAP-ENV:Header/>
<SOAP-ENV:Body>
<ns2:WSResultDTO xmlns:ns2="http://www.wk.cn/webservice">
<ns2:errorCode>0</ns2:errorCode>
<ns2:errorDescriptiion>success</ns2:errorDescriptiion>
</ns2:WSResultDTO>
</SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
