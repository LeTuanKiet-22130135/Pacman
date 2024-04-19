package model;

public interface Observer {
	void updatePacGumEaten(PacGum pg);

	void updateSuperPacGumEaten(SuperPacGum spg);

	void updateGhostCollision(Ghost gh);
}
