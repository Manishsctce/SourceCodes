package enumDemo;

public class MediaTypes{
	private MEDIA_TYPES mediaType;
	public enum MEDIA_TYPES{STANDARD_JSON, JSON, XML};
	
	public MediaTypes(MEDIA_TYPES mediaType){
		this.mediaType = mediaType;
	}
	
	public String toString(){
		return mediaType.toString();				
	}
	
	public MEDIA_TYPES getMediaType(){
		return mediaType;
	}
	/*
	private static final String STANDARD_JSON = "STANDARD_JSON";
	private static final String JSON = "JSON";
	private static final String XML = "XML";
	
	private static final String[] VALUES_ARRAY = new String[] {STANDARD_JSON, JSON, XML};
	
	public static String getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			String result = VALUES_ARRAY[i];
			if (result.equals(name)) {
				return result;
			}
		}
		return null;
	}
	
	public String toString() {
		return super.toString();
	}
	/*private final String name;
	
	private MEDIA_TYPES(String name){
		this.name = name;
	}
	
	public String getName() {
		  return name;
	}
	
	public String toString() {
	
		return super.toString();
	}
	public static final MEDIA_TYPES STANDARD_JSON = new MEDIA_TYPES("STANDARD_JSON");
	public static final MEDIA_TYPES JSON = new MEDIA_TYPES("JSON");
	public static final MEDIA_TYPES XML = new MEDIA_TYPES("XML");
	
	private static final MEDIA_TYPES[] VALUES_ARRAY =
			new MEDIA_TYPES[] {
				STANDARD_JSON,
				JSON,
				XML,
			};

		public static final List<MEDIA_TYPES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));
		
		public static MEDIA_TYPES get(String literal) {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				MEDIA_TYPES result = VALUES_ARRAY[i];
				if (result.toString().equals(literal)) {
					return result;
				}
			}
			return null;
		}
		
		public static MEDIA_TYPES getByName(String name) {
			for (int i = 0; i < VALUES_ARRAY.length; ++i) {
				MEDIA_TYPES result = VALUES_ARRAY[i];
				if (result.getName().equals(name)) {
					return result;
				}
			}
			return null;
		}
		*/
} //MEDIA_TYPES
