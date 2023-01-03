package com.emonics.retrofitwithcoroutine

data class Result(
    val _id: String,
    val author: String,
    val content: String,
    val tags: List<String>,
    val authorSlug: String,
    val length: Int,
    val dateAdded: String,
    val dateModified: String
)


/*

{
"_id":"JIk3cbQ8s",
"author":"Michael Jordan",
"content":"I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times, I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed.",
"tags":[
"sports",
"competition",
"famous-quotes"
],
"authorSlug":"michael-jordan",
"length":224,
"dateAdded":"2022-07-06",
"dateModified":"2022-07-08"
}

 */