package Day9_1;


class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
	}
	public void attack(Unit u) {
	}
}

class Unit {
	int currentHP;
	int x, y;
}

interface Fightable extends Movable, Attackable{
}
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}
