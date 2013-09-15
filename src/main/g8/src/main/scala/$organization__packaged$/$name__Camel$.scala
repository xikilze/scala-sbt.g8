package $organization$

import grizzled.slf4j.Logger

object $name;format="Camel"$ extends App {
	val log = Logger[this.type]

  log.info("Hello, $name$")
}
