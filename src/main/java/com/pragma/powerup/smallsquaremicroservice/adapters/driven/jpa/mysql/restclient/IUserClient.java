package com.pragma.powerup.smallsquaremicroservice.adapters.driven.jpa.mysql.restclient;
import com.pragma.powerup.smallsquaremicroservice.config.security.feingclient.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-microservice",configuration = FeignClientConfig.class, url = "${user-microservice.url}")
public interface IUserClient {
    @GetMapping("/user/owner/{id}")
    boolean validUserOwner(@PathVariable("id") Long id);

    @GetMapping("/user/employee/{id}")
    boolean validUserEmployee(@PathVariable("id") Long id);

}
