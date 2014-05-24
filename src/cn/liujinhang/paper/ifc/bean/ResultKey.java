package cn.liujinhang.paper.ifc.bean;

public class ResultKey {

	private String key;

	private boolean isAnalyzed;

	public ResultKey(String key, boolean isAnalyzed) {
		this.key = key;
		this.isAnalyzed = isAnalyzed;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isAnalyzed() {
		return isAnalyzed;
	}

	public void setAnalyzed(boolean isAnalyzed) {
		this.isAnalyzed = isAnalyzed;
	}

}
