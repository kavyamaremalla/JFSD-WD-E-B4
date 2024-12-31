package com.reactive.streams.web.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple8;
import reactor.util.function.Tuples;

import java.util.List;

public class FluxMonoGenerativeService {

    public static void main(String[] args) {
        FluxMonoGenerativeService service = new FluxMonoGenerativeService();
//        service.namesFlux().log(); //publisher
//        service.namesFlux().subscribe(System.out::println);
//        service.nameMono().subscribe(System.out::println);

        Tuple2<String, Integer> tuple = Tuples.of("John Doe", 25);
        System.out.println(tuple.getT1());
        System.out.println(tuple.getT2());
    }

    public Flux<String> namesFlux(){
        return Flux.fromIterable(List.of("John", "Peter","Harry","Ana"))
                .map(String::toUpperCase)
                .filter(name -> name.length() > 3)
                .log();
    }

    public Mono<String> nameMono(){
        return Mono.just("Zack").log();
    }
}
