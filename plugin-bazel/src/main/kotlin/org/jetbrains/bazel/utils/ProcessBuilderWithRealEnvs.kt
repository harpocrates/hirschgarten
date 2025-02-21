package org.jetbrains.bazel.utils

public fun ProcessBuilder.withRealEnvs(): ProcessBuilder {
  val env = environment()
  env.clear()
  env.putAll(System.getenv())

  return this
}
