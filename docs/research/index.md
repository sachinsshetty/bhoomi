---
layout: page
title: "Research"
excerpt: "Prepare to Finish"
search_omit: true
---

* Conference
  * [SSEO 2023, Berlin](https://iaaspace.org/event/14th-iaa-symposium-on-small-satellites-for-earth-observation-2023/)

<ul class="post-list">
{% for post in site.categories.research %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>
