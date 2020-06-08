package com.softwareag.tpmiti.tpp_fetcher_extract.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Options {

	private String input;

	@JsonProperty("--copyright")
	private boolean copyright;

	@JsonProperty("--json-pp")
	private String json_pp;

	@JsonProperty("--license")
	private boolean license;

	@JsonProperty("--license-text")
	private boolean license_text;

	@JsonProperty("--only-findings")
	private boolean only_findings;

	@JsonProperty("--processes")
	private String processes;

	@JsonProperty("--quiet")
	private boolean quiet;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public boolean isCopyright() {
		return copyright;
	}

	public void setCopyright(boolean copyright) {
		this.copyright = copyright;
	}

	public String getJson_pp() {
		return json_pp;
	}

	public void setJson_pp(String json_pp) {
		this.json_pp = json_pp;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public boolean isLicense_text() {
		return license_text;
	}

	public void setLicense_text(boolean license_text) {
		this.license_text = license_text;
	}

	public boolean isOnly_findings() {
		return only_findings;
	}

	public void setOnly_findings(boolean only_findings) {
		this.only_findings = only_findings;
	}

	public String getProcesses() {
		return processes;
	}

	public void setProcesses(String processes) {
		this.processes = processes;
	}

	public boolean isQuiet() {
		return quiet;
	}

	public void setQuiet(boolean quiet) {
		this.quiet = quiet;
	}

	@Override
	public String toString() {
		return "Options [input=" + input + ", copyright=" + copyright + ", json_pp=" + json_pp + ", license=" + license
				+ ", license_text=" + license_text + ", only_findings=" + only_findings + ", processes=" + processes
				+ ", quiet=" + quiet + "]";
	}

}
