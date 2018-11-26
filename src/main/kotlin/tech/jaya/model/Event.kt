package tech.jaya.model

import com.fasterxml.jackson.annotation.JsonCreator
import javax.persistence.*

@Entity
@Table(name = "event")
data class Event @JsonCreator constructor (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    var id:Long =0,

    @Column(name = "action",length = 10)
    var action:String="",

    @ManyToOne
    @JoinColumn(name = "issue")
    var issue:Issue=Issue(),

    @ManyToOne()
    @JoinColumn(name="comment", nullable = true)
    var comment:Comment?=null,

    @ManyToOne()
    @JoinColumn(name="repository")
    var repository:Repository=Repository(),

    @ManyToOne()
    @JoinColumn(name="sender")
    var sender:User=User()


)

