package com.audintel.tsm.transport.controller;

import com.audintel.tsm.transport.dao.Bookings;
import com.audintel.tsm.transport.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookingController{
    @Autowired
    BookingService service;
    @PostMapping("/booking")
    public void save(@RequestBody Bookings booking){
//        Bookings booking = new Bookings();
//        booking.setOrigin("Bang11");
//        booking.setDest("Mas11");
        System.out.println("Call Save"+booking.getMemberID());


       service.saveBooking(booking);
    }

    @PutMapping("/booking")
    public Bookings update(@RequestBody Bookings booking){
       return  service.updateBooking(booking);
    }



    @PatchMapping ("/booking")
    public Bookings patch(@RequestBody Bookings booking){
        return  service.patchBooking(booking);
    }

    @GetMapping("/bookings")
    public String findAll(){
//        Bookings booking = new Bookings();
//        booking.setOrigin("Bang11");
//        booking.setDest("Mas11");
        System.out.println("get method");

        return service.findAll();
    }

    @GetMapping("/bookingList")
    public List<Bookings> getList(){


        return service.findList();
    }

    @RequestMapping(method=RequestMethod.GET, value="/booking/id={id}")
   // @GetMapping("/booking/id={id}")
     public Bookings getBooking(@PathVariable Integer id){
        System.out.println(id);

        return service.getBooking(id);
    }

    @DeleteMapping("/booking/id={id}")

    public void deleteBooking(@PathVariable Integer id){
        System.out.println(id);

         service.delete(id);
    }

}
