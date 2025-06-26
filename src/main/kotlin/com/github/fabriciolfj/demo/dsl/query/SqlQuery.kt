package com.github.fabriciolfj.demo.dsl.query

class SqlQuery {
    private var selectClause = ""
    private var fromClause = ""
    private var whereClause = ""
    private var orderByClause = ""

    fun select(vararg columns: String) {
        selectClause = "SELECT ${columns.joinToString(", ")}"
    }

    fun from(table: String) {
        fromClause = "FROM $table"
    }

    fun where(condition: String) {
        whereClause = "WHERE $condition"
    }

    fun orderBy(column: String, direction: String = "ASC") {
        orderByClause = "ORDER BY $column $direction"
    }

    fun build(): String {
        return listOf(selectClause, fromClause, whereClause, orderByClause)
            .filter { it.isNotEmpty() }
            .joinToString(" ")
    }
}

fun query(init: SqlQuery.() -> Unit): SqlQuery {
    val query = SqlQuery()
    query.init()
    return query
}

fun main() {
    val sqlQuery = query {
        select("name", "email", "age")
        from("users")
        where("age > 18")
        orderBy("name")
    }
    println(sqlQuery.build())
}