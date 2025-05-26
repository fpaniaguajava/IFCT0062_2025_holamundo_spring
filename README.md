# Ejemplo simple sin persistencia de *web service* con **Spring Boot**

Implementa los *endpoints* siguientes:

- @GetMapping("/sumar")
    - public String sumar(Model model, @RequestParam Integer sumando1, @RequestParam Integer sumando2) {

- @GetMapping("/")
    - public String saludar(@RequestParam String nombre, Model model) {
