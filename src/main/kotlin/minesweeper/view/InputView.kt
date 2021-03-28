package minesweeper.view

tailrec fun inputHeight(): Int {
    println("높이를 입력하세요.")
    return readLine() ?.toIntOrNull()
        ?: inputHeight()
}

tailrec fun inputWidth(): Int {
    println("너비를 입력하세요.")
    return readLine() ?.toIntOrNull()
        ?: inputWidth()
}

tailrec fun inputMineCount(): Int {
    println("지뢰는 몇 개인가요?")
    return readLine() ?.toIntOrNull()
        ?: inputMineCount()
}