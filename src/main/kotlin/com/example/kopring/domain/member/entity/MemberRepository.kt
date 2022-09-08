package com.example.kopring.domain.member.entity

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: CrudRepository<Member, Int> {
    fun existsByName(name: String): Boolean
}