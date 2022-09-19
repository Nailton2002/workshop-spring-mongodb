package br.com.workshopmongo.resource.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String srror;
	private String message;
	private String path;

	public StandardError() {
	}

	public StandardError(Long timestamp, Integer status, String srror, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.srror = srror;
		this.message = message;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSrror() {
		return srror;
	}

	public void setSrror(String srror) {
		this.srror = srror;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
