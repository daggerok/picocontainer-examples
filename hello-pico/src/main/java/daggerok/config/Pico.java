package daggerok.config;

import daggerok.service.impl.GreeterServiceImpl;
import daggerok.service.impl.UpperServiceImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.picocontainer.behaviors.Caching;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Pico {

  private static MutablePicoContainer pico;

  public static PicoContainer context() {
    if (pico == null) initialize();
    return pico;
  }

  private static void initialize() {
    pico = new DefaultPicoContainer(new Caching());
    pico.addComponent(UpperServiceImpl.class);
    pico.addComponent(GreeterServiceImpl.class);
  }
}
