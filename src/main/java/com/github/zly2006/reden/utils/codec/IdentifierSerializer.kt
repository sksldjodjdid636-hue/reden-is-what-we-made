package com.github.zly2006.reden.utils.codec

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
//? if < 1.21.11
import net.minecraft.resources.ResourceLocation
//? if >= 1.21.11
/*import net.minecraft.resources.Identifier*/

//? if < 1.21.11 {
object IdentifierSerializer : KSerializer<ResourceLocation> {
    override val descriptor = PrimitiveSerialDescriptor("reden.identifier", PrimitiveKind.STRING)
    override fun deserialize(decoder: Decoder) = ResourceLocation.parse(decoder.decodeString())!!
    override fun serialize(encoder: Encoder, value: ResourceLocation) {
        encoder.encodeString(value.toString())
    }
}
//?} else {
/*object IdentifierSerializer : KSerializer<Identifier> {
    override val descriptor = PrimitiveSerialDescriptor("reden.identifier", PrimitiveKind.STRING)
    override fun deserialize(decoder: Decoder) = Identifier.parse(decoder.decodeString())!!
    override fun serialize(encoder: Encoder, value: Identifier) {
        encoder.encodeString(value.toString())
    }
}
*///?}
