package rgms.publication

class DissertacaoController extends ThesisOrDissertationController {
   
    def grailsApplication
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def list() {
        listThesisOrDissertation("Dissertacao", params)
    }

    def create() {
        createThesisOrDissertation("Dissertacao", grailsApplication, params)
    }

    def save() {
        saveThesisOrDissertation("Dissertacao", params)
    }
    
    def show() {
        showOrEdit("Dissertacao", params.id)
    }

    def edit() {
        showOrEdit("Dissertacao", params.id)
    }

    def update() {
        updateThesisOrDissertation("Dissertacao", params)
    }

    def delete() {
        deleteThesisOrDissertation("Dissertacao", params)
    }

}