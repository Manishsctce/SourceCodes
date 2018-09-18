package enumDemo;

import enumDemo.MediaTypes.MEDIA_TYPES;

public class Main {

	public static void main(String[] args) {
		//MediaTypes.MEDIA_TYPES.JSON = MEDIA_TYPES.XML;
		
		MediaTypes mt = new MediaTypes(MEDIA_TYPES.STANDARD_JSON);
		
		System.out.println(MediaTypes.MEDIA_TYPES.JSON);;
		System.out.println(mt.getMediaType());
		
		//Car my = new Car();
	}
}
