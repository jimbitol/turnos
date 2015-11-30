package webserver

import org.apache.commons.logging.LogFactory

class CheckJob {

	private static final log = LogFactory.getLog(this)

    def concurrent = false

    static triggers = {
      simple repeatInterval: 1000l * 60l * 10l// execute job once in 10 minutes
    }

    def turnosService

    def execute() {
        
        log.debug("INICIO JOB")
        println("INICIO JOB");

        turnosService.avisarQueHayTurnos()

        log.debug("FIN JOB")
        println("FIN JOB");
    }
}
