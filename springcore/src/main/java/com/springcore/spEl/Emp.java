package com.springcore.spEl;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Emp {

	@Value("10")
	private int x;
	@Value("20")
	private int y;
	@Value("#{temp}")
	private HashSet<String> address;

	@Value("#{mapTemp}")
	private TreeMap<String, String> feesStructure;

	public TreeMap<String, String> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(TreeMap<String, String> feesStructure) {
		this.feesStructure = feesStructure;
	}

	public HashSet<String> getAddress() {
		return address;
	}

	public void setAddress(HashSet<String> address) {
		this.address = address;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Emp [x=" + x + ", y=" + y + "]";
	}
}
