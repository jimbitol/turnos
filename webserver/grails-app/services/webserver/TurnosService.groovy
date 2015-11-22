package webserver

import grails.transaction.Transactional

@Transactional
class TurnosService {

    def avisarQueHayTurnos() {

        sendMail {
            to "c.a.br.er.am.8.1.5@gmail.com","m.e.rce.de.s.v.era.1.990@gmail.com"
            subject "Mail de prueba"
            html g.render(template:'/mail/turno', model:[name:'prueba'])
        }
    }
}
