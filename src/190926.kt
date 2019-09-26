class Television(
    val manufacturer : String,
    var currentChannel : Int,
    var currentVolume : Int,
    var turnOn : Boolean) {

    // Q) 채널 조정, 볼륨 조정 메소드 추가
    fun volumeUp(newValume : Int) : Int {
        currentVolume = newValume

        return currentChannel
    }

    fun Channel(newChannel : Int) {
        if(newChannel >= 0)
            currentChannel = newChannel
    }

    fun mute() {
        currentVolume = 0
    }

}

fun main(args: Array<String>){
    var tv = Television("LG", 0, 0, true)

    tv.Channel(30)
    tv.volumeUp(25)
    tv.mute()
}