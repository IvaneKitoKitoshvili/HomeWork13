package com.example.homework13


import com.squareup.moshi.Json

data class ItemModel2(
    val acceptedBy: Any?,
    val address: String,
    val author: String,
    val category: String,
    val description: Any?,
    val endDate: String,
    val endDateMilliseconds: Long,
    val equipment: Equipment,
    val equipmentId: String,
    val filters: List<Filter>,
    val hasDriver: Boolean,
    val id: String,
    val internalTransportations: InternalTransportations,
    val isDummy: Boolean,
    val locations: Locations,
    val metaInfo: Any?,
    val organization: String,
    val overwriteDate: Any?,
    val projectId: String,
    val prolongDates: List<Any>,
    val releaseDates: List<Any>,
    val rentalDescription: Any?,
    val requestedBy: String,
    val startDate: String,
    val startDateMilliseconds: Long,
    val status: String,
    val type: String,
    val warehouseId: Any?
) {
    data class Equipment(
        @Json(name = "additional_specifications")
        val additionalSpecifications: Any?,
        val beaconId: String,
        val beaconType: Any?,
        val beaconVendor: String,
        @Json(name = "bgl_number")
        val bglNumber: String,
        val brand: Brand,
        val brandId: String,
        val category: Category,
        val categoryId: String,
        val createdAt: String,
        val dailyPrice: Any?,
        @Json(name = "dont_send_to_as400")
        val dontSendToAs400: Boolean,
        val equipmentMedia: List<EquipmentMedia>,
        val id: String,
        val inactive: Any?,
        val invNumber: String,
        val inventory: Any?,
        val isMoving: Boolean,
        @Json(name = "last_check")
        val lastCheck: String,
        val model: Model,
        val modelId: String,
        @Json(name = "navaris_criteria")
        val navarisCriteria: Any?,
        @Json(name = "next_check")
        val nextCheck: String,
        val organizationId: String,
        @Json(name = "RFID")
        val rFID: String,
        @Json(name = "responsible_person")
        val responsiblePerson: Any?,
        @Json(name = "serial_number")
        val serialNumber: Any?,
        @Json(name = "special_number")
        val specialNumber: Any?,
        val specifications: List<Specification>,
        val structure: Structure,
        val structureId: String,
        val tag: Tag,
        val telematicBox: Any?,
        val telematics: List<Telematic>,
        @Json(name = "test_type")
        val testType: Any?,
        val title: String,
        val trackingTag: Any?,
        @Json(name = "unique_equipment_id")
        val uniqueEquipmentId: String,
        val wareHouse: Any?,
        val warehouseId: String,
        val weight: Int,
        val workingHours: Any?,
        val year: Int
    ) {
        data class Brand(
            val createdAt: String,
            val id: String,
            val name: String
        )

        data class Category(
            val createdAt: String,
            val id: String,
            val media: List<Any>,
            val name: String,
            @Json(name = "name_de")
            val nameDe: String
        )

        data class EquipmentMedia(
            val createdAt: String,
            val files: List<File>,
            val id: String,
            val main: Boolean,
            val modelId: String,
            val modelType: String,
            val name: String,
            val type: String
        ) {
            data class File(
                val path: String,
                val size: String
            )
        }

        data class Model(
            val brand: Brand,
            val createdAt: String,
            val id: String,
            val name: String
        ) {
            data class Brand(
                val createdAt: String,
                val id: String,
                val name: String
            )
        }

        data class Specification(
            val key: String,
            val value: String
        )

        data class Structure(
            val color: String,
            val id: String,
            val name: String,
            val type: String
        )

        data class Tag(
            val authorName: String,
            val date: String,
            val media: List<Any>
        )

        data class Telematic(
            val costCenter: String,
            val equipmentId: String,
            val eventType: String,
            val lastAddressByLatLon: String,
            val lastLatLonPrecise: Boolean,
            val lastLatitude: Double,
            val lastLongitude: Double,
            val location: Location,
            val locationName: String,
            val projectId: String,
            val timestamp: Long
        ) {
            data class Location(
                val coordinates: List<List<List<List<Double>>>>,
                val type: String
            )
        }
    }

    data class Filter(
        val name: String,
        val value: Value
    ) {
        data class Value(
            val max: Int,
            val min: Int
        )
    }

    data class InternalTransportations(
        val deliveryDate: String,
        val deliveryDateMilliseconds: Long,
        val deliveryLocation: DeliveryLocation,
        val deliveryLocationAddress: String,
        val description: Any?,
        val endDateOption: Any?,
        val endDateOptionMilliseconds: Any?,
        val id: String,
        val isOrganizedWithoutSam: Any?,
        val pGroup: String,
        val pickUpDate: String,
        val pickUpDateMilliseconds: Long,
        val pickUpLocation: PickUpLocation,
        val pickUpLocationAddress: String,
        val projectRequestId: String,
        val provider: String,
        val startDateOption: Any?,
        val startDateOptionMilliseconds: Any?,
        val status: String,
        val templatePGroup: String
    ) {
        data class DeliveryLocation(
            val coordinates: List<Double>,
            val type: String
        )

        data class PickUpLocation(
            val coordinates: List<Double>,
            val type: String
        )
    }

    data class Locations(
        val coordinates: List<Double>,
        val type: String
    )
}