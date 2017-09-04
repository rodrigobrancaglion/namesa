package com.mobdrops.namesa.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utils implements Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	public static String convertToJson(Object object) throws JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}

	/**
	 * castList unchecked problems with lists
	 * 
	 * @param clazz
	 * @param c
	 * @return
	 */
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
		List<T> r = new ArrayList<T>(c.size());
		for (Object o : c)
			r.add(clazz.cast(o));
		return r;
	}

}
