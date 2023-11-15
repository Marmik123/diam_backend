package com.example.siam.diamservice.rings;

import com.example.siam.diamservice.RingService.RingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class RingsController {

    @Autowired
    private RingService ringService;

    @PostMapping(path= "/rings")
    public ResponseEntity<Rings> createRingWithImage(
            @RequestParam("file") MultipartFile file,
                                                    @RequestParam Rings ring) {
//        System.out.println(ring);
        Rings savedRing = ringService.saveRingWithImage(
                file,
                 ring);

        return new ResponseEntity<Rings>(savedRing, HttpStatus.OK);
    }
    @GetMapping("/getrings")
    public ResponseEntity<List<Rings>> getRings(){
        List<Rings> rings = ringService.getRings();
        return new  ResponseEntity<List<Rings>>(rings,HttpStatus.OK);
    }
}
