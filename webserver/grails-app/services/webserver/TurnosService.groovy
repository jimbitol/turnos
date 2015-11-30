package webserver

import org.apache.commons.logging.LogFactory

class TurnosService {

	private static final log = LogFactory.getLog(this)

    def mailService

    def avisarQueHayTurnos() {

    	log.debug("Por avisar que hay turnos")

        try {

            mailService.sendMail {
                to "c.a.br.er.am.8.1.5@gmail.com","m.e.rce.de.s.v.era.1.990@gmail.com"
                subject "Mail de prueba"
                body "HOLA"
                //html g.render(template:'/mail/turno', model:[name:'prueba'])
            }

            log.debug("YA AVISE")

        } catch(Exception e) {

            log.error("ERROR CUSTOM: " + e.getMessage())
            log.debug("NO AVISE")
        }
    }
}
