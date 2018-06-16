package com.example.dockerhelloworld;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SchemaValidator {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        SchemaValidator schemaValidator = new SchemaValidator();
        schemaValidator.createRequest();
    }
    public void createRequest() throws JAXBException, FileNotFoundException {

        Envelope envelope = new Envelope();
        Envelope.Header header = new Envelope.Header();
        Security security = new Security();
        Security.UsernameToken usernameToken = new Security.UsernameToken();
        usernameToken.setUsername("E0077846");
        usernameToken.setPassword("E0077846");
        security.setMustUnderstand((short) 1);
        security.setActor("http://www.isban.es/soap/actor/wssecurityUserPass");
        security.setRole("wsssecurity");
        security.setUsernameToken(usernameToken);
        header.setSecurity(security);
        envelope.setHeader(header);
        Envelope.Body body = new Envelope.Body();
        LocalizarPorContratoBDP01 localizarPorContratoBDP01 = new LocalizarPorContratoBDP01();
        Canal canalValue = new Canal();
        canalValue.setCanal("OFI");
        canalValue.setEmpresa("0015");
        localizarPorContratoBDP01.setCanal(canalValue);
        localizarPorContratoBDP01.setFacade("WSBDPABBRelContrato");
        DatosInLocalizar datosInLocalizar = new DatosInLocalizar();
        DatosInLocalizar.Cuenta cuenta = new DatosInLocalizar.Cuenta();
        cuenta.getCuentaLocal().add("091586038467938");
        cuenta.setCuentaPresentacion("");
        datosInLocalizar.setCuenta(cuenta);
        datosInLocalizar.setIndVigente("A");
        localizarPorContratoBDP01.setDatosInLocalizar(datosInLocalizar);
        body.setLocalizarPorContratoBDP01(localizarPorContratoBDP01);
        envelope.setBody(body);

        JAXBContext contextObj = JAXBContext.newInstance(Envelope.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.marshal(envelope, new FileOutputStream("result.xml"));


    }
}
