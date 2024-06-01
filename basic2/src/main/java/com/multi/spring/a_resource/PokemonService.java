package com.multi.spring.a_resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class PokemonService {

	// 1.필드 주입 : 같은 타입의 빈이 여러개일 때

	/*
	 * @Resource(name = "charmander") private Pokemon pokemon;
	 * 
	 * public void pokemonAttack() { // TODO Auto-generated method stub
	 * 
	 * pokemon.attack();
	 * 
	 * }
	 */

	// 2. 생성자 주입 방식 모양 : 리소스 안돼서 에러남. 타입 필드 메서드만 가능함 private Pokemon pokemon;

	/*
	 * @Resource(name = "charmander") // The annotation @Resource is disallowed for
	 * this location public PokemonService(Pokemon pokemon) {
	 * 
	 * this.pokemon = pokemon; }
	 */

	// 3. 메서드 주입(setter 이용한 의존성 주입)

	private Pokemon pokemon;

	@Resource // (name = "charmander")
	@Qualifier("squirtle")
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public void pokemonAttack() { // TODO Auto-generated method stub

		pokemon.attack();

	}

}
