package com.acme.jenkins.pipeline;
class Build{
def Maven(pomLocation, mvnTarget, mvnOptions)
{
sh "echo call maven with these arguments $pomLocation $mvnTarget $mvnOptions"
}
def nodejs (arg1, arg2, agr3)
{
 sh "echo these are my variables  $arg1 $arg2 $arg3"
}
}
