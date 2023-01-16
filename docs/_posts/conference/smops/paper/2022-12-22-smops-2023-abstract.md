---
layout: page
title: "Abstract - SMOPS 2023 "
categories: research-smops-23
excerpt : "Garuda Swarm"
tags: [ research-smops-23 ]
date: 2022-10-23T00:00:00-00:00
---


Abstract 

Our motivation is to increase the habitable days for explorers/crew in extraterrestrial environments.
Our idea sparked with the necessity to preserve houseplants without maintenance and we are
inspired by Honeybee exploring a tilted window for navigation. We propose a Swarm robotics
platform - Garuda to maintain a greenhouse in an extraterrestrial Habitat - Bhoomi.

We propose a novel replication algorithm for exploration and mapping of the habitat. From the
Swarm drones, replica's are created at intersection to solve sub-problems and the drones return to
the start point/ way point if goal is not reached. Information is stored in graph nodes and the
replicated data is updated in individual drones on reaching the waypoint. Memory access is global
read for instances and local write on reaching the waypoint. The graph is updated globally with
delta information when an instance reaches the waypoint. We propose to test the Hypothesis to
solve a Maze and to interpret the efficiency of the algorithm compared to other SLAM methods.

Vision sensors are used for monitoring and maintenance of greenhouse in the habitat. The device
inputs side and top view images to the computer vision module and results are reported to Habitat
controller. The functional parameters reported are live count of leaves, disease detection, growth
measurement and soil moisture values.

Resource utilization for dietary requirements is provided by Bhoomi Habitat controller. Based on
the number of Habitants, food sources are replenished with Garuda(UAV drone) carrying out a.
Sowing of seeds, b. Spraying fertilizers c. water irrigation through a sprayer module attached to
drones in the swarm. Human intervention is required for the harvest cycle, which we propose to
handle with a Humanoid (Gaganyatri) as future scope.

This work shows the pipeline integrating the computer vision module, Replication method for
navigation and the resource utilization module into the UAV swarm for Autonomous maintenance
of Greenhouse.
