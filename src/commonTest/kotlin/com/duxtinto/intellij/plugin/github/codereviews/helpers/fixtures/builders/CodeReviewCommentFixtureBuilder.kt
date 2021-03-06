package com.duxtinto.intellij.plugin.github.codereviews.helpers.fixtures.builders

import com.duxtinto.intellij.plugin.github.codereviews.domain.pullrequests.reviews.comments.CodeReviewCommentEntity
import com.duxtinto.intellij.plugin.github.codereviews.domain.pullrequests.reviews.CodeReviewEntity
import com.duxtinto.intellij.plugin.github.codereviews.helpers.fixtures.FixtureBuilder
import com.duxtinto.intellij.plugin.github.codereviews.helpers.random.RandomGenerator

class CodeReviewCommentFixtureBuilder : FixtureBuilder<CodeReviewCommentEntity> {
    private var reviewId: Long = RandomGenerator.next()
    private var state: CodeReviewCommentEntity.State = CodeReviewCommentEntity.State.ACTIVE

    override fun build(): CodeReviewCommentEntity {
        return RandomGenerator
                .next<CodeReviewCommentEntity>()
                .copy(reviewId = reviewId, state = state)
    }

    fun ofReview(codeReview: CodeReviewEntity): CodeReviewCommentFixtureBuilder {
        reviewId = codeReview.id
        return this
    }

    fun isOutdated(): CodeReviewCommentFixtureBuilder {
        state = CodeReviewCommentEntity.State.OUTDATED
        return this
    }
}
