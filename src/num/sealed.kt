package num

sealed class SuCommand {
    object A : SuCommand()
    object B : SuCommand()
    object C : SuCommand()
    object D : SuCommand()
}

fun exec(suCommand: SuCommand) {
    when (suCommand) {
        SuCommand.A -> {

        }
        SuCommand.B -> {

        }
    }
}

fun main(args: Array<String>) {
    exec(SuCommand.A)
}
