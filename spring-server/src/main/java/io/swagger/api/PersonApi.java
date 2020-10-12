/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Person;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-11T14:51:52.833Z")

@Api(value = "person", description = "the person API")
@RequestMapping(value = "")
public interface PersonApi {

    @ApiOperation(value = "", nickname = "postPerson", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Person received successfully") })
    @RequestMapping(value = "/person",
        produces = { "application/yaml", "application/json" }, 
        consumes = { "application/yaml", "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postPerson(@ApiParam(value = "The Person we receive and want to log"  )  @Valid @RequestBody Person person);

}