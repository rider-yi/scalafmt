package org.scalafmt.config

import metaconfig._

/**
  * @param defnSite indentation around class/def
  * @param callSite indentation around function calls, etc.
  * @param extendSite indentation before `extends`
  */
case class ContinuationIndent(
    callSite: Int = 2,
    defnSite: Int = 4,
    extendSite: Int = 4
) {
  implicit val reader: ConfDecoder[ContinuationIndent] =
    generic.deriveDecoder(this).noTypos
}

object ContinuationIndent {
  implicit lazy val surface: generic.Surface[ContinuationIndent] =
    generic.deriveSurface
  implicit lazy val encoder: ConfEncoder[ContinuationIndent] =
    generic.deriveEncoder
}
