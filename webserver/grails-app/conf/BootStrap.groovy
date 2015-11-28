class BootStrap {

    def turnosService

    def init = { servletContext ->
        turnosService.sendMail {
        	to "c.a.br.er.am.8.1.5@gmail.com","m.e.rce.de.s.v.era.1.990@gmail.com"
            subject "Mail de prueba"
            body "HOLA"
        }
    }

    def destroy = {
    
    }
}
