package example_9_replace_typecode_subclass;

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
