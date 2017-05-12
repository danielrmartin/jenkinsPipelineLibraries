def call(String name) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
   sh "echo deploy to $name"
   lock(quantity: 1, resource: 'deployment') {
	stage('post deployment test')
	{
	sh "echo Testing env $name"
	sleep unit:2,duration:'MINUTES'
	}
	}//end lock
}
