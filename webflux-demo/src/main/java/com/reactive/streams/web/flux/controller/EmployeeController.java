package com.reactive.streams.web.flux.controller;

import com.reactive.streams.web.flux.dto.EmployeeDto;
import com.reactive.streams.web.flux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/employees")
//@AllArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<EmployeeDto> saveEmployee(@RequestBody  EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EmployeeDto> getEmployee(@PathVariable("id") String employeeId){
        return employeeService.getEmployee(employeeId);
    }

    //Server Side Events
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<EmployeeDto> getAllEmployees() {
//        return employeeService.getAllEmployees().delayElements(Duration.ofSeconds(2));
        return employeeService.getAllEmployees()
                .flatMap(employeeDto ->
                    Flux.zip(Flux.interval(Duration.ofSeconds(2)), Flux.fromStream(Stream.generate(() -> employeeDto)))).map(Tuple2::getT2);
    }

    //TODO write update and delete APIs

}
