# Mini-Cloud-Service

###### To Install this you have to type the following comand

docker-compose -f docker-minionode-red-wsk.yaml up

open localhot:1880

install on node red these libraries:
1) node-red-contrib-minio-all
2) node-red-contrib-ui-upload
3) node-red-dashboard
4) node-red-contrib-graphs
5) node-red-contrib-amqp2

Open localhost:7001 and connect to minio with the credentials from docker-compose -f docker-minionode-red-wsk.yaml
Create new bucket named info

Open localhost:1880
upload the file flows json
Type the node of minio
Set username and password the credentials as above

Then open localhost:1880/ui and you are ready

