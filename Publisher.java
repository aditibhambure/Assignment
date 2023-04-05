package Inheritance;

public class Publisher {
	 private String name;
	    private String id;
	    private String city;

	    public Publisher(String name, String id, String city) {
	        this.name = name;
	        this.id = id;
	        this.city = city;
	    }

	    public String getName() { return name; }
	    public String getId() { return id; }
	    public String getCity() { return city; }
	}