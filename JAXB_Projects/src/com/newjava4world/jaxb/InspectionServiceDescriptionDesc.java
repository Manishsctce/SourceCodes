package com.newjava4world.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="description")
@XmlAccessorType(XmlAccessType.FIELD)
public class InspectionServiceDescriptionDesc {
	private String locations;
	private String referencedNamespaces="http://schemas.xmlsoap.org/wsdl/";
	
	@XmlAttribute(name="location")
	public String getLocation() {
		return locations;
	}
	public void setLocation(String location) {
		this.locations = location;
	}
	
	@XmlAttribute(name="referencedNamespace")
	public String getReferencedNamespace() {
		return referencedNamespaces;
	}
	public void setReferencedNamespace(String referencedNamespace) {
		this.referencedNamespaces = referencedNamespace;
	}

}
