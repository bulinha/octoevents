package tech.jaya.repository

import org.springframework.data.repository.CrudRepository
import tech.jaya.model.Repository

@org.springframework.stereotype.Repository
interface RepositoryRepository: CrudRepository<Repository, Long> {
}