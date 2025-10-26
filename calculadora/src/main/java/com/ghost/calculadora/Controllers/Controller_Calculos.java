package com.ghost.calculadora.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/calculadora")
public class Controller_Calculos {

    @GetMapping("/somar/{n1}/{n2}")
    public double somar(@PathVariable double n1, @PathVariable double n2) {
        return n1+n2;
    } 
    
    @GetMapping("/subtrair/{n1}/{n2}")
    public double subtrair(@PathVariable double n1, @PathVariable double n2) {
        return n1-n2;
    } 
    
    @GetMapping("/dividir/{n1}/{n2}")
    public double divivir(@PathVariable double n1, @PathVariable double n2) {
        return n1/n2;
    } 

    
    @GetMapping("/restdivision/{n1}/{n2}")
    public double restdivision(@PathVariable double n1, @PathVariable double n2) {
        return n1%n2;
    } 
    
    @GetMapping("/multiplicar/{n1}/{n2}")
    public double multiplicar(@PathVariable double n1, @PathVariable double n2) {
        return n1*n2;
    } 

    
    @GetMapping("/porcent/{n1}/{n2}")
    public double porcent(@PathVariable double n1, @PathVariable double n2) {
        return (n1*n2)/100 ;
    } 




}
