### Example of Local Cache | In-Memory Cache
#### Caching Process:
```
SpringBootCache application => A
SpringBootApp application => B
```

- **A** calls **B**.
- **B** is configured to sleep for 5 seconds.
- **A** gets a response from **B** in 5+ seconds.
  <img width="1305" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/eb8d34a3-8f26-460d-9a80-adc60317a3d5">
- **A** caches the data coming from **B**.
- On hitting **A** again, the response takes < 10 ms as the data is coming from the cache and not actually from **B**.
  <img width="1314" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/1e2bef25-d158-412e-a817-3867f188842e">
- We have also configured a @Scheduler in **A** to keep cleaning the cache after every 20 seconds.
- Therefore, post 20 seconds if we hit **A** again, it gets a response from the **B** in 5+ seconds.
  
#### NOTE:
- During the period when the cache is holding the data, if **B** is turned off, still **A** gets a response in < 10 ms, as data is being fetched from the cache, and not from **B**.
- Once the cache is cleared, **A** results in a 500 Error - As no data is found in the cache, and **B** is off!
   

