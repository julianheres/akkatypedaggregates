package com.julianheres.audit

case class LogActivity(who: ActorRef[Nothing], what: String, id: Long, replyTo: ActorRef[ActiviyLogged])

case class ActiviyLogged(who: ActorRef[Nothing], id: Long)
