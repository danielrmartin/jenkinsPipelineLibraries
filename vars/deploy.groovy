def call(String name) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
   lock(quantity: 1, resource: 'deployment'+name) {
      stage('Deploying to '+ name){
        sh "echo deploy to $name"
	}
	stage('Test '+name)
	{
	sh "echo Testing env $name"
	sleep time: 2, unit: 'MINUTES'
	}
	}//end lock
}
