package cn.liujinhang.paper.ifc.system;

import java.lang.reflect.Constructor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ObjectMapperFactory {

	private static ObjectMapper mapper;

	static {
		try {
			Class clazz = Class.forName(ObjectMapper.class.getName());
			Constructor constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			mapper = (ObjectMapper) constructor.newInstance();
			mapper.configure(
					DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ObjectMapper getInstance() {
		return mapper;
	}

}
