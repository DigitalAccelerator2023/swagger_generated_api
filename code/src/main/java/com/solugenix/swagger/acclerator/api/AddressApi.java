/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.17).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.solugenix.swagger.acclerator.api;

import com.solugenix.swagger.acclerator.model.Address;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-03-02T17:26:48.556+05:30")

@Api(value = "address", description = "the address API")
@RequestMapping(value = "/v1")
public interface AddressApi {

    @ApiOperation(value = "", nickname = "getAddress", notes = "", response = Address.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "It is a get API", response = Address.class) })
    @RequestMapping(value = "/address",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Address> getAddress();

}