package cn.music.po;

import java.util.ArrayList;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("headImg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headImg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headImg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headImg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headImg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headImg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headImg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headImg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headImg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headImg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headImg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headImg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headImg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headImg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andBigpicIsNull() {
            addCriterion("bigPic is null");
            return (Criteria) this;
        }

        public Criteria andBigpicIsNotNull() {
            addCriterion("bigPic is not null");
            return (Criteria) this;
        }

        public Criteria andBigpicEqualTo(String value) {
            addCriterion("bigPic =", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotEqualTo(String value) {
            addCriterion("bigPic <>", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicGreaterThan(String value) {
            addCriterion("bigPic >", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicGreaterThanOrEqualTo(String value) {
            addCriterion("bigPic >=", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLessThan(String value) {
            addCriterion("bigPic <", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLessThanOrEqualTo(String value) {
            addCriterion("bigPic <=", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicLike(String value) {
            addCriterion("bigPic like", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotLike(String value) {
            addCriterion("bigPic not like", value, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicIn(List<String> values) {
            addCriterion("bigPic in", values, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotIn(List<String> values) {
            addCriterion("bigPic not in", values, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicBetween(String value1, String value2) {
            addCriterion("bigPic between", value1, value2, "bigpic");
            return (Criteria) this;
        }

        public Criteria andBigpicNotBetween(String value1, String value2) {
            addCriterion("bigPic not between", value1, value2, "bigpic");
            return (Criteria) this;
        }

        public Criteria andSingercidIsNull() {
            addCriterion("singerCid is null");
            return (Criteria) this;
        }

        public Criteria andSingercidIsNotNull() {
            addCriterion("singerCid is not null");
            return (Criteria) this;
        }

        public Criteria andSingercidEqualTo(Integer value) {
            addCriterion("singerCid =", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidNotEqualTo(Integer value) {
            addCriterion("singerCid <>", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidGreaterThan(Integer value) {
            addCriterion("singerCid >", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidGreaterThanOrEqualTo(Integer value) {
            addCriterion("singerCid >=", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidLessThan(Integer value) {
            addCriterion("singerCid <", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidLessThanOrEqualTo(Integer value) {
            addCriterion("singerCid <=", value, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidIn(List<Integer> values) {
            addCriterion("singerCid in", values, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidNotIn(List<Integer> values) {
            addCriterion("singerCid not in", values, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidBetween(Integer value1, Integer value2) {
            addCriterion("singerCid between", value1, value2, "singercid");
            return (Criteria) this;
        }

        public Criteria andSingercidNotBetween(Integer value1, Integer value2) {
            addCriterion("singerCid not between", value1, value2, "singercid");
            return (Criteria) this;
        }

        public Criteria andSmallnameIsNull() {
            addCriterion("smallName is null");
            return (Criteria) this;
        }

        public Criteria andSmallnameIsNotNull() {
            addCriterion("smallName is not null");
            return (Criteria) this;
        }

        public Criteria andSmallnameEqualTo(String value) {
            addCriterion("smallName =", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameNotEqualTo(String value) {
            addCriterion("smallName <>", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameGreaterThan(String value) {
            addCriterion("smallName >", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameGreaterThanOrEqualTo(String value) {
            addCriterion("smallName >=", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameLessThan(String value) {
            addCriterion("smallName <", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameLessThanOrEqualTo(String value) {
            addCriterion("smallName <=", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameLike(String value) {
            addCriterion("smallName like", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameNotLike(String value) {
            addCriterion("smallName not like", value, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameIn(List<String> values) {
            addCriterion("smallName in", values, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameNotIn(List<String> values) {
            addCriterion("smallName not in", values, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameBetween(String value1, String value2) {
            addCriterion("smallName between", value1, value2, "smallname");
            return (Criteria) this;
        }

        public Criteria andSmallnameNotBetween(String value1, String value2) {
            addCriterion("smallName not between", value1, value2, "smallname");
            return (Criteria) this;
        }

        public Criteria andVisitcountIsNull() {
            addCriterion("visitCount is null");
            return (Criteria) this;
        }

        public Criteria andVisitcountIsNotNull() {
            addCriterion("visitCount is not null");
            return (Criteria) this;
        }

        public Criteria andVisitcountEqualTo(Integer value) {
            addCriterion("visitCount =", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountNotEqualTo(Integer value) {
            addCriterion("visitCount <>", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountGreaterThan(Integer value) {
            addCriterion("visitCount >", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitCount >=", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountLessThan(Integer value) {
            addCriterion("visitCount <", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountLessThanOrEqualTo(Integer value) {
            addCriterion("visitCount <=", value, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountIn(List<Integer> values) {
            addCriterion("visitCount in", values, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountNotIn(List<Integer> values) {
            addCriterion("visitCount not in", values, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountBetween(Integer value1, Integer value2) {
            addCriterion("visitCount between", value1, value2, "visitcount");
            return (Criteria) this;
        }

        public Criteria andVisitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("visitCount not between", value1, value2, "visitcount");
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