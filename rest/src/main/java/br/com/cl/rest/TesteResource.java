package br.com.cl.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TesteResource {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/teste")
    public final String teste() throws Exception {
        return "Teste";
    }

}
