// Copyright © FunctionalHub.com 2018. All rights reserved.

import java.util.Random

fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start) + start