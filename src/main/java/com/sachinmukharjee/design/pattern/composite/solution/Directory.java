package com.sachinmukharjee.design.pattern.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

	private String name;
	private List<FileSystem> fileSystemList;

	public Directory(final String name) {
		this.name = name;
		fileSystemList = new ArrayList<>();
	}

	public void add(FileSystem fileSystem) {
		fileSystemList.add(fileSystem);
	}

	@Override
	public void ls() {
		System.out.println("Directory Name " + name);
		for (FileSystem fileSystem : fileSystemList) {
			fileSystem.ls();
		}
	}

}
