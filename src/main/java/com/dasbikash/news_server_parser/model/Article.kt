/*
 * Copyright 2019 www.dasbikash.org. All rights reserved.
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

package com.dasbikash.news_server_parser.model

import java.util.*
import javax.persistence.*


@Entity
@Table(name = DatabaseTableNames.ARTICLE_TABLE_NAME)
data class Article(
        @Id
        var id: String,

        @ManyToOne(targetEntity = Page::class, fetch = FetchType.LAZY)
        @JoinColumn(name = "pageId")
        var page: Page? = null,

        var title: String? = null,
        var modificationTS: Date? = null,
        var publicationTS: Date? = null,

        @Column(name = "articleText", columnDefinition = "text")
        var articleText: String? = null,

        @ElementCollection(targetClass = String::class)
        @CollectionTable(name = "image_links", joinColumns = [JoinColumn(name = "articleId")])
        @Column(name = "imageLink", columnDefinition = "text")

        var imageLinkList: Set<String> = HashSet(),

        @Column(columnDefinition = "text")
        var previewImageLink: String? = null
){
        @Transient
        fun isDownloaded():Boolean{
                return articleText != null
        }
}