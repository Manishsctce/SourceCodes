package com.newjava4world.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


@XmlSeeAlso(InspectionServiceDesc.class)
@XmlRootElement(name="inspection", namespace="http://schemas.xmlsoap.org/ws/2001/10/inspection/")
public class InspectionDesc {
	
	private String description="Generated by TIBCO ActiveMatrix";
	private List<InspectionServiceDesc> services;
	
	@XmlElement(name="abstract")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name="service")
	public List<InspectionServiceDesc> getServices() {
		return services;
	}

	public void setServices(List<InspectionServiceDesc> services) {
		this.services = services;
	}
}

