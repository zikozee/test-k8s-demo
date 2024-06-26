package com.zee.demok8s.testk8;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ezekiel Eromosei
 * @code @created : 15 Jun, 2024
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "test-k8s")
public class TestK8sController {

    private final Environment env;

    @GetMapping
    public ResponseEntity<K8sResponse> getData(@RequestParam(value = "mode")String mode){
        log.info("test ck8 called -->>> {}", System.currentTimeMillis());
        return ResponseEntity.ok(
                new K8sResponse(
                        Mode.getMode(mode),
                        "Jade Smith",
                        Level.getLevel(env.getProperty("author.level")),
                        5
                )
        );
    }
}
