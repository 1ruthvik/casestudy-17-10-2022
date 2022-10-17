package com.gl.caseStudy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.caseStudy.bean.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
