package com.example.siam.diamservice.RingService;

import com.example.siam.diamservice.rings.RingRepository;
import com.example.siam.diamservice.rings.Rings;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class RingService {

//    @Value("${server.baseURL}") // Retrieve base URL from application.properties
//    private String baseURL;


    @Autowired
    private RingRepository ringRepository;

    @Transactional
    public Rings saveRingWithImage(
           MultipartFile file,
                                   @RequestBody Rings ring) {
        // Save the file to the server
        // Example path: /uploads/image_filename.jpg

        String imageURL =  "uploads/" + file.getOriginalFilename(); // Construct the URL

        // Store the URL in the ring object
        ring.setImageURL(imageURL);

        // Save the ring object along with the imageURL in the database
        return ringRepository.save(ring);
    }

    public List<Rings> getRings() {
        return ringRepository.findAll();
    }
}
