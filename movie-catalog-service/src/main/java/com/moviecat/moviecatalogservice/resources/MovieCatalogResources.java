package com.moviecat.moviecatalogservice.resources;

import com.moviecat.moviecatalogservice.modal.CatalogItem;
import org.springframework.web.bind.annotation.*;

import javax.xml.catalog.Catalog;
import java.util.*;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId){
        return Arrays.asList(
        new CatalogItem("spiderman", "cool movie", 7)
        ) ;
    }
}
