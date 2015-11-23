package webserver

import org.apache.commons.logging.LogFactory

class CheckJob {

	private static final log = LogFactory.getLog(this)

    static triggers = {
      simple repeatInterval: 1000l * 60l // execute job once in 1 minute
    }

    def turnosService

    def execute() {
        
        log.debug("INICIO JOB")

        turnosService.avisarQueHayTurnos()

        log.debug("FIN JOB")
    }
}
