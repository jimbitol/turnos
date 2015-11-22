class BootStrap {

    def turnosService

    def init = { servletContext ->
        turnosService.sendMail {
        }
    }

    def destroy = {
    
    }
}
