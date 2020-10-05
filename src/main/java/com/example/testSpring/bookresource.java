package com.example.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class bookresource {
    @Autowired
    private bookservice bs;
    @GetMapping("/BOOKS")
    public List<book> getallbooks(){
        return bs.findAllbooks();
    }

    @GetMapping("/BOOKS/{bookid}")
    public book retrevebook(@PathVariable int bookid){
        return bs.findbook(bookid);
    }

    @PostMapping("/BOOKS")
    public ResponseEntity<Object> createbook(@RequestBody book book){
        book savebook = bookservice.addbook(book);

       URI newBookL = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{bookid}")
                .buildAndExpand(savebook.getBookid())
                .toUri();

       return ResponseEntity.created(newBookL).build();
    }

}
