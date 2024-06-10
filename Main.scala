package example

import com.fasterxml.uuid.EthernetAddress
import com.fasterxml.uuid.Generators
import com.fasterxml.uuid.UUIDGenerator
import org.openjdk.jmh.annotations.Benchmark

class Main {
  @Benchmark
  def v1gen(): UUIDGenerator = {
    Generators.timeBasedGenerator(EthernetAddress.fromPreferredInterface())
  }
}
