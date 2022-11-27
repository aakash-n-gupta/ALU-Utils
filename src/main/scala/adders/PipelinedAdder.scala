package  adder

import chisel3._
import chisel3.util

class AdderIO (val width: UInt)extends Bundle{
    val a = Input(UInt(width.W))
    val b = Input(UInt(width.W))
    val cin = Input(UInt(1.W))

    val sum = Output(UInt(width.W))
    val cout = Output(UInt(1.W))
}


class PipelinedAdder extends Module{
    val io = IO(AdderIO(width))

}