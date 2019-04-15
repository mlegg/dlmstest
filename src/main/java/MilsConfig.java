import java.util.ArrayList;
import java.util.List;

public class MilsConfig {
    private String name;
	private String segment;
	private String[] segmentQuals;
	private Integer segmentQualPos;
	private int depth;
    
    private List<MilsConfig> children = new ArrayList<MilsConfig>();
	private MilsConfig parent;
    
    public MilsConfig(String name) {
		this.name = name;
	}

	public MilsConfig(String name, String segment) {
		this.name = name;
		this.segment = segment;
	}

	public MilsConfig(String name, String segment, String segmentQual,
			Integer segmentQualPos) {
		this.name = name;
		this.segment = segment;
		this.segmentQuals = segmentQual.split(",");
		this.segmentQualPos = segmentQualPos;
	}
    
    	public void addChild(MilsConfig  config) {
        config.depth = this.depth + 1;
		this.children.add(config);
		config.setParent(this);
	}
	
	public MilsConfig addChild(String name, String segment) {
		MilsConfig config = new MilsConfig(name, segment);
		config.depth = this.depth + 1;
		this.children.add(config);
		config.setParent(this);
		return config;
	}

	public MilsConfig addChild(String name, String segment, String segmentQual,
			Integer segmentQualPos) {
		MilsConfig config = new MilsConfig(name, segment, segmentQual, segmentQualPos);
		config.depth = this.depth + 1;
		this.children.add(config);
		config.setParent(this);
		return config;
	}
	
	public List<MilsConfig> childList() {
		return children;
	}
	public MilsConfig getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}

	public String getSegment() {
		return segment;
	}

	public String[] getSegmentQuals() {
		return segmentQuals;
	}

	public Integer getSegmentQualPos() {
		return segmentQualPos;
	}

	public void setParent(MilsConfig config) {
		this.parent = config;
	}

	public void setChildren(List<MilsConfig> configList) {
		this.children = configList;
		for (MilsConfig config : configList) {
			config.depth = this.depth + 1;
			config.setParent(this);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public void setSegmentQuals(String[] segmentQuals) {
		this.segmentQuals = segmentQuals;
	}

	public void setSegmentQualPos(Integer segmentQualPos) {
		this.segmentQualPos = segmentQualPos;
	}

	public String toString() {
		StringBuilder dump = new StringBuilder();
		for(int i=0; i < depth; i++){
			dump.append("|  ");
		}
		dump.append("+--");
		dump.append(name);
		if (segment != null)
			dump.append(" - ").append(segment);
		if (segmentQuals != null) {
			dump.append(" - ");
			for(String s : segmentQuals) {
				dump.append(s).append(",");
			}
		}
		if (segmentQualPos != null)
			dump.append(" - ").append(segmentQualPos);
		dump.append(System.getProperty("line.separator"));
		for (MilsConfig config : children) {
			dump.append(config.toString());
		}
		return dump.toString();
	}
	
	
}
