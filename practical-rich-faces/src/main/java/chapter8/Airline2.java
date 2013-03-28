package chapter8;

public class Airline2 implements java.io.Serializable {
	private Integer id;
	private String name;
	private String code;
	private String logoImage;

	
	
	
	public Airline2(Integer id, String name, String code) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.logoImage = "/images/air.jpg";
	}

	public String toString() {
		return name + ":" + code;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((code == null) ? 0 : code.hashCode());
//		result = prime * result
//				+ ((logoImage == null) ? 0 : logoImage.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		final Airline2 other = (Airline2) obj;
//		if (code == null) {
//			if (other.code != null)
//				return false;
//		} else if (!code.equals(other.code))
//			return false;
//		if (logoImage == null) {
//			if (other.logoImage != null)
//				return false;
//		} else if (!logoImage.equals(other.logoImage))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
