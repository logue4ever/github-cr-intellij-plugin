package com.duxtinto.intellij.plugin.github.codereviews.net.codereviews.apiv3

data class CodeReviewResponse(
        val id: Long,
        val user: UserResponse,
        val state: String
)