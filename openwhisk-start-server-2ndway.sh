#./gradlew :core:standalone:build

sudo java -Dwhisk.standalone.host.name=127.0.0.1 -Dwhisk.standalone.host.internal=127.0.0.1 -Dwhisk.standalone.host.external=127.0.0.1 -jar ./bin/openwhisk-standalone.jar --couchdb --kafka --api-gw --kafka-ui
