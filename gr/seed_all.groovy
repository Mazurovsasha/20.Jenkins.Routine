job('seed') {
  scm {
    git ('https://github.com/Mazurovsasha/20.Jenkins.Routine.git')
  }
  steps {
    dsl {
      external('gr/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
