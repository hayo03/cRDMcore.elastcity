# CSMElasticity

To support the execution of the CSM (http://www-inf.it-sudparis.eu/SIMBAD/tools/Cloud-RDM/),
this application use Drools rule engine to exploite ECA rules in order to support the 
enforcement and runtime control of all elasticity policies defined under CSM.

To test the application :
1) Create an empty Drools project.
2) Build the project using Maven.
3) Import src/main java and resources to the project.
4) Import "pom.xml" file.
4) Put your secret key and access key of AWS in the file "Elasticity_Script/awsCredentials.json".
5) Put the right path to "Elasticity_Script" in "Elasticity_Project/src/main/java/resource/filesPathBundle.properties".

