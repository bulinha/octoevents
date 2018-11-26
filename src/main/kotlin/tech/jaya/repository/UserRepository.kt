package tech.jaya.repository

import org.springframework.data.repository.CrudRepository
import tech.jaya.model.User

interface UserRepository : CrudRepository<User, Long>