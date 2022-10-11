---
layout: page
title: "Research"
excerpt: "Prepare to Finish"
search_omit: true
---

<h4>Research Plan</h4>
<ul>
 <li>Design to work on Mars</li>
 <li>Prototype & Testing on Earth</li>
 <li>Minimum modifications using s/w configurations</li>
 <li>Setup & Maintenance of Greenhouse Lab</li>
 <li>Primary focus - Agriculture/Farming via Swarm Drone</li>
 <li>Greenhouse Specs a. Dome - Igloo / Hot b. Bauhaus Square Design c. Underground Connection</li>
 <li>Mining System Analysis</li>
 <li>Material for Connectors a. Water Supply b. Air Support c. Energy Transmission</li>
 <li>Single Bot Usage Design for Re-usability</li>
</ul >



* Conference
  * [SSEO 2023, Berlin](https://iaaspace.org/event/14th-iaa-symposium-on-small-satellites-for-earth-observation-2023/)

<ul class="post-list">
{% for post in site.categories.research %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>
