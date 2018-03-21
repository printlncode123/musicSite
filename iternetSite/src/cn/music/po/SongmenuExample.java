package cn.music.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SongmenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SongmenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andMenuintroductIsNull() {
            addCriterion("menuIntroduct is null");
            return (Criteria) this;
        }

        public Criteria andMenuintroductIsNotNull() {
            addCriterion("menuIntroduct is not null");
            return (Criteria) this;
        }

        public Criteria andMenuintroductEqualTo(String value) {
            addCriterion("menuIntroduct =", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductNotEqualTo(String value) {
            addCriterion("menuIntroduct <>", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductGreaterThan(String value) {
            addCriterion("menuIntroduct >", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductGreaterThanOrEqualTo(String value) {
            addCriterion("menuIntroduct >=", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductLessThan(String value) {
            addCriterion("menuIntroduct <", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductLessThanOrEqualTo(String value) {
            addCriterion("menuIntroduct <=", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductLike(String value) {
            addCriterion("menuIntroduct like", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductNotLike(String value) {
            addCriterion("menuIntroduct not like", value, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductIn(List<String> values) {
            addCriterion("menuIntroduct in", values, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductNotIn(List<String> values) {
            addCriterion("menuIntroduct not in", values, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductBetween(String value1, String value2) {
            addCriterion("menuIntroduct between", value1, value2, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andMenuintroductNotBetween(String value1, String value2) {
            addCriterion("menuIntroduct not between", value1, value2, "menuintroduct");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andSongidIsNull() {
            addCriterion("songId is null");
            return (Criteria) this;
        }

        public Criteria andSongidIsNotNull() {
            addCriterion("songId is not null");
            return (Criteria) this;
        }

        public Criteria andSongidEqualTo(Integer value) {
            addCriterion("songId =", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotEqualTo(Integer value) {
            addCriterion("songId <>", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThan(Integer value) {
            addCriterion("songId >", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThanOrEqualTo(Integer value) {
            addCriterion("songId >=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThan(Integer value) {
            addCriterion("songId <", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThanOrEqualTo(Integer value) {
            addCriterion("songId <=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidIn(List<Integer> values) {
            addCriterion("songId in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotIn(List<Integer> values) {
            addCriterion("songId not in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidBetween(Integer value1, Integer value2) {
            addCriterion("songId between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotBetween(Integer value1, Integer value2) {
            addCriterion("songId not between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidIsNull() {
            addCriterion("songDownloadId is null");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidIsNotNull() {
            addCriterion("songDownloadId is not null");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidEqualTo(Integer value) {
            addCriterion("songDownloadId =", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidNotEqualTo(Integer value) {
            addCriterion("songDownloadId <>", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidGreaterThan(Integer value) {
            addCriterion("songDownloadId >", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("songDownloadId >=", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidLessThan(Integer value) {
            addCriterion("songDownloadId <", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidLessThanOrEqualTo(Integer value) {
            addCriterion("songDownloadId <=", value, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidIn(List<Integer> values) {
            addCriterion("songDownloadId in", values, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidNotIn(List<Integer> values) {
            addCriterion("songDownloadId not in", values, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidBetween(Integer value1, Integer value2) {
            addCriterion("songDownloadId between", value1, value2, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSongdownloadidNotBetween(Integer value1, Integer value2) {
            addCriterion("songDownloadId not between", value1, value2, "songdownloadid");
            return (Criteria) this;
        }

        public Criteria andSmidIsNull() {
            addCriterion("smid is null");
            return (Criteria) this;
        }

        public Criteria andSmidIsNotNull() {
            addCriterion("smid is not null");
            return (Criteria) this;
        }

        public Criteria andSmidEqualTo(Integer value) {
            addCriterion("smid =", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotEqualTo(Integer value) {
            addCriterion("smid <>", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThan(Integer value) {
            addCriterion("smid >", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smid >=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThan(Integer value) {
            addCriterion("smid <", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThanOrEqualTo(Integer value) {
            addCriterion("smid <=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidIn(List<Integer> values) {
            addCriterion("smid in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotIn(List<Integer> values) {
            addCriterion("smid not in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidBetween(Integer value1, Integer value2) {
            addCriterion("smid between", value1, value2, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("smid not between", value1, value2, "smid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSongcountIsNull() {
            addCriterion("songcount is null");
            return (Criteria) this;
        }

        public Criteria andSongcountIsNotNull() {
            addCriterion("songcount is not null");
            return (Criteria) this;
        }

        public Criteria andSongcountEqualTo(Integer value) {
            addCriterion("songcount =", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountNotEqualTo(Integer value) {
            addCriterion("songcount <>", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountGreaterThan(Integer value) {
            addCriterion("songcount >", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("songcount >=", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountLessThan(Integer value) {
            addCriterion("songcount <", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountLessThanOrEqualTo(Integer value) {
            addCriterion("songcount <=", value, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountIn(List<Integer> values) {
            addCriterion("songcount in", values, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountNotIn(List<Integer> values) {
            addCriterion("songcount not in", values, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountBetween(Integer value1, Integer value2) {
            addCriterion("songcount between", value1, value2, "songcount");
            return (Criteria) this;
        }

        public Criteria andSongcountNotBetween(Integer value1, Integer value2) {
            addCriterion("songcount not between", value1, value2, "songcount");
            return (Criteria) this;
        }

        public Criteria andMenucoverIsNull() {
            addCriterion("menuCover is null");
            return (Criteria) this;
        }

        public Criteria andMenucoverIsNotNull() {
            addCriterion("menuCover is not null");
            return (Criteria) this;
        }

        public Criteria andMenucoverEqualTo(String value) {
            addCriterion("menuCover =", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverNotEqualTo(String value) {
            addCriterion("menuCover <>", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverGreaterThan(String value) {
            addCriterion("menuCover >", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverGreaterThanOrEqualTo(String value) {
            addCriterion("menuCover >=", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverLessThan(String value) {
            addCriterion("menuCover <", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverLessThanOrEqualTo(String value) {
            addCriterion("menuCover <=", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverLike(String value) {
            addCriterion("menuCover like", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverNotLike(String value) {
            addCriterion("menuCover not like", value, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverIn(List<String> values) {
            addCriterion("menuCover in", values, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverNotIn(List<String> values) {
            addCriterion("menuCover not in", values, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverBetween(String value1, String value2) {
            addCriterion("menuCover between", value1, value2, "menucover");
            return (Criteria) this;
        }

        public Criteria andMenucoverNotBetween(String value1, String value2) {
            addCriterion("menuCover not between", value1, value2, "menucover");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}