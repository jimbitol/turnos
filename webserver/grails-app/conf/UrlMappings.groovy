class UrlMappings {

	static mappings = {

        "/"(view:"/index")

        "500"(view:'/error')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
	}
}
