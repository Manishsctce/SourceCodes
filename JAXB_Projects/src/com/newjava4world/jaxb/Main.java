package com.newjava4world.jaxb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.xml.internal.ws.util.ByteArrayDataSource;

public class Main {
	public static void main(String[] args) {
		List<String> abstracts = new ArrayList<>();
		abstracts.add("Service: {http://namespace.amberpoint.com/amf}AmberPointManagement");
		abstracts.add("Endpoint: AmberPointManagementPort");
		
		InspectionServiceDescriptionDesc desc1 = new InspectionServiceDescriptionDesc();
		desc1.setLocation("http://msadasiv-HPZ420:10866/node1_development/amberpoint/management?wsdl");
		desc1.setReferencedNamespace("http://schemas.xmlsoap.org/wsdl/");
		
		/*InspectionServiceDescriptionDesc desc2 = new InspectionServiceDescriptionDesc();
		desc2.setLocation("http://10.97.24.119:10866/getWsdl?namespace=http://namespace.amberpoint.com/amf&amp;serviceLocalName=AmberPointManagement&amp;endpointName=AmberPointManagementPort");
		desc2.setReferencedNamespace("http://schemas.xmlsoap.org/wsdl/");*/
		
		List<InspectionServiceDescriptionDesc> descriptions = new ArrayList<>();
		descriptions.add(desc1);
		//descriptions.add(desc2);
		
		InspectionServiceDesc s1 = new InspectionServiceDesc();
		s1.setAbstracts(abstracts);
		s1.setDescriptions(descriptions);
		
		List<InspectionServiceDesc> services = new ArrayList<>();		
		services.add(s1);
		services.add(s1);
		
		InspectionDesc inspection = new InspectionDesc();
		inspection.setDescription("My Descrition");
		inspection.setServices(services);
		
		
		try {
			
			File file = new File(".//src//com//newjava4world//jaxb//inspection.wsil");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			
			
			if(!file.exists()){
				System.out.println("File not exist");
				System.out.println("Created New file:"+ file.createNewFile());
			}
			FileOutputStream fout = new FileOutputStream(file);
			JAXBContext jaxbContext = JAXBContext.newInstance(InspectionDesc.class);
			Marshaller marshaller = jaxbContext.createMarshaller();			
		//	marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "addadfadfadf");
			//marshaller.setProperty("xmls", "thismynamespace"); //cannot set any property
			marshaller.marshal(inspection,fout);
			//marshaller.marshal(inspection,bos);
			
			DataSource ds = new ByteArrayDataSource(bos.toByteArray(), "manish");
			DataHandler dh = new DataHandler(ds);
			
			System.out.println(dh.getContentType());
			byte[] readByte = new byte[128];
			InputStream dhis = dh.getInputStream();
			int readCount = dhis.read(readByte, 0, readByte.length);
			while(readCount!=-1){
				System.out.println(new String(readByte));
				readCount = dhis.read(readByte, 0, readByte.length);
			}
			System.out.println();
			System.out.println("complete");
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
