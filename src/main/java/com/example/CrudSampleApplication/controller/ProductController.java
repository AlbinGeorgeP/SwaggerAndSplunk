package com.example.CrudSampleApplication.controller;
import com.example.CrudSampleApplication.entity.Product;
import com.example.CrudSampleApplication.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Tag(name = "Product",description = "Rest Endpoints for Product")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    Logger logger = LogManager.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        logger.info("started hitting the find all api from controller");
        List<Product> productList = productService.findAll();
        logger.info("fetched all products  from service in controller" +productList);
        return productList;
    }

    @Operation(summary = "Get product by the id")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Found the product", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class)) })})
    @GetMapping("/{id}")
    public Optional<Product> findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @Operation(summary = "Create a product")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Product Created", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class)) })})

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }


}

