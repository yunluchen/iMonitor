package ccnt.gf.imonitor.engine;

public class DevInfo {
	
	int index;
	String name;
	String description;
	
	public DevInfo(int index, String name, String description) {
		this.index = index;
		this.name = name;
		this.description = description;
		if (this.description == null)
			this.description = "No description available";
	}

	@Override
	public String toString() {
		return "DevInfo [index=" + index + ", name=" + name + ", description="
				+ description + "]";
	}
	
}
