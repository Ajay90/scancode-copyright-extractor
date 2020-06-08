package com.softwareag.tpmiti.tpp_fetcher_extract.model;

public class Copyrights {

	private String value;
	private int start_line;
	private int end_line;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	@Override
	public String toString() {
		return "Copyrights [value=" + value + ", start_line=" + start_line + ", end_line=" + end_line + "]";
	}

}
