package org.aoju.bus.gitlab.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.aoju.bus.gitlab.utils.JacksonJson;

import java.util.Date;
import java.util.List;

public class MergeRequest {

    private Boolean allowCollaboration;
    private Boolean allowMaintainerToPush;
    private Integer approvalsBeforeMerge;
    private org.aoju.bus.gitlab.models.Assignee assignee;
    private org.aoju.bus.gitlab.models.Author author;
    private List<org.aoju.bus.gitlab.models.Diff> changes;
    private Date closedAt;
    private org.aoju.bus.gitlab.models.Participant closedBy;
    private Date createdAt;
    private String description;
    private Boolean discussionLocked;
    private Integer downvotes;
    private Boolean forceRemoveSourceBranch;
    private Integer id;
    private Integer iid;
    private List<String> labels;
    private String mergeCommitSha;
    private String mergeStatus;
    private Date mergedAt;
    private org.aoju.bus.gitlab.models.Participant mergedBy;
    private Boolean mergeWhenPipelineSucceeds;
    private String mergeError;
    private org.aoju.bus.gitlab.models.Milestone milestone;
    private Integer projectId;
    private String sha;
    private Boolean shouldRemoveSourceBranch;
    private String sourceBranch;
    private Integer sourceProjectId;
    private Boolean squash;
    private String state;
    private Boolean subscribed;
    private String targetBranch;
    private Integer targetProjectId;
    private TaskCompletionStatus taskCompletionStatus;
    private org.aoju.bus.gitlab.models.TimeStats timeStats;
    private String title;
    private Date updatedAt;
    private Integer upvotes;
    private Integer userNotesCount;
    private String webUrl;
    private Boolean workInProgress;
    private org.aoju.bus.gitlab.models.DiffRef diffRefs;

    // The approval fields will only be available when listing approvals, approving  or unapproving a merge reuest.
    private Integer approvalsRequired;
    private Integer approvalsLeft;

    @JsonSerialize(using = JacksonJson.UserListSerializer.class)
    @JsonDeserialize(using = JacksonJson.UserListDeserializer.class)
    private List<org.aoju.bus.gitlab.models.User> approvedBy;

    public static final boolean isValid(MergeRequest mergeRequest) {
        return (mergeRequest != null && mergeRequest.getId() != null);
    }

    public Boolean getAllowCollaboration() {
        return allowCollaboration;
    }

    public void setAllowCollaboration(Boolean allowCollaboration) {
        this.allowCollaboration = allowCollaboration;
    }

    public Boolean getAllowMaintainerToPush() {
        return allowMaintainerToPush;
    }

    public void setAllowMaintainerToPush(Boolean allowMaintainerToPush) {
        this.allowMaintainerToPush = allowMaintainerToPush;
    }

    public Integer getApprovalsBeforeMerge() {
        return approvalsBeforeMerge;
    }

    public void setApprovalsBeforeMerge(Integer approvalsBeforeMerge) {
        this.approvalsBeforeMerge = approvalsBeforeMerge;
    }

    public org.aoju.bus.gitlab.models.Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public org.aoju.bus.gitlab.models.Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<org.aoju.bus.gitlab.models.Diff> getChanges() {
        return changes;
    }

    public void setChanges(List<Diff> changes) {
        this.changes = changes;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public org.aoju.bus.gitlab.models.Participant getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(org.aoju.bus.gitlab.models.Participant closedBy) {
        this.closedBy = closedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDiscussionLocked() {
        return discussionLocked;
    }

    public void setDiscussionLocked(Boolean discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    public Integer getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(Integer downvotes) {
        this.downvotes = downvotes;
    }

    public Boolean getForceRemoveSourceBranch() {
        return forceRemoveSourceBranch;
    }

    public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
        this.forceRemoveSourceBranch = forceRemoveSourceBranch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public Date getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(Date mergedAt) {
        this.mergedAt = mergedAt;
    }

    public org.aoju.bus.gitlab.models.Participant getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(Participant mergedBy) {
        this.mergedBy = mergedBy;
    }

    public Boolean getMergeWhenPipelineSucceeds() {
        return mergeWhenPipelineSucceeds;
    }

    public void setMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
        this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
    }

    public String getMergeError() {
        return mergeError;
    }

    public void setMergeError(String mergeError) {
        this.mergeError = mergeError;
    }

    public org.aoju.bus.gitlab.models.Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Boolean getShouldRemoveSourceBranch() {
        return shouldRemoveSourceBranch;
    }

    public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public Integer getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(Integer sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public Integer getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(Integer targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public TaskCompletionStatus getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    public void setTaskCompletionStatus(TaskCompletionStatus taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
    }

    public org.aoju.bus.gitlab.models.TimeStats getTimeStats() {
        return timeStats;
    }

    public void setTimeStats(TimeStats timeStats) {
        this.timeStats = timeStats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public Integer getUserNotesCount() {
        return userNotesCount;
    }

    public void setUserNotesCount(Integer userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Boolean getWorkInProgress() {
        return workInProgress;
    }

    public void setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
    }

    /**
     * Get the number of approvals required for the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @return the number of approvals required for the merge request
     */
    public Integer getApprovalsRequired() {
        return approvalsRequired;
    }

    /**
     * Set the number of approvals required for the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @param approvalsRequired the number of approvals required for the merge request
     */
    public void setApprovalsRequired(Integer approvalsRequired) {
        this.approvalsRequired = approvalsRequired;
    }

    /**
     * Get the number of approvals left for the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @return the number of approvals left for the merge request
     */
    public Integer getApprovalsLeft() {
        return approvalsLeft;
    }

    /**
     * Set the number of approvals missing for the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @param approvalsLeft the number of approvals missing for the merge request
     */
    public void setApprovalsLeft(Integer approvalsLeft) {
        this.approvalsLeft = approvalsLeft;
    }

    /**
     * Get the list of users that have approved the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @return the list of users that have approved the merge request
     */
    public List<org.aoju.bus.gitlab.models.User> getApprovedBy() {
        return approvedBy;
    }

    /**
     * Set the list of users that have approved the merge request.
     * <p>
     * NOTE: This property will only be used when listing, approiving, or unapproving a merge request.
     *
     * @param approvedBy the list of users that have approved the merge request
     */
    public void setApprovedBy(List<User> approvedBy) {
        this.approvedBy = approvedBy;
    }

    public org.aoju.bus.gitlab.models.DiffRef getDiffRefs() {
        return diffRefs;
    }

    public void setDiffRefs(final DiffRef diffRefs) {
        this.diffRefs = diffRefs;
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}
