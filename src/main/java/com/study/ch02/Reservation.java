package com.study.ch02;

public class Reservation {
	private Customer	customer;
	private Screening	screening;
	private Money		fee;
	private int			audienceCount;

	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		super();
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceCount = audienceCount;
	}
}
