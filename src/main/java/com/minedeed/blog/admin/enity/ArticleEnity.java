package com.minedeed.blog.admin.enity;

public class ArticleEnity {
    private Integer cid;

    private String title;

    private String slug;

    private Integer created;

    private Integer modified;

    private Integer order;

    private Integer authorid;

    private String template;

    private String type;

    private String status;

    private String password;

    private Integer commentsnum;

    private String allowcomment;

    private String allowping;

    private String allowfeed;

    private Integer parent;

    private String text;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug == null ? null : slug.trim();
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCommentsnum() {
        return commentsnum;
    }

    public void setCommentsnum(Integer commentsnum) {
        this.commentsnum = commentsnum;
    }

    public String getAllowcomment() {
        return allowcomment;
    }

    public void setAllowcomment(String allowcomment) {
        this.allowcomment = allowcomment == null ? null : allowcomment.trim();
    }

    public String getAllowping() {
        return allowping;
    }

    public void setAllowping(String allowping) {
        this.allowping = allowping == null ? null : allowping.trim();
    }

    public String getAllowfeed() {
        return allowfeed;
    }

    public void setAllowfeed(String allowfeed) {
        this.allowfeed = allowfeed == null ? null : allowfeed.trim();
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}