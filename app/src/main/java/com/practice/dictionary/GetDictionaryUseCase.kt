package com.practice.dictionary

class GetDictionaryUseCase {

    fun getWord(dict_list: List<Dictionary>): String {
        val dict = dict_list[0]
        var definitions = dict.word + "\n"
        val meanings = dict.meanings
        for (meaning in meanings) {
            for (definition in meaning.definitions) {
                definitions += "定義：" + definition.definition + "\n"
                if (definition.example != null) {
                    definitions += "範例：" + definition.example + "\n"
                }
            }
        }
        return definitions
    }
}