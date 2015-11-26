package webserver

import org.apache.commons.logging.LogFactory
import grails.transaction.Transactional

@Transactional
class TurnosService {

	private static final log = LogFactory.getLog(this)

    def avisarQueHayTurnos() {

    	log.debug("Por avisar que hay turnos")
		println("Por avisar que hay turnos");

        sendMail {
            to "c.a.br.er.am.8.1.5@gmail.com","m.e.rce.de.s.v.era.1.990@gmail.com"
            subject "Mail de prueba"
            html g.render(template:'/mail/turno', model:[name:'prueba'])
        }

        log.debug("YA AVISE")
		println("YA AVISE");
    }
}
