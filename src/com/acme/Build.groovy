package com.acme;

class Build implements Serializable {
  def steps
  def mvn(args) {
    steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
