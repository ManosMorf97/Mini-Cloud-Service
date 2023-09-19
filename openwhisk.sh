sudo apt install openjdk-8-jdk
sudo apt install nodejs
sudo apt install npm
git clone https://github.com/apache/openwhisk.git
sudo mv OpenWhisk_CLI-1.2.0-linux-amd64/wsk /usr/local/bin/wsk
export API_HOST=http://172.17.0.1:3233
export AUTH_KEY=23bc46b1-71f6-4ed5-8c54-816aa4f8c502:123zO3xZCLrMN6v2BKK1dXYFpXlPkccOFqm12CdAsMgRU4VrNZ9lyGVCGuMDGIwP
wsk property set --apihost http://172.17.0.1:3233 --auth 23bc46b1-71f6-4ed5-8c54-816aa4f8c502:123zO3xZCLrMN6v2BKK1dXYFpXlPkccOFqm12CdAsMgRU4VrNZ9lyGVCGuMDGIwP
