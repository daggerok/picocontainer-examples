package daggerok.service.impl;

import daggerok.service.GreeterService;
import daggerok.service.UpperService;
import lombok.RequiredArgsConstructor;

import static java.lang.String.format;

@RequiredArgsConstructor
public class GreeterServiceImpl implements GreeterService {

  final UpperService upperService;

  @Override public String hello(final String name) {
    final String result = format("hello, %s!", name);
    return upperService.up(result);
  }
}
