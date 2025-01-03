package com.batch.demo;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JobCompletionNotificationListener implements JobExecutionListener {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public void afterJob(JobExecution jobExecution){
        if (jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Job Completed, please check your data");
            jdbcTemplate
                    .query("select first_name, last_name from people", new DataClassRowMapper<>(Person.class))
                    .forEach(person -> System.out.println(person + " details from the database"));
        }
    }
}
