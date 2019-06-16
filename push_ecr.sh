$(aws ecr get-login --no-include-email --region ap-southeast-2)

docker tag amsboot:latest 232636427263.dkr.ecr.ap-southeast-2.amazonaws.com/ams:latest

docker push 232636427263.dkr.ecr.ap-southeast-2.amazonaws.com/ams:latest