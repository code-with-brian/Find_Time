package com.frugalthinker.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform