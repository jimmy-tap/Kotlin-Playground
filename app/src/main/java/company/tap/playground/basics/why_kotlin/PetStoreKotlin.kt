package company.tap.kotlinexploring.basics.why_kotlin;

import company.tap.playground.basics.why_kotlin.Pet

class PetStoreKotlin (var pets: List<Pet>) {
	fun findPet(name: String): Pet? {
		return pets.firstOrNull { pet -> pet.name == name }
	}
}
