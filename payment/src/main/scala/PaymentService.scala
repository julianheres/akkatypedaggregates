package main.scala

import java.net.URI
import java.util.UUID
import akka.actor.typed.ActorRef

sealed trait PaymentService

case class Authorize(payer: URI, amount: BigDecimal, id: UUID, replyTo: ActorRef[PaymentResult]) extends PaymentService

case class Capture(amount: BigDecimal, id: UUID, replyTo: ActorRef[PaymentResult]) extends PaymentService

case class Void(id: UUID, replyTo: ActorRef[PaymentResult]) extends PaymentService

case class Refund(id: UUID, replyTo: ActorRef[PaymentResult]) extends PaymentService


sealed trait PaymentResult

case class PaymentSuccess(id: UUID) extends PaymentResult

case class PaymentRejected(id: UUID, reason: String) extends PaymentResult

case class IdUnknown(id: UUID) extends PaymentResult