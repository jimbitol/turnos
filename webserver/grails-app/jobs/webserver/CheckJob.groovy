package webserver

import org.apache.commons.logging.LogFactory

class CheckJob {

	private static final log = LogFactory.getLog(this)

    def concurrent = false

    static triggers = {
        cron name: 'checkTurnosTrigger', cronExpression: "0 0/10 * * * ?"
    }

    def turnosService

    def execute() {
        
        log.debug("INICIO JOB")
        println("INICIO JOB")

        turnosService.avisarQueHayTurnos()

        log.debug("FIN JOB")
        println("FIN JOB")
    }
}
