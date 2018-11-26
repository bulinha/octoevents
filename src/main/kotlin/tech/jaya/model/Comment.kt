package tech.jaya.model

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name="comment")
data class Comment (

    @Id
    @Column(name="id")
    var id:Long =0,


    @Column(name="url", length = 255)
    var url:String="",


    @Column(name="html_url", length = 255)
    var html_url:String="",


    @Column(name="issue_url", length = 255)
    var issue_url:String="",


    @Column(name="node_id", length = 255)
    var node_id:String="",

    @ManyToOne
    @JoinColumn(name="user")
    var user:User?=null,

    @Column(name="created_at", nullable = true)
    var created_at:LocalDateTime?=null,

    @Column(name="updated_at", nullable = true)
    var updated_at:LocalDateTime?=null,

    @Column(name="author_association", length = 100)
    var author_association:String="",

    @Column(name="body" )
    @Lob
    var body:String=""
)