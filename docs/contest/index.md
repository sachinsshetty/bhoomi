---
layout: page
title: "S-Prize"
excerpt: "To Occupy Mars"
search_omit: true
---

### Occupy Mars Challenge  
* February - August 2023
* Monthly milestones and Awards

<ul class="post-list">
{% for post in site.categories.contest %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>


Inspired by [XPrize](https://www.xprize.org/home) 
