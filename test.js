const xhr=new XMLHttpRequest();
xhr.open("get", "http://172.17.0.1:3233/api/v1/namespaces/_/actions/hello_ac", true);
xhr.setRequestHeader('Content-Type', 'application/json');
xhr.send()
