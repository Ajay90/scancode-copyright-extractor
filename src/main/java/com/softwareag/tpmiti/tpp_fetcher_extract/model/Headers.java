package com.softwareag.tpmiti.tpp_fetcher_extract.model;

import java.util.Arrays;

public class Headers {

	private String tool_name;
	private String tool_version;
	private Options options;
	private String notice;
	private String start_timestamp;
	private String end_timestamp;
	private String message;
	private String errors[];
	private Extra_data extra_data;

	public String getTool_name() {
		return tool_name;
	}

	public void setTool_name(String tool_name) {
		this.tool_name = tool_name;
	}

	public String getTool_version() {
		return tool_version;
	}

	public void setTool_version(String tool_version) {
		this.tool_version = tool_version;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getStart_timestamp() {
		return start_timestamp;
	}

	public void setStart_timestamp(String start_timestamp) {
		this.start_timestamp = start_timestamp;
	}

	public String getEnd_timestamp() {
		return end_timestamp;
	}

	public void setEnd_timestamp(String end_timestamp) {
		this.end_timestamp = end_timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String[] getErrors() {
		return errors;
	}

	public void setErrors(String[] errors) {
		this.errors = errors;
	}

	public Extra_data getExtra_data() {
		return extra_data;
	}

	public void setExtra_data(Extra_data extra_data) {
		this.extra_data = extra_data;
	}

	@Override
	public String toString() {
		return "Headers [tool_name=" + tool_name + ", tool_version=" + tool_version + ", options=" + options
				+ ", notice=" + notice + ", start_timestamp=" + start_timestamp + ", end_timestamp=" + end_timestamp
				+ ", message=" + message + ", errors=" + Arrays.toString(errors) + ", extra_data=" + extra_data + "]";
	}

}
