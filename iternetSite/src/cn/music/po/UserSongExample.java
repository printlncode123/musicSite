package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class UserSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSongExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andDownloadifIsNull() {
            addCriterion("downloadif is null");
            return (Criteria) this;
        }

        public Criteria andDownloadifIsNotNull() {
            addCriterion("downloadif is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadifEqualTo(Integer value) {
            addCriterion("downloadif =", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifNotEqualTo(Integer value) {
            addCriterion("downloadif <>", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifGreaterThan(Integer value) {
            addCriterion("downloadif >", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifGreaterThanOrEqualTo(Integer value) {
            addCriterion("downloadif >=", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifLessThan(Integer value) {
            addCriterion("downloadif <", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifLessThanOrEqualTo(Integer value) {
            addCriterion("downloadif <=", value, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifIn(List<Integer> values) {
            addCriterion("downloadif in", values, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifNotIn(List<Integer> values) {
            addCriterion("downloadif not in", values, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifBetween(Integer value1, Integer value2) {
            addCriterion("downloadif between", value1, value2, "downloadif");
            return (Criteria) this;
        }

        public Criteria andDownloadifNotBetween(Integer value1, Integer value2) {
            addCriterion("downloadif not between", value1, value2, "downloadif");
            return (Criteria) this;
        }

        public Criteria andLoveifIsNull() {
            addCriterion("loveif is null");
            return (Criteria) this;
        }

        public Criteria andLoveifIsNotNull() {
            addCriterion("loveif is not null");
            return (Criteria) this;
        }

        public Criteria andLoveifEqualTo(Integer value) {
            addCriterion("loveif =", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifNotEqualTo(Integer value) {
            addCriterion("loveif <>", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifGreaterThan(Integer value) {
            addCriterion("loveif >", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifGreaterThanOrEqualTo(Integer value) {
            addCriterion("loveif >=", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifLessThan(Integer value) {
            addCriterion("loveif <", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifLessThanOrEqualTo(Integer value) {
            addCriterion("loveif <=", value, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifIn(List<Integer> values) {
            addCriterion("loveif in", values, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifNotIn(List<Integer> values) {
            addCriterion("loveif not in", values, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifBetween(Integer value1, Integer value2) {
            addCriterion("loveif between", value1, value2, "loveif");
            return (Criteria) this;
        }

        public Criteria andLoveifNotBetween(Integer value1, Integer value2) {
            addCriterion("loveif not between", value1, value2, "loveif");
            return (Criteria) this;
        }

        public Criteria andSongmenuidIsNull() {
            addCriterion("songMenuId is null");
            return (Criteria) this;
        }

        public Criteria andSongmenuidIsNotNull() {
            addCriterion("songMenuId is not null");
            return (Criteria) this;
        }

        public Criteria andSongmenuidEqualTo(Integer value) {
            addCriterion("songMenuId =", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidNotEqualTo(Integer value) {
            addCriterion("songMenuId <>", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidGreaterThan(Integer value) {
            addCriterion("songMenuId >", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("songMenuId >=", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidLessThan(Integer value) {
            addCriterion("songMenuId <", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidLessThanOrEqualTo(Integer value) {
            addCriterion("songMenuId <=", value, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidIn(List<Integer> values) {
            addCriterion("songMenuId in", values, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidNotIn(List<Integer> values) {
            addCriterion("songMenuId not in", values, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidBetween(Integer value1, Integer value2) {
            addCriterion("songMenuId between", value1, value2, "songmenuid");
            return (Criteria) this;
        }

        public Criteria andSongmenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("songMenuId not between", value1, value2, "songmenuid");
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