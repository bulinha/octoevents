package tech.jaya.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import tech.jaya.model.Comment
@Repository
interface CommentRepository: CrudRepository<Comment, Long> {
}