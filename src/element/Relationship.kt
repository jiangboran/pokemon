package element

fun relationship(subjectElement : ELEMENT, objectElement : ELEMENT) : RELATIONSHIP_TYPE{
    when (subjectElement) {
        ELEMENT.NORMAL -> {
            return when (objectElement) {
                ELEMENT.NORMAL -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.GRASS -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.FIRE -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.WATER -> {
                    RELATIONSHIP_TYPE.NORMAL
                }
            }
        }
        ELEMENT.GRASS -> {
            return when (objectElement) {
                ELEMENT.NORMAL -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.GRASS -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.FIRE -> {
                    RELATIONSHIP_TYPE.WEAK
                }

                ELEMENT.WATER -> RELATIONSHIP_TYPE.STRONG
            }
        }
        ELEMENT.FIRE -> {
            return when (objectElement) {
                ELEMENT.NORMAL -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.GRASS -> {
                    RELATIONSHIP_TYPE.STRONG
                }

                ELEMENT.FIRE -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.WATER -> {
                    RELATIONSHIP_TYPE.WEAK
                }
            }
        }
        ELEMENT.WATER -> {
            return when (objectElement) {
                ELEMENT.NORMAL -> {
                    RELATIONSHIP_TYPE.NORMAL
                }

                ELEMENT.GRASS -> {
                    RELATIONSHIP_TYPE.WEAK
                }

                ELEMENT.FIRE -> {
                    RELATIONSHIP_TYPE.STRONG
                }

                ELEMENT.WATER -> {
                    RELATIONSHIP_TYPE.NORMAL
                }
            }
        }
        else -> return RELATIONSHIP_TYPE.NORMAL
    }
}

fun elementMultiple(relationship : RELATIONSHIP_TYPE) : Double{
    return when (relationship) {
        RELATIONSHIP_TYPE.STRONG -> {
            2.0
        }
        RELATIONSHIP_TYPE.NORMAL -> {
            1.0
        }
        RELATIONSHIP_TYPE.WEAK -> {
            0.5
        }
    }
}