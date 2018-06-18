package com.acme;

class Build implements Serializable {
  def steps
  def mvn(args) {
    sh "echo Hello $args"
  }
}
