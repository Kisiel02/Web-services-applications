package com.kisiel.jobsAndWorkers.workers.dto;

import com.kisiel.jobsAndWorkers.workers.Worker;
import lombok.*;

import java.util.function.Function;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class GetWorkerResponse {

    private String surname;

    private int age;

    private String name;

    private String job;

    public static Function<Worker, GetWorkerResponse> entityToDtoMapper() {
        return worker -> new GetWorkerResponse(
                worker.getSurname(),
                worker.getAge(),
                worker.getName(),
                worker.getJob().getName()
        );
    }
}
