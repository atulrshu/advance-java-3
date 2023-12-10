package app;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Repository<T> {
	public void save(T t) {
		
		var clazz = t.getClass();
		
		var fields = clazz.getDeclaredFields();
		
		for(var field: fields) {
			var annotations = field.getDeclaredAnnotationsByType(Field.class);
			
			//System.out.println(Arrays.asList(annotations));
			
			if (annotations.length > 0) {
				System.out.println(field);
			}
		}
		
		// @formatter:off
		
		var fieldList = Arrays
			.stream(clazz.getDeclaredFields())
			.filter(f -> f.getDeclaredAnnotationsByType(Field.class).length > 0 )
			.collect(Collectors.toList());
		
		// @formatter:on
		
		System.out.println();
		
		System.out.println(fieldList);
		
	}
}
