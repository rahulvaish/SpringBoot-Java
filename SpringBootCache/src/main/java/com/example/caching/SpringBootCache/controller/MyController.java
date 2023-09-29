package com.example.caching.SpringBootCache.controller;

import com.example.caching.SpringBootCache.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class MyController {

    @Autowired
    private MyService myService;
    @Autowired
    CacheManager cacheManager;

    @GetMapping("/getData")
    @Cacheable(value = "cacheData")
    public String getData(){
        return myService.getData();
    }

    @PostMapping("/clearCacheData")
    @CacheEvict(value = "cacheData", allEntries = true)
    public void clearCacheData() {}


    @Scheduled(fixedRate = 20000)
    public void evictAllCachesAtIntervals() {
        evictAllCaches();
    }
    public void evictAllCaches() {
        cacheManager.getCacheNames().stream()
                .forEach(cacheName -> {
                    System.out.println("CACHE: "+cacheName);
                    cacheManager.getCache(cacheName).clear();
                });
        System.out.println("Cache Cleared");
    }
}
