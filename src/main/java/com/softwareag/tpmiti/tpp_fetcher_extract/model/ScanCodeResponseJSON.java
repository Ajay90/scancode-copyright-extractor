package com.softwareag.tpmiti.tpp_fetcher_extract.model;

import java.util.Arrays;

public class ScanCodeResponseJSON {

	private Headers headers[];
	private Files files[];

	public Headers[] getHeaders() {
		return headers;
	}

	public void setHeaders(Headers[] headers) {
		this.headers = headers;
	}

	public Files[] getFiles() {
		return files;
	}

	public void setFiles(Files[] files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "ScanCodeResponseJSON [headers=" + Arrays.toString(headers) + ", files=" + Arrays.toString(files) + "]";
	}

}
