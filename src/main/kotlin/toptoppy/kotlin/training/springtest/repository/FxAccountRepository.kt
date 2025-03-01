package toptoppy.kotlin.training.springtest.repository

import org.springframework.data.jpa.repository.JpaRepository
import toptoppy.kotlin.training.springtest.entity.FxAccountEntity

//มีพื้นฐานมาให้ getAll getByID  สามารถเอามาใช้ตอน test ได้เลย
interface FxAccountRepository : JpaRepository<FxAccountEntity, String> {
}