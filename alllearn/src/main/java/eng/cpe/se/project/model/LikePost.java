package eng.cpe.se.project.model;
// Generated Mar 7, 2023, 11:29:50 PM by Hibernate Tools 5.6.3.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Likepost generated by hbm2java
 */
public class LikePost implements java.io.Serializable {

	private Integer likePostId;
	@JsonIgnore
	private Post post;
	@JsonIgnore
	private User user;

	public LikePost() {
	}

	public LikePost(Post post, User user) {
		this.post = post;
		this.user = user;
	}

	public Integer getLikePostId() {
		return this.likePostId;
	}

	public void setLikePostId(Integer likePostId) {
		this.likePostId = likePostId;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
