#### The Application runs on the OLD VERSION of Spring Boot!

##### Step#1: Install and Start Consul Server:
```
brew install consul
brew install vault
consul agent —dev
vault server -dev
```

<img width="1334" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/cfe75c13-9e51-4e3f-adcd-a5901e3f2161">
<img width="1674" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/0a4cbdc9-0367-44ed-ac99-19a447f415ad">

##### Step#2: Create Configurations on Consul:

<img width="1727" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/fe49ee6c-9bab-4096-aa2b-b51a19d65468">
<img width="1726" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/b201b958-d171-4fad-8524-127b333110ee">

##### Step#3: Start SpringBoot application - fetching configs from Consul (myApp profile)
<img width="1325" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/af8a46fe-a276-4aaf-9fff-6fa189088e28">
