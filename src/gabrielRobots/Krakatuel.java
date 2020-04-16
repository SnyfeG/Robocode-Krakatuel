package gabrielRobots;

import robocode.*;

//Krakatuel
//A robot by Gabriel Eger

public class Krakatuel extends Robot {

	public void run() {
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
