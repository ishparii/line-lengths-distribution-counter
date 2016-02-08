package edu.luc.etl.osdi.processtree.scala
package common

import org.scalatest.WordSpec

/** Tests for the lengths distribution recording algorithm. */
trait LengthsDistributionRecorderSpec extends WordSpec with LengthsDistributionRecorder {

  "The lengths distribution recorder" when {
    "given an empty list of lines" should {
      "record the correct lengths distribution" in {
        assert(recordLengths(Iterator.empty) == LengthDistributionFixtures.empty)
      }
    }

    "given a simple list of lines" should {
      "record the correct lengths distribution" in {
        val lines = Iterator("", "")
        assert(recordLengths(lines) == LengthDistributionFixtures.simple)
      }
    }

    "given a complex list of lines" should {
      "record the correct lengths distribution" in {
        val lines = Iterator(
          "xxxxx", "xxxxx", "", "xx", "xxxxx", "", "xxxxx"
        )
        assert(recordLengths(lines) == LengthDistributionFixtures.complex)
      }
    }
  }
}
