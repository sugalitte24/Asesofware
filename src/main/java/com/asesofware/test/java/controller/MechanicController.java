package com.asesofware.test.java.controller;


import com.asesofware.test.java.dto.mechanic.MechanicRequest;
import com.asesofware.test.java.model.Mechanic;
import com.asesofware.test.java.service.mechanic.MechanicService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/asesoftware/mechanic")
public class MechanicController {

    @Autowired
    private MechanicService mechanicService;

    @PostMapping
    public void createUser( @RequestBody @Valid MechanicRequest mechanicRequest ) {
        mechanicService.create(mechanicRequest);
    }

    @GetMapping("get-mechanics-enabled")
    public Page<Mechanic> getMechanics( @RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size ) {
        return mechanicService.getMechanics(page, size);
    }
}
