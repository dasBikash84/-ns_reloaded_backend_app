/*
 * Copyright 2019 das.bikash.dev@gmail.com. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dasbikash.news_server_parser.utils

import com.dasbikash.news_server_parser.bootstrap.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FileReaderUtilsTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }
    /*@Test
    fun testRead(){
       FileReaderUtils.jsonFileToEntityList("/language_data.json",Languages::class.java)
               .languages!!.asSequence().forEach {
           println(it)
       }
       FileReaderUtils.jsonFileToEntityList("/country_data.json",Countries::class.java)
               .countries!!.asSequence().forEach {
           println(it)
       }
       FileReaderUtils.jsonFileToEntityList("/newspaper_data.json",Newspapers::class.java)
               .newspapers!!.asSequence().forEach {
           println(it)
       }
       FileReaderUtils.jsonFileToEntityList("/page_data_full.json",Pages::class.java)
               .pages!!.asSequence().forEach {
           println(it)
       }
       FileReaderUtils.jsonFileToEntityList("/page_group_data.json",PageGroups::class.java)
               .pageGroups!!.asSequence().forEach {
           println(it)
       }
    }*/
}