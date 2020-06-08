package com.softwareag.tpmiti.tpp_fetcher_extract.model;

import java.util.Arrays;

public class Files {

	private String path;
	private String type;
	private Licenses licenses[];
	private String license_expressions[];
	private Holders holders[];
	private Copyrights copyrights[];
	private Authors authors[];
	private Scan_errors scan_errors[];

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Licenses[] getLicenses() {
		return licenses;
	}

	public void setLicenses(Licenses[] licenses) {
		this.licenses = licenses;
	}

	public String[] getLicense_expressions() {
		return license_expressions;
	}

	public void setLicense_expressions(String[] license_expressions) {
		this.license_expressions = license_expressions;
	}

	public Holders[] getHolders() {
		return holders;
	}

	public void setHolders(Holders[] holders) {
		this.holders = holders;
	}

	public Copyrights[] getCopyrights() {
		return copyrights;
	}

	public void setCopyrights(Copyrights[] copyrights) {
		this.copyrights = copyrights;
	}

	public Authors[] getAuthors() {
		return authors;
	}

	public void setAuthors(Authors[] authors) {
		this.authors = authors;
	}

	public Scan_errors[] getScan_errors() {
		return scan_errors;
	}

	public void setScan_errors(Scan_errors[] scan_errors) {
		this.scan_errors = scan_errors;
	}

	@Override
	public String toString() {
		return "Files [path=" + path + ", type=" + type + ", licenses=" + Arrays.toString(licenses)
				+ ", license_expressions=" + Arrays.toString(license_expressions) + ", holders="
				+ Arrays.toString(holders) + ", copyrights=" + Arrays.toString(copyrights) + ", authors="
				+ Arrays.toString(authors) + ", scan_errors=" + Arrays.toString(scan_errors) + "]";
	}

}
