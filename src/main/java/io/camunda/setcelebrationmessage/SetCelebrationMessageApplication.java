package io.camunda.setcelebrationmessage;

import io.zeebe.client.ZeebeClient;
import io.zeebe.client.api.response.ActivatedJob;
import io.zeebe.client.api.worker.JobClient;
import io.zeebe.spring.client.EnableZeebeClient;
import io.zeebe.spring.client.ZeebeClientLifecycle;
import io.zeebe.spring.client.annotation.ZeebeWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
public class SetCelebrationMessageApplication {

	@Autowired
	private ZeebeClientLifecycle client;

	public static void main(String[] args) {
		SpringApplication.run(SetCelebrationMessageApplication.class, args);
	}

	@ZeebeWorker(type = "")
	public void handleChooseActivity(final JobClient client, final ActivatedJob job){

		String celebrationMessage = "\"Yeah Lockdown will be over soon! The week incidence is less than 50!\"";

		client.newCompleteCommand(job.getKey())
				.variables(("{\"celebrationMessage\":" + celebrationMessage + "}"))
				.send()
				.join();


	}

}
