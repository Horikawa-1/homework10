package com.raisetech.homework9.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;



public class CreateForm {


  public CreateForm(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @NotBlank
  @Length(max = 20)
  private final String name;

}
