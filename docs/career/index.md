---
layout: page
title: "Join Use"
excerpt: "For a rocket seat"
search_omit: true
---

Building amazing things, stories of which your grandchildren will listen in awe of the changes you brought to the world


<h4>Benefits for Open Source Researcher</h4>
<ul>
 <li>Author Registration costs only for Internation conference on Paper Acceptance (next IROS 2023)</li>

 <li>125 € for 40 hours per months on Open Source Research from S Labs Tech via GitHub Sponsors </li>

 <li>Upgrade skills for career growth and showcase best work on GitHub</li>

</ul >


* [Current Research](https://mangala.earth/research)

* Available positions

<ul class="post-list">
{% for post in site.categories.career %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>