# AMS sample api 


## build image 
1. maven clean
1. maven build
1. maven build ... goal = docker:build 

## test the image localy : 

1. create container and run it in interactive mode 
```
bash run.sh
```

2. test the image 
open borwser to [http://localhost/sampleapi/](http://localhost/sampleapi/)


## push to ECR

1. confugure aws 

run the command 
```
aws configure 
```
put the credetials provided from credetials.csv

2. push the image to ecr 
```
bash push_ecr.sh
```
