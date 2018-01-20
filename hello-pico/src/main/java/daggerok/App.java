package daggerok;

import daggerok.config.Pico;
import daggerok.service.impl.GreeterServiceImpl;
import lombok.val;

public class App {
  public static void main(String[] args) {
    val service = Pico.context().getComponent(GreeterServiceImpl.class);
    System.out.println(service.hello("Maksimko"));
  }
}
