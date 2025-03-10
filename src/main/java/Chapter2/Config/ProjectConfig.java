package Chapter2.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "Chapter2.Main")
 public class ProjectConfig {

 // Bean method
/*  @Bean
  @Primary
  Parrot parrot0() {
   Parrot p = new Parrot("Perry");
   return p;
  }
 @Bean(value = "a")
 Parrot parrot1() {
  Parrot p = new Parrot("aaaaaaa");
  return p;
 }
 @Bean
 Parrot parrot2() {
  Parrot p = new Parrot("bbbbbbbbbbbbbbbb");
  return p;
 }*/
}
