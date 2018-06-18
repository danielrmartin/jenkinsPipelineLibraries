package com.acme;

class Build implements Serializable {
  def steps
  Build(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "echo $args"
  }
}
