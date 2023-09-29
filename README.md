
#### Caching Process:
- SpringBootCache application calls SpringBootApp application.
- SpringBootApp is configured to sleep for 5 seconds.
- The SpringBootCache application gets a response from the SpringBootApp application in 5+ seconds.
  <img width="1305" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/eb8d34a3-8f26-460d-9a80-adc60317a3d5">
- SpringBootCache application caches the data coming from the SpringBootApp application.
- On making a Service hit again - the SpringBootCache application gets a response in < 10 ms as it fetches the data from the cache.
  <img width="1314" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/1e2bef25-d158-412e-a817-3867f188842e">
- We have configured a Scheduler in the SpringBootCache application to clean the cache every 20 seconds.
- Therefore, post 20 seconds if a service hit is made on the SpringBootCache application, it gets a response from the SpringBootApp application in 5+ seconds.
  
#### NOTE:
Instead of the SpringBootApp application, if it was the DB on the other end: 
  - On making SpringBootCache application hit, it returns data from the DB and caches the response.
  - If we update data in the DB, the cache is not updated, and the service returns the stale data from the cache.
  - Post clearing the cache. On making a Service hit again, the service returns fresh data, and loads fresh data in the cache:
