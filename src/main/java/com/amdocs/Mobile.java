package com.amdocs;

public class Mobile {
	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	
	public Mobile(Camera camera) {
		this.camera = camera;
	}




	public boolean startCameraApp() {
		System.out.println("Mobile startCamera App...");
		if(camera.on()) {
			System.out.println("startCameraApp method positive path");
			return true;
		}
		System.out.println("startCamera method negative path");
		return false;
	}
}
