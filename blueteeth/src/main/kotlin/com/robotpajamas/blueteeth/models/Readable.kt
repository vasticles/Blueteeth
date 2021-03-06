package com.robotpajamas.blueteeth.models

import java.util.*

typealias ReadHandler = ((Result<ByteArray>) -> Unit)

interface Readable : Connectable {
    fun read(characteristic: UUID, service: UUID, block: ReadHandler)
    fun subscribeTo(characteristic: UUID, service: UUID, block: ReadHandler)
}