import scala.util.Random

class Main {

  sealed trait Msg
  private case object AuditDone extends Msg
  private case object PaymentDone extends Msg

  private def doAudit(audit: ActorRef[LogActivity], who: ActorRef[AuditDone.type], msg: String): Unit = {
    Behaviors.receive[ActiviyLogged] { ctx =>
      val id = Random.nextLong()
      audit ! LogActivity(who, msg, id, ctx.self)

    }
  }

}
