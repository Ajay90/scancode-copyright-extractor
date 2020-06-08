package com.softwareag.tpmiti.tpp_fetcher_extract.model;

public class Licenses {

	private String key;
	private float score;
	private String name;
	private String short_name;
	private String category;
	private boolean is_exception;
	private String owner;
	private String homepage_url;
	private String text_url;
	private String reference_url;
	private String spdx_license_key;
	private String spdx_url;
	private int start_line;
	private int end_line;
	private Matched_rule matched_rule;
	private String matched_text;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isIs_exception() {
		return is_exception;
	}

	public void setIs_exception(boolean is_exception) {
		this.is_exception = is_exception;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getHomepage_url() {
		return homepage_url;
	}

	public void setHomepage_url(String homepage_url) {
		this.homepage_url = homepage_url;
	}

	public String getText_url() {
		return text_url;
	}

	public void setText_url(String text_url) {
		this.text_url = text_url;
	}

	public String getReference_url() {
		return reference_url;
	}

	public void setReference_url(String reference_url) {
		this.reference_url = reference_url;
	}

	public String getSpdx_license_key() {
		return spdx_license_key;
	}

	public void setSpdx_license_key(String spdx_license_key) {
		this.spdx_license_key = spdx_license_key;
	}

	public String getSpdx_url() {
		return spdx_url;
	}

	public void setSpdx_url(String spdx_url) {
		this.spdx_url = spdx_url;
	}

	public int getStart_line() {
		return start_line;
	}

	public void setStart_line(int start_line) {
		this.start_line = start_line;
	}

	public int getEnd_line() {
		return end_line;
	}

	public void setEnd_line(int end_line) {
		this.end_line = end_line;
	}

	public Matched_rule getMatched_rule() {
		return matched_rule;
	}

	public void setMatched_rule(Matched_rule matched_rule) {
		this.matched_rule = matched_rule;
	}

	public String getMatched_text() {
		return matched_text;
	}

	public void setMatched_text(String matched_text) {
		this.matched_text = matched_text;
	}

	@Override
	public String toString() {
		return "Licenses [key=" + key + ", score=" + score + ", name=" + name + ", short_name=" + short_name
				+ ", category=" + category + ", is_exception=" + is_exception + ", owner=" + owner + ", homepage_url="
				+ homepage_url + ", text_url=" + text_url + ", reference_url=" + reference_url + ", spdx_license_key="
				+ spdx_license_key + ", spdx_url=" + spdx_url + ", start_line=" + start_line + ", end_line=" + end_line
				+ ", matched_rule=" + matched_rule + ", matched_text=" + matched_text + "]";
	}

}
