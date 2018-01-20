package daggerok.service.impl;

import daggerok.service.UpperService;

public class UpperServiceImpl implements UpperService {
  @Override public String up(final String input) {
    return null == input ? "NULL" : input.toUpperCase();
  }
}
