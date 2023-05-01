package com.sachinmukharjee.design.pattern.builder;

public class Cake {

	private final int sugar;
	private final int butter;
	private final int eggs;
	private final int vanila;
	private final int flour;
	private final int bakingPowder;
	private final int milk;
	private final int cherry;

	private Cake(final Builder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.flour = builder.flour;
		this.bakingPowder = builder.bakingPowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}

	public static class Builder {

		private int sugar;
		private int butter;
		private int eggs;
		private int vanila;
		private int flour;
		private int bakingPowder;
		private int milk;
		private int cherry;

		public Builder addSugar(final int sugar) {
			this.sugar = sugar;
			return this;
		}

		public Builder addButter(final int butter) {
			this.butter = butter;
			return this;
		}

		public Builder addEggs(final int eggs) {
			this.eggs = eggs;
			return this;
		}

		public Builder addVanila(final int vanila) {
			this.vanila = vanila;
			return this;
		}

		public Builder addFlour(final int flour) {
			this.flour = flour;
			return this;
		}

		public Builder addBakingPowder(final int bakingPowder) {
			this.bakingPowder = bakingPowder;
			return this;
		}

		public Builder addMilk(final int milk) {
			this.milk = milk;
			return this;
		}

		public Builder addCherry(final int cherry) {
			this.cherry = cherry;
			return this;
		}

		public Cake build() {
			return new Cake(this);
		}

	}

	/**
	 * @return the sugar
	 */
	public int getSugar() {
		return sugar;
	}

	/**
	 * @return the butter
	 */
	public int getButter() {
		return butter;
	}

	/**
	 * @return the eggs
	 */
	public int getEggs() {
		return eggs;
	}

	/**
	 * @return the vanila
	 */
	public int getVanila() {
		return vanila;
	}

	/**
	 * @return the flour
	 */
	public int getFlour() {
		return flour;
	}

	/**
	 * @return the bakingPowder
	 */
	public int getBakingPowder() {
		return bakingPowder;
	}

	/**
	 * @return the milk
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * @return the cherry
	 */
	public int getCherry() {
		return cherry;
	}

	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
				+ flour + ", bakingPowder=" + bakingPowder + ", milk=" + milk + ", cherry=" + cherry + "]";
	}

}
