package com.example.homework13

data class ItemModel(
    val itemList: List<Item>
){
    data class Item(
        val id: String? = null,
        val projectId: String? = null,
        val equipmentId: String? = null,
        val status: Boolean? = null,
        val requestedBy: String? = null,
        val acceptedBy: Any? = null,
        val author: String? = null,
        val category: String? = null,
        val locations: List<Location>? = null,
        val type: String? = null,
        val organization: String? = null,
        val address: String? = null,
        val startDate: Int? = null,
        val endDate: Int? = null,
        val description: String? = null,
        val prolongDates: Int? = null,
        val releasDates: Int? = null,
        val isDammy: Boolean? = null,
        val hadDriver: Boolean? = null,
        val overwriteDate: Any? = null,
        val metaInfo: Any? = null,
        val warhouseId: Any? = null,
        val rentalDescription: Any? = null,
        val internalTransportations: List<InternationalTransportation>? = null

    )

    data class Location(
        val coordinates: List<List<List<List<Double?>?>?>?>?? = null,
        val type: String? = null,
    )



    data class InternationalTransportation(
        val id: String? = null,
        val projectRequestId: String? = null,
        val pickupDate: Int? = null,
        val deliveryDate: Int? = null,
        val description: Any?? = null,
        val status: String? = null,
        val startDateOption: Int? = null,
        val endDateOption: Int? = null,
        val pickUpLocation: List<PickUpLocation>? = null,
        val deliveryLocation: List<DeliveryLocation>? = null,
        val provider: String? = null,
        val pickUpLocationAddress: Any?? = null,
        val deliveryLocationAddress: Any?? = null,
        val pGroup: String? = null,
        val isOrganizedWithoutSam: Any?? = null,
        val templatePGroup: String? = null,
        val pickUpDateMilliseconds: Long? = null,
        val deliveryDateMilliseconds: Long? = null,
        val startDateOptionMilliseconds: Any?? = null,
        val endDateOptionMilliseconds: Any? = null,
    )

    data class PickUpLocation(
        val type: String? = null,
        val coordinates: List <Double>? = null
    )

    data class DeliveryLocation(
        val type: String? = null,
        val coordinates: List <Double>? = null
    )


    data class Equipment(
        val startDateMilliseconds: Long? = null,
        val endDateMilliseconds: Long? = null,
        val id: String? = null,
        val title: String? = null,
        val invNumber: Int? = null,
        val categoryId: String? = null,
        val modelId: String? = null,
        val brandId: String? = null,
        val year: Int? = null,
        val specifications: List<Specification>? = null,
        val weight: Int? = null,
        val additional_specifications: String? = null,
        val structureId: String? = null,
        val organizationId: String? = null,
        val beaconType: Any?? = null,
        val beaconId: String? = null,
        val beaconVendor: String? = null,
        val RFID: Long? = null,
        val dailyPrice: Any?? = null,
        val inactive: Any?? = null,

        )

    data class Specification(
        val key: String?? = null,
        val value: String? = null
    )

}
