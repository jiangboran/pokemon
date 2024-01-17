package element

fun relationship(element_subject : ELEMENT, element_object : ELEMENT) : RELATIONSHIP_TYPE{
    if (element_subject.equals(ELEMENT.NORMAL)){
        return RELATIONSHIP_TYPE.NORMAL
    } else if (element_subject.equals(ELEMENT.GRASS)){
        if (element_object.equals(ELEMENT.NORMAL)){
            return RELATIONSHIP_TYPE.NORMAL
        } else if (element_object.equals(ELEMENT.GRASS)){
            return RELATIONSHIP_TYPE.NORMAL
        } else if (element_object.equals(ELEMENT.FIRE)){
            return RELATIONSHIP_TYPE.WEAK
        } else if (element_object.equals(ELEMENT.WATER))
            return RELATIONSHIP_TYPE.STRONG
    } else if (element_subject.equals(ELEMENT.FIRE)){
        if (element_object.equals(ELEMENT.NORMAL)){
            return RELATIONSHIP_TYPE.NORMAL
        } else if (element_object.equals(ELEMENT.GRASS)){
            return RELATIONSHIP_TYPE.STRONG
        } else if (element_object.equals(ELEMENT.FIRE)){
            return RELATIONSHIP_TYPE.NORMAL
        } else if (element_object.equals(ELEMENT.WATER)){
            return RELATIONSHIP_TYPE.WEAK
        }
    } else if (element_subject.equals(ELEMENT.WATER)){
        if (element_object.equals(ELEMENT.NORMAL)){
            return RELATIONSHIP_TYPE.NORMAL
        } else if (element_object.equals(ELEMENT.GRASS)){
            return RELATIONSHIP_TYPE.WEAK
        } else if (element_object.equals(ELEMENT.FIRE)){
            return RELATIONSHIP_TYPE.STRONG
        } else if (element_object.equals(ELEMENT.WATER)){
            return RELATIONSHIP_TYPE.NORMAL
        }
    }
    return RELATIONSHIP_TYPE.NORMAL
}

fun elementMultiple(relationship : RELATIONSHIP_TYPE) : Double{
    if (relationship == RELATIONSHIP_TYPE.STRONG){
        return 2.0
    } else if (relationship == RELATIONSHIP_TYPE.NORMAL){
        return 1.0
    } else if (relationship == RELATIONSHIP_TYPE.WEAK){
        return 0.5
    }
    return 1.0
}