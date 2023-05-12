package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.Rooms;
import com.corvanta.hostel.entity.UserExpenses;
import com.corvanta.hostel.repository.HostellerRepository;

@Component
public class HostellerService {

	private HostellerRepository hostellerRepository;

	public HostellerService(HostellerRepository hostellerRepository) {
		this.hostellerRepository = hostellerRepository;
	}
	
	public List<Hosteller> getHostellers() {
		return hostellerRepository.findAll();
	}

	public Hosteller saveHosteller(Hosteller hosteller) {
		return hostellerRepository.save(hosteller);
	}

	public Hosteller getHosteller(int hostellerId) {
		return hostellerRepository.findById(hostellerId).get();
	}
	

	public List<Hosteller> getHostellerByLocationAndApartmentId(int locationId,int serviceApartmentId) {
		return hostellerRepository.findByLocationIdAndServiceApartmentId(locationId,serviceApartmentId);
	}
	
	public List<Hosteller> getHostellerByLocationId(int locationId) {

		return hostellerRepository.findByLocationId(locationId);
	}

	public List<Hosteller> getHostellerByApartmentId(int serviceApartmentId) {

		return hostellerRepository.findByServiceApartmentId(serviceApartmentId);
	}

	public Hosteller updateHosteller(int hostellerId, Hosteller hosteller) {
		hosteller.setId(hostellerId);
		return hostellerRepository.save(hosteller);
	}
	
	public Hosteller deleteHosteller(int hostellerId) {
		return hostellerRepository.deleteById(hostellerId);
	}
}

