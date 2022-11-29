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

| Name                                                                                                              | Dates            | Abstract Due        | Announcement/Final Paper                      | Status      |
|-------------------------------------------------------------------------------------------------------------------|------------------|---------------------|-----------------------------------------------|-------------|
| [SSEO 2023, Berlin](https://github.com/slabstech/bhoomi/blob/main/docs/assets/docs/abstract_sseo_slabs_india.pdf) | May 07-12, 2023  | 28 November 2022    | January 16, 2023, March 03, 2023,May 07, 2023 | Submitted   |
| [SMOPS 2023, Bengaluru](https://mangala.earth/research/smops-2023/)                                               | 8,9 June 2023    | 30 November 2022    | 15 December 2022                              | WIP         | 
| [IROS 2023, Detroit](https://ieee-iros.org/)                                                                      | 1-5 October 2023 | 15 Jan / 1 Mar 2023 | Jun 30 2023/ Jul 31 2023                      | -           | 
| [CASE 2023, Auckland , NZ](https://case2023.org/)                                                                 | 26-29 Aug 2023   | 1 March 2023        | 15 May 2023 / 15 June 2023                    | -           | 
| [ICRA 2024 Yokohama, Japan](https://www.ieee-ras.org/)                                                            | 13-18 May 2024   | -                   | -                                             | -           | 




<ul class="post-list">
{% for post in site.categories.research %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>
