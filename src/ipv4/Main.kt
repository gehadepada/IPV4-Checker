package ipv4

fun CheckValidIPv4(ipv4: String): Boolean {
    var seg = ""
    var numOfDots = 0
    var numOfSegments = 0

    if (ipv4.isEmpty()) {
        return false
    }

    for (c in ipv4) {
        if (c.isWhitespace()) {
            return false
        }
        if (c != '.') {
            seg += c
            if (c in '0'..'9') {
                continue
            } else {
                return false
            }
        } else {
            numOfDots++
            if (seg.isEmpty()) {
                return false
            }
            if (seg[0] == '0' && seg.length > 1) {
                return false
            }
            val stringValue = seg.toIntOrNull() ?: return false
            if (stringValue < 0 || stringValue > 255) {
                return false
            }
            numOfSegments++
            seg = ""
        }
    }


    if (seg.isNotEmpty()) {
        val stringValue = seg.toIntOrNull() ?: return false
        if (stringValue < 0 || stringValue > 255 || (seg[0] == '0' && seg.length > 1) ) {
            return false
        }
        numOfSegments++
    }

    return numOfDots == 3 && numOfSegments == 4
}

/* //if there is number out of range
 val parts = ipv4.split(".")
 val numbers = parts.mapNotNull { it.toIntOrNull() }
 val isValid = numbers.all { it in 0..255 }
 if(isValid == false)
 {
     return false
 }
 // if there is extra dots or extra segment
 val dotCount = ipv4.count { it == '.' }
 if(dotCount >3) {
     return false
 }*/

