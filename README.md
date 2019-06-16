# AMS sample api 


## build image 
1. maven clean
1. maven build
1. maven build ... goal = docker:build 

## test the image localy : 
1. test the image 
```
bash run.sh
```

1. test the image 
open borwser to [http://localhost/sampleapi/](http://localhost/sampleapi/)


## push to ECR

1. confugure aws 

run the command 
```
aws configure 
```
put the credetials provided from credetials.csv

1. push the image to ecr 
```
bash push_ecr.sh
```
