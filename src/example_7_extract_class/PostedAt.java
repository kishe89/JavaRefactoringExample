package example_7_extract_class;

import java.util.Date;

public class PostedAt {
	private Date CreatedAt;
	private Date UpdatedAt;
	public PostedAt() {
		super();
		CreatedAt = new Date(System.currentTimeMillis());
		UpdatedAt = new Date(System.currentTimeMillis());
	}
	public Date getCreatedAt() {
		return CreatedAt;
	}
	public Date getUpdatedAt() {
		return UpdatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}
	
	
}
