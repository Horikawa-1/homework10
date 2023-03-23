package com.raisetech.homework9.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

@RequiredArgsConstructor
@Getter
@Setter
public class CreateForm {


  public String getName() {
    return name;
  }


  @NotBlank
  @Length(max = 20)
  private final String name;

}
