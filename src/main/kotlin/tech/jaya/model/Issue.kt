package tech.jaya.model

import javax.persistence.*

@Entity
@Table(name="issue")

data class Issue (

   @Id
   @Column(name="id")
   var id:Long=0,

   @Column(name="url", length = 255)
   var url:String="",

   @Column(name="repository_url", length = 255)
   var repository_url:String="",

   @Column(name="labels_url", length = 255)
   var labels_url:String="",

   @Column(name="comments_url", length = 255)
   var comments_url:String="",

   @Column(name="events_url", length = 255)
   var events_url:String="",


   @Column(name="html_url", length = 255)
    var html_url:String="",

    @Column(name="node_id", length = 255)
    var node_id:String="",

    @Column(name="number")
    var number:Long=0,

    @Column(name="title", length = 255)
    var title:String="",

    @ManyToOne
    @JoinColumn(name="user", nullable = true)
    var user:User?=null
)