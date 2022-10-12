package com.online.restaurent.app;

import com.online.restaurent.Customer;

import com.online.restaurent.vendor;
import com.online.restaurent.order;
import com.online.restaurent.Customer;
import java.sql.SQLOutput;
import java.util.Date;
import java.util.SortedMap;

public class Application{

        public static void main(String[] args) {
            Customer prajwal=new Customer();

            prajwal.setName("Prajwal");
            prajwal.setCity("Nagpur");
            prajwal.setAddress("New Nandanwan,Nagpur");
            prajwal.setState("Maharashtra");
            prajwal.setEmailid("prajwaldharme27@gmail.com");
            prajwal.setPhonenumber(8007770256L);

            System.out.println("Name: "+ prajwal.getName());
            System.out.println("City: "+prajwal.getCity());
            System.out.println("Address: "+prajwal.getAddress());
            System.out.println("State: "+prajwal.getState());
            System.out.println("Email Id: "+prajwal.getEmailid());
            System.out.println("Phone no: "+prajwal.getPhonenumber());


           vendor haldiram =new vendor();
           haldiram.setName("Haldiram Restaurant");
           haldiram.setAddress("Ajni Square,Nagpur");
           haldiram.setCategory("VEG");
           haldiram.setRating("5.0");
           haldiram.setState("Maharashtra");
           haldiram.setCity("Nagpur");

            System.out.println("Vendor Details:");
            System.out.println("Name: "+haldiram.getName());
            System.out.println("Address: "+haldiram.getAddress());
            System.out.println("Category: "+haldiram.getCategory());
            System.out.println("Phone: "+haldiram.getPhoneNumber());
            System.out.println("Rating: "+haldiram.getRating());
            System.out.println("State: "+haldiram.getState());
            System.out.println("City: "+haldiram.getCity());

            order order =new order();
            order.setCustomer(prajwal);
            order.setVendor(haldiram);
            order.setTotalAmount(999.00);
            order.setOrderDate(new Date());
            order.setDeliveryAddress("103, Darshan colny, Nandanwan Nagpur");

            System.out.println("Order details : ");
            System.out.println("Total Amount: "+order.getTotalAmount());
            System.out.println("Order Date: "+order.getOrderDate());

        }
    }


