package org.koushik.javabrains.rest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class EmployeeConverterProvider implements ParamConverterProvider{

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type arg1, Annotation[] arg2) {
		
		if(rawType.getName().equals(Employee.class.getName())){
			return new ParamConverter<T>() {
				Employee emp = null;
				
				@Override
				public T fromString(String value) {
					if(value.equals("1")){
						emp =  new Employee(1,"Manish",28);
					}
					return rawType.cast(emp);
				}

				@Override
				public String toString(T arg0) {
					if(arg0 == null)
						return null;
					return arg0.toString();
				}
			};
		}
		return null;
	}

}
