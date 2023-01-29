---
layout: page
title: "SMOPS 2023 - Introduction"
categories: research
excerpt : "Garuda Swarm"
tags: [ research ]
date: 2023-01-30T00:00:00-00:00
---

Introduction

Our vision is to create Human outpost on Mars using Robots before sending Astronauts. 

Sustaining an outpost in extreme geographical conditions is an expensive logistics problem. 
Human intervention is required for major construction and maintenance of systems. The costs for human certified
transport systems is prohibitive for building an outpost on Mars.

Our design moves the human intervention from a physical on-site requirement a Robotics Human-In-Loop(HIL) system,
wherein Human operator tele-operates a robot whenever the Autonomous system needs intervention for complex task.

The system in Phase 1 consists of Greenhouse, Communication hub and Energy systems. Major investments have been
done in Communication and Energy sectors, our contribution would be to build a self-sustaining Greenhouse habitat,
which would fulfill dietary requirements for incoming astronauts.


3: Human Spaceflight Mission Operation Management
- Crew Life support system design

Garuda UAV Swarm in Bhoomi Habitat

Sachin Shetty(1),
Rohith Vaidya(2) ,
Sahana Shetty(3)

(1) S Labs Solutions, Kalghatgi, India, +91 7 7 9 5 1 1 3 8 0 9, info at slabstech dot com

(3) S Labs Solutions, Hubballi, India, +91 9 4 8 2 0 6 3 8 0 9, sahana at slabstech dot com

(2) S Labs Solutions, Bengaluru, India , +91 8 8 9 2 8 6 1 2 6 9, rohith at slabstech dot com

Keywords: Navigation, Resource Optimisation, Habitat Design, Pheno-typing


<ul class="post-list">
{% for post in site.categories.research-smops-23 %}
  <li><article><a href="{{ site.url }}{{ post.url }}">{{ post.title }} <span class="entry-date"><time datetime="{{ post.date | date_to_xmlschema }}">{{ post.date | date: "%B %d, %Y" }}</time></span>{% if post.excerpt %} <span class="excerpt">{{ post.excerpt | remove: '\[ ... \]' | remove: '\( ... \)' | markdownify | strip_html | strip_newlines | escape_once }}</span>{% endif %}</a></article></li>
{% endfor %}
</ul>