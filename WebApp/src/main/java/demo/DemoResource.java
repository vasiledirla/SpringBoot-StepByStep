package demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class DemoResource {

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET,
            consumes = {MediaType.ALL_VALUE})
    public String doAction() {
        return "bau";
    }
}
