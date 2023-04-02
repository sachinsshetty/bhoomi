---
layout: page
title: "Milestone"
excerpt: "To get work done"
search_omit: true
---

* Write a 1 page document, 
  * Your idea to implement the project
  * The direction you want the research to proceed
  * On what you'll do
    * This week
    * This month
    * Next 3 months
  * What you worked on previously

<ul class="post-list">
{% for post in site.categories.milestone %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>


* Milestone
  * Patent
    * Design Doc - 15/12/22
    * Prototype - 15/1/23
  * SMOPS
    * Code - 25/12/22
    * Full Paper - 31/12/22
    * Submit - 7/1/23
  * SSEO
    * Code - 31/1/23
    * Extended Abstract(4 pages) - 7/2/23
    * Full Paper (8 pages) - 21/2/23


