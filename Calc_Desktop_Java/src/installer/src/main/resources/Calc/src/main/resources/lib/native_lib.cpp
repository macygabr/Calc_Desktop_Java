#include <jni.h>
#include "Model.h"
#include <string>
#include <sstream>
#include <iostream>
#include <string.h>

extern "C" {

s21::Model model;

JNIEXPORT jstring JNICALL Java_com_example_calc_NativeLib_Arithmetic(JNIEnv* env, jobject obj, jstring javaString1, jstring javaString2) {
    const char *nativeString1 = env->GetStringUTFChars(javaString1, NULL);
    std::string arg1 = nativeString1;
    env->ReleaseStringUTFChars(javaString1, nativeString1);

    const char *nativeString2 = env->GetStringUTFChars(javaString2, NULL);
    std::string arg2 = nativeString2;
    env->ReleaseStringUTFChars(javaString2, nativeString2);

    try {
        model.PolishNotation(arg1);
        double result = model.Arithmetic(arg2);
        std::string message = std::to_string(result);
        return env->NewStringUTF(message.c_str());
    } catch (const std::invalid_argument& oor) {
          return env->NewStringUTF(oor.what());
    }
}

JNIEXPORT double JNICALL Java_com_example_calc_NativeLib_Graph(JNIEnv* env, jobject obj, jstring javaString) {
        const char *nativeString = env->GetStringUTFChars(javaString, NULL);
        std::string arg = nativeString;
        env->ReleaseStringUTFChars(javaString, nativeString);

        try {
           return model.BuildGraf(arg);
        } catch (const std::invalid_argument& oor) {
              return 0.0;
        }
    }

 JNIEXPORT jboolean JNICALL Java_com_example_calc_NativeLib_Init(JNIEnv* env, jobject obj, jstring javaString) {
         const char *nativeString = env->GetStringUTFChars(javaString, NULL);
         std::string arg = nativeString;
         env->ReleaseStringUTFChars(javaString, nativeString);

         try {
            model.PolishNotation(arg);
         } catch (const std::invalid_argument& oor) {
               return false;
         }
         return true;
     }
}