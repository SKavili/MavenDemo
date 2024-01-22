package com.audintel.tsm.transport.service;

import com.audintel.tsm.transport.dao.Bookings;
import com.audintel.tsm.transport.repository.BookingsRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingsRepository repo;

   public void saveBooking(Bookings b){
       System.out.println(b.getMemberID());
        repo.save(b);
    }

    public Bookings updateBooking(Bookings newObj){
       // get the object associated in the DB for the id
        Bookings oldObj = getBooking(newObj.getId());
        Bookings bookings;
// set the new data into old object
        oldObj.setOrigin(newObj.getOrigin());
        oldObj.setDest(newObj.getDest());
        oldObj.setMemberID(newObj.getMemberID());
        repo.save(oldObj);
        Bookings oldObj1 = getBooking(newObj.getId());
        return oldObj1;

    }

    public Bookings patchBooking(Bookings newObj){
        // get the object associated in the DB for the id
        Bookings oldObj = getBooking(newObj.getId());
        Bookings bookings;
// set the new data into old object
        if(newObj.getOrigin() != oldObj.getOrigin())
            oldObj.setOrigin(newObj.getOrigin());
        if(newObj.getDest() != oldObj.getDest())
            oldObj.setDest(newObj.getDest());
        if(newObj.getMemberID() != oldObj.getMemberID())
            oldObj.setMemberID(newObj.getMemberID());
        repo.save(oldObj);
        Bookings oldObj1 = getBooking(newObj.getId());
        return oldObj1;

    }
    void deleteBooking(){

    }

    public Bookings getBooking(Integer id){
        Optional<Bookings> b = repo.findById(id);
        if( b.isPresent()) {
            return b.get();
        }
        else
            return  null;
    }

    void getBookings(){

    }

    void bookhistory() {

    }

    public String findAll() {
       List<Bookings> blist = (List<Bookings>) repo.findAll();
        String json = "";
        System.out.println(blist);
        for(Bookings b: blist){
            System.out.println(b.getId());
            Gson g = new Gson();
             json += g.toJson(b)+"\n";
        }
        return json;

    }

    public List<Bookings> findList() {
        List<Bookings> blist = (List<Bookings>) repo.findAll();
        return blist;

    }

    public void delete(Integer id) {
      Bookings booking =  getBooking(id);
       repo.delete(booking);
    }
}
