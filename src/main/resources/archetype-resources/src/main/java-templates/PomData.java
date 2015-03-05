#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

class PomData {
	public static final String ARTIFACT_ID = "${symbol_dollar}{project.artifactId}";
	public static final String NAME = "${symbol_dollar}{project.name}";
	public static final String VERSION = "${symbol_dollar}{project.version}";
}
