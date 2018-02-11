package templateMethod;

public abstract class DisplayAbstraction {

	public abstract void start();
	public abstract void print();
	public abstract void end();
	public final void display() {
		start();
		print();
		end();
	}
}
