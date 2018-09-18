package com.newjava4world.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name="service")
@XmlSeeAlso(InspectionServiceDescriptionDesc.class)
public class InspectionServiceDesc {
	private List<String> abstracts;
	private List<InspectionServiceDescriptionDesc> descriptions;
	
	@XmlElement(name="abstract")
	public List<String> getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(List<String> abstracts) {
		this.abstracts = abstracts;
	}
	
	@XmlElement(name="description")
	public List<InspectionServiceDescriptionDesc> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<InspectionServiceDescriptionDesc> descriptions) {
		this.descriptions = descriptions;
	}
}
