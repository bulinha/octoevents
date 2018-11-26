package tech.jaya.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import tech.jaya.model.Event
import tech.jaya.repository.*

interface IEventService{

    @Transactional
    fun saveEvent(event: Event)

}

@Service
open class EventService (val eventRepository: EventRepository,
                         val commentRepository: CommentRepository,
                         val userRepository:UserRepository,
                         val issueRepository:IssueRepository,
                         val repositoryRepository:RepositoryRepository) : IEventService {


    override fun saveEvent(event: Event){
        //cache de usuarios salvos
        val usersSaved = mutableListOf<Long>()

        if (!userRepository.existsById(event.sender.id)) {
            event.sender = userRepository.save(event.sender)
            usersSaved.add(event.sender.id)

        }

        if (event.comment!=null ) {
            if (event.comment!!.user != null && !usersSaved.contains(event.comment!!.user?.id) && userRepository.existsById(event.comment!!.user?.id)) {
                event.comment!!.user = userRepository.save(event.comment!!.user)
                usersSaved.add(event.comment!!.user!!.id)
            }
            if (!commentRepository.existsById(event.comment!!.id)) {
                event.comment = commentRepository.save(event.comment)
            }
        }


        if (event.repository.owner!=null && !usersSaved.contains(event.repository.owner?.id)  && userRepository.existsById(event.repository.owner?.id)) {
            event.repository.owner = userRepository.save(event.repository.owner)
            usersSaved.add(event.repository.owner!!.id)
        }

        if (event.issue.user!=null && !usersSaved.contains(event.issue.user?.id) && userRepository.existsById(event.issue.user?.id)) {
            event.issue.user = userRepository.save(event.issue.user)
            usersSaved.add(event.issue.user!!.id)
        }


        if (!repositoryRepository.existsById(event.repository.id)){
            event.repository = repositoryRepository.save(event.repository)
        }

        if (!issueRepository.existsById(event.issue.id)){
            event.issue = issueRepository.save(event.issue)
        }

        eventRepository.save(event)
    }
}