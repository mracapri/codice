package org.synergyj.codice.content

class Tag {
	String name
	
	static belongsTo = [content:Content]
	
	static constraints = {
		name blank:false
		content nullable:true
	}
}
