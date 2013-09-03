#include "phonebook_MyConsole.h"

JNIEXPORT void JNICALL Java_phonebook_MyConsole_clearConsole (JNIEnv * env, jclass obj)
{
	system("clear");
}

