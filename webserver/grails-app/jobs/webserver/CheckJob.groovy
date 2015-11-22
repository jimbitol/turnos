package webserver


class CheckJob {

    static triggers = {
      simple repeatInterval: 1000l * 60l // execute job once in 1 minute
    }

    def turnosService

    def execute() {
        // execute job
    }
}
