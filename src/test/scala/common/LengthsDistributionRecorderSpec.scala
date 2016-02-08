//package edu.luc.etl.osdi.processtree.scala
//package common
//
//import org.scalatest.WordSpec
//
///** Tests for the tree-building algorithm. */
//trait LengthsDistributionRecorderSpec extends WordSpec with LengthsDistributionRecorder {
//
//  "The tree builder" when {
//    "given an empty list of processes" should {
//      "build the correct process tree" in {
//        assert(recordLengths(Iterator.empty) == TreeFixtures.empty)
//      }
//    }
//
//    "given a simple list of processes" should {
//      "build the correct process tree" in {
//        val processes = Iterator((1, 0, "cmd"))
//        assert(recordLengths(processes) == TreeFixtures.simple)
//      }
//    }
//
//    "given a complex list of processes" should {
//      "build the correct process tree" in {
//        val processes = Iterator(
//          (1, 0, "cmd1"), (2, 1, "cmd2"), (3, 1, "cmd3"), (4, 3, "cmd4")
//        )
//        assert(recordLengths(processes) == TreeFixtures.complex)
//      }
//    }
//  }
//}
