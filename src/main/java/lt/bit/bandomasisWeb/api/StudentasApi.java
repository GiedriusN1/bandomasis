//package lt.bit.bandomasisWeb.api;
//
//import lt.bit.bandomasisWeb.entities.Studentas;
//import lt.bit.bandomasisWeb.repositories.StudentasRepository;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("api/studentas")
//public class StudentasApi {
//
//    @Resource
//    StudentasRepository studentasRepository;
//
//
//  // Atliekame CRUD veiksmus
//
//
//   @GetMapping("/{id}")
//   @ResponseEntity
////    public <Object> ResponseEntity<List<Studentas>> read(@PathVariable int id) {
////        if (id <= 0) {
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
////        }
////
////        List<lt.bit.bandomasisWeb.entities.Studentas> studentas = studentasRepository.findAllById(id);
////        if (studentas == null) {
////            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
////        }
////        return ResponseEntity.ok(studentas);
// //  }
//
//
//
//
////}
