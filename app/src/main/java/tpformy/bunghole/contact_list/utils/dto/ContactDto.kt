package tpformy.bunghole.contact_list.utils.dto

data class ContactDto (
    val id: String,
    val name: String,
    val phone: String,
    val height: Float,
    val biography: String,
    val temperament: String,
    val educationPeriod: EducationPeriodDto
)