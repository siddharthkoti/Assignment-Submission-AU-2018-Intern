public abstract class HomeDesign {

	
	public final void buildHouse(){
		DesignStructure();
	    DesignWalls();
	    DesignDoors();
	    DesignWindows();
	    DesignFurnishing();
		System.out.println("House is built !!!");
	}

	
	private void DesignStructure() {
		System.out.println("Designing the structure of the house");
	}
	private void DesignWindows() {
		System.out.println("Building Windows");
	}	
	private void DesignDoors() {
		System.out.println("Building Doors");
	}
	private void DesignFurnishing() {
		System.out.println("Designing Furnishings");
	}

	//methods to be implemented by subclasses
	public abstract void DesignWalls();
	

	
}