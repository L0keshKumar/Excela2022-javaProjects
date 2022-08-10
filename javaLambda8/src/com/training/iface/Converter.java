package com.training.iface;
@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T value);
}
