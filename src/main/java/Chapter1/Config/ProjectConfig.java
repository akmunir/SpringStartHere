package Chapter1.Config;
import Chapter1.Main.Parrot;

import org.springframework.context.annotation.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "Chapter1.Main")
 public class ProjectConfig {
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
