package com.multi.spring.food.model.dto;

public class foodDTO {

	public String like;
	public String dislike;

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}

	public String getDislike() {
		return dislike;
	}

	public void setDislike(String dislike) {
		this.dislike = dislike;
	}

	@Override
	public String toString() {
		return "foodDTO [like=" + like + ", dislike=" + dislike + "]";
	}

}
