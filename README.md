# camunda-cloud-worker-set-celebration-message

A worker written with Java and Springboot to fetch and log service tasks from Camunda Cloud and complete them. 

 **prerequirements**:exclamation: \
In order to run the worker you need to make sure that a process is deployed to Camunda Cloud, an instance of it has been started and that a service task with the right type is available. You can find the matching process to the worker [here](https://github.com/Nlea/camunda-cloud-corona-update-process) as well as all the information how to get an account and set up a cluster, which will be needed for the worker as well.

**set up the worker** \
Make sure to load all the maven dependencies that are included in the pom file. In order to connect to Camunda Cloud create a application.properties file in the main/ ressource folder. In that file provide your Camunda Cloud Cluster credentials. You can find an example [here](https://docs.camunda.io/docs/guides/setting-up-development-project#configure-connection) 

If everything is set up you can start the CloudWorkerChooseActivityApplication class. :tada:


If you would build your own worker form sretch you can follow this [tutorial](https://docs.camunda.io/docs/guides/setting-up-development-project#prerequisites)
