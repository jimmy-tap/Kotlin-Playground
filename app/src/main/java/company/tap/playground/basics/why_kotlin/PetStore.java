package company.tap.playground.basics.why_kotlin;

import java.util.List;

public class PetStore {
	
	private List<Pet> pets;

	public PetStore(List<Pet> pets) {
		this.pets = pets;
	}

	public List<Pet> getPets() {
		return pets;
	}
	
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	public Pet findPet(String name) {
		for (Pet pet : pets) {
			if (pet.name.equals(name)) {
				return pet;
			}
		}
		return null;
	}
}