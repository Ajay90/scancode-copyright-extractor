package com.softwareag.tpmiti.tpp_fetcher_extract.model;

import java.util.Arrays;

public class Matched_rule {

	private String identifier;
	private String license_expression;
	private String licenses[];
	private boolean is_license_text;
	private boolean is_license_notice;
	private boolean is_license_reference;
	private boolean is_license_tag;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getLicense_expression() {
		return license_expression;
	}

	public void setLicense_expression(String license_expression) {
		this.license_expression = license_expression;
	}

	public String[] getLicenses() {
		return licenses;
	}

	public void setLicenses(String[] licenses) {
		this.licenses = licenses;
	}

	public boolean isIs_license_text() {
		return is_license_text;
	}

	public void setIs_license_text(boolean is_license_text) {
		this.is_license_text = is_license_text;
	}

	public boolean isIs_license_notice() {
		return is_license_notice;
	}

	public void setIs_license_notice(boolean is_license_notice) {
		this.is_license_notice = is_license_notice;
	}

	public boolean isIs_license_reference() {
		return is_license_reference;
	}

	public void setIs_license_reference(boolean is_license_reference) {
		this.is_license_reference = is_license_reference;
	}

	public boolean isIs_license_tag() {
		return is_license_tag;
	}

	public void setIs_license_tag(boolean is_license_tag) {
		this.is_license_tag = is_license_tag;
	}

	@Override
	public String toString() {
		return "Matched_rule [identifier=" + identifier + ", license_expression=" + license_expression + ", licenses="
				+ Arrays.toString(licenses) + ", is_license_text=" + is_license_text + ", is_license_notice="
				+ is_license_notice + ", is_license_reference=" + is_license_reference + ", is_license_tag="
				+ is_license_tag + "]";
	}

}
