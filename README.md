#### The Application runs on the OLD VERSION of Spring Boot!

##### Step#1: Install and Start Consul Server:
```
brew install consul
consul agent —dev
```

<img width="1334" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/cfe75c13-9e51-4e3f-adcd-a5901e3f2161">
<img width="1674" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/0a4cbdc9-0367-44ed-ac99-19a447f415ad">

##### Step#2: Create Configurations on Consul:

<img width="1727" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/fe49ee6c-9bab-4096-aa2b-b51a19d65468">
<img width="1726" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/b201b958-d171-4fad-8524-127b333110ee">


##### Step#3: Start SpringBoot application - fetching configs from Consul (myApp profile)
<img width="1325" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/af8a46fe-a276-4aaf-9fff-6fa189088e28">

<hr>
<br>
<br>
<br>
<br>

##### NOTE#1: I stopped the Consul Server, however, the SpringBoot App kept fetching the configs.
<img width="1407" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/f8c3fbd8-4abf-4d58-ae63-70d72d454da8">
<img width="1361" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/88a35832-4ac6-4298-8a9f-6b0a182c972f">

##### NOTE#2: I stopped the SpringBoot App and tried re-starting. Re-Start did not worked:
<img width="1699" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/23595959-da9b-45bf-bf93-07067e4269b2">
