package com.study.ch02;

import java.time.LocalDateTime;

public class Screening {
	private Movie			movie;			// 영화
	private int				sequence;		// 순번
	private LocalDateTime	whenScreened;	// 상영시작시간

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		super();
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	public LocalDateTime getStartTime() {
		return whenScreened;
	}

	// 순번 일치 여부
	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	// 기본 요금 리턴
	public Money getMovieFee() {
		return movie.getFee();
	}

	// 영화 예매 기능
	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}

	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}
}
