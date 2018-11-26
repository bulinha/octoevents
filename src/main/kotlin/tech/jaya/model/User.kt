package tech.jaya.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="user")
data class User(
    @Id
    @Column(name="id")
    var id:Long = 0,

    @Column(name="login", length = 255)
    var login:String= "",

    @Column(name="node_id", length = 255)
    var node_id:String="",

    @Column(name="avatar_url", length = 255)
    var avatar_url:String="",

    @Column(name="gravatar_id", length = 255)
    var gravatar_id:String="",

    @Column(name="url", length = 255)
    var url:String="",

    @Column(name="html_url", length = 255)
    var html_url:String="",

    @Column(name="followers_url", length = 255)
    var followers_url:String="",

    @Column(name="gists_url", length = 255)
    var gists_url:String="",

    @Column(name="starred_url", length = 255)
    var starred_url:String="",

    @Column(name="subscriptions_url", length = 255)
    var subscriptions_url:String="",

    @Column(name="organizations_url", length = 255)
    var organizations_url:String="",

    @Column(name="gists_urepos_urlrl", length = 255)
    var repos_url:String="",
    @Column(name="events_url", length = 255)
    var events_url:String="",
    @Column(name="received_events_url", length = 255)
    var received_events_url:String="",

    @Column(name="type", length = 255)
    var type:String="",

    @Column(name="site_admin", length = 255)
    var site_admin:Boolean=false


) {}