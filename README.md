# Ejemplo simple sin persistencia de *MVC application* con **Spring Boot** y *Thymeleaf*

Implementa las peticiones siguientes:

- @GetMapping("/sumar")
    - public String sumar(Model model, @RequestParam Integer sumando1, @RequestParam Integer sumando2) {

- @GetMapping("/")
    - public String saludar(@RequestParam String nombre, Model model) {
