package com.dianping.cat.report.task.alert;

public class AlertEntity {
	private boolean m_isTriggered;

	private String m_content;

	private String m_alertType;
	
	public AlertEntity(){
		this.m_isTriggered = false;
		this.m_content = "";
		this.m_alertType = "";
	}
	
	public AlertEntity(boolean result, String content, String alertType){
		this.m_isTriggered = result;
		this.m_content = content;
		this.m_alertType = alertType;
	}

	public String getAlertType() {
		return m_alertType;
	}

	public String getContent() {
		return m_content;
	}

	public boolean isTriggered() {
		return m_isTriggered;
	}

}
