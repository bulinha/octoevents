package tech.jaya.model

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name="repository")
data class Repository(

    @Id
    @Column(name="id")
    var id:Long=0 ,

    @Column(name="node_id", length = 255)
    var node_id:String="",

    @Column(name="name", length = 255)
    var name:String="",

    @Column(name="full_name", length = 255)
    var full_name:String="",

    @Column(name="private", length = 255)
    var private:String="",

    @ManyToOne
    @JoinColumn(name="owner")
    var owner:User?=null,

    @Column(name="html_url", length = 255)
    var html_url:String="",

    @Column(name="description", length = 255)
    var description:String?=null,

    @Column(name="fork", length = 255)
    var fork:String="",

    @Column(name="url", length = 255)
    var url:String="",

    @Column(name="forks_url", length = 255)
    var forks_url:String="",

    @Column(name="keys_url", length = 255)
    var keys_url:String="",


    @Column(name="collaborators_url", length = 255)
    var collaborators_url:String="",

    @Column(name="teams_url", length = 255)
    var teams_url:String="",


    @Column(name="hooks_url", length = 255)
    var hooks_url:String="",


    @Column(name="issue_events_url", length = 255)
    var issue_events_url:String="",

    @Column(name="events_url", length = 255)
    var events_url:String="",


    @Column(name="assignees_url", length = 255)
    var assignees_url:String="",

    @Column(name="branches_url", length = 255)
    var branches_url:String="",


    @Column(name="tags_url", length = 255)
    var tags_url:String="",


    @Column(name="blobs_url", length = 255)
    var blobs_url:String="",

    @Column(name="git_tags_url", length = 255)
    var git_tags_url:String="",


    @Column(name="git_refs_url", length = 255)
    var git_refs_url:String="",


    @Column(name="trees_url", length = 255)
    var trees_url:String="",

    @Column(name="statuses_url", length = 255)
    var statuses_url:String="",

    @Column(name="languages_url", length = 255)
    var languages_url:String="",

    @Column(name="stargazers_url", length = 255)
    var stargazers_url:String="",


    @Column(name="contributors_url", length = 255)
    var contributors_url:String="",


    @Column(name="subscribers_url", length = 255)
    var subscribers_url:String="",


    @Column(name="subscription_url", length = 255)
    var subscription_url:String="",


    @Column(name="commits_url", length = 255)
    var commits_url:String="",

    @Column(name="git_commits_url", length = 255)
    var git_commits_url:String="",


    @Column(name="comments_url", length = 255)
    var comments_url:String="",

    @Column(name="issue_comment_url", length = 255)
    var issue_comment_url:String="",


    @Column(name="contents_url", length = 255)
    var contents_url:String="",


    @Column(name="compare_url", length = 255)
    var compare_url:String="",

    @Column(name="merges_url", length = 255)
    var merges_url:String="",


    @Column(name="archive_url", length = 255)
    var archive_url:String="",

    @Column(name="downloads_url", length = 255)
    var downloads_url:String="",


    @Column(name="issues_url", length = 255)
    var issues_url:String="",


    @Column(name="pulls_url", length = 255)
    var pulls_url:String="",


    @Column(name="milestones_url", length = 255)
    var milestones_url:String="",


    @Column(name="notifications_url", length = 255)
    var notifications_url:String="",


    @Column(name="labels_url", length = 255)
    var labels_url:String="",

    @Column(name="releases_url", length = 255)
    var releases_url:String="",


    @Column(name="deployments_url", length = 255)
    var deployments_url:String="",


    @Column(name="created_at", nullable = true)
    var created_at: LocalDateTime?=null,


    @Column(name="updated_at", nullable = true)
    var updated_at: LocalDateTime?=null,


    @Column(name="pushed_at", nullable = true)
    var pushed_at: LocalDateTime?=null,


    @Column(name="git_url", length = 255)
    var git_url:String="",


    @Column(name="ssh_url", length = 255)
    var ssh_url:String="",


    @Column(name="clone_url", length = 255)
    var clone_url:String="",


    @Column(name="svn_url", length = 255)
    var svn_url:String="",


    @Column(name="homepage", length = 255, nullable = true)
    var homepage:String?=null,


    @Column(name="size")
    var size:Long=0,


    @Column(name="stargazers_count")
    var stargazers_count:Long=0,


    @Column(name="watchers_count")
    var watchers_count:Long=0,


    @Column(name="language", length = 255)
    var language:String="",


    @Column(name="has_issues")
    var has_issues:Boolean=false,


    @Column(name="has_projects")
    var has_projects:Boolean=false,


    @Column(name="has_downloads")
    var has_downloads:Boolean=false,


    @Column(name="has_wiki")
    var has_wiki:Boolean=false,


    @Column(name="has_pages")
    var has_pages:Boolean=false,


    @Column(name="forks_count")
    var forks_count:Long=0,


    @Column(name="mirror_url", length = 255, nullable = true)
    var mirror_url:String?=null,


    @Column(name="archived")
    var archived:Boolean=false,


    @Column(name="open_issues_count")
    var open_issues_count:Long=0,


    @Column(name="license", length = 255, nullable = true)
    var license:String?=null,


    @Column(name="forks")
    var forks:Long=0,


    @Column(name="open_issues")
    var open_issues:Long=0,


    @Column(name="watchers")
    var watchers:Long=0,


    @Column(name="default_branch", length = 255)
    var default_branch:String=""

)