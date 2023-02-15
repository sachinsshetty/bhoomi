---
layout: page
title: "SMOPS-2023 : Algorithm - Vision"
categories: research-smops-23
excerpt : "Garuda Swarm"
tags: [ research-smops-23 ]
date: 2022-10-23T00:00:00-00:00
---

Algorithm 

 <img loading="lazy" src="vision_arch.png" alt="Vision architecture" width="500" height="600"> 

This section outlines the architecture for the vision module that shall be integrated with the proposed system. The vision architecture shows how one drone explores the greenshouse given the challenges in the space infrastructure. This can be abstracted for multiple drones operating in a swarm fashion. This method is devised referring the design of University of Arizona's Controlled Environment Agriculture Center which has a length of 18 feet and a diameter of 3 inches. 

The inputs to the system are in the form of image stream from the drone and coordinates from the visual GPS. These components are mounted on the drone. The drone is programmed to move from (lat, long, 0) to (lat, long, height) as there are plant clusters grouped heightwise. The plant type is also mapped with their respective locations in the database. The drone can identify the plant type from the database mapping this with the input visual GPS from the image stream. However, it is also possible that the system can get duplicate frames between time-stamps. Thus, deduplication of frames is required to remove the images that resemble each other. This can also be used to remove the noisy/ blurred images that result from sudden movement changes by the drone. 

An object detection API is used for detecting individual leaves from the plant. Parameters are tracked to determine whether the plant follows the accurate growth pattern and whether it is diseased or not. These are then packaged as a JSON and sent back as a response to the central system. The ROIs are hence covered iteratively until the drone navigation algorithm terminates.



<table border=0 cellpadding=0 cellspacing=0 width=907 style='border-collapse:
 collapse;table-layout:fixed;width:681pt'>
 <col width=174 style='mso-width-source:userset;mso-width-alt:6363;width:131pt'>
 <col width=252 style='mso-width-source:userset;mso-width-alt:9216;width:189pt'>
 <col width=141 style='mso-width-source:userset;mso-width-alt:5156;width:106pt'>
 <col width=165 style='mso-width-source:userset;mso-width-alt:6034;width:124pt'>
 <col width=175 style='mso-width-source:userset;mso-width-alt:6400;width:131pt'>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6522227 width=174 style='height:15.0pt;width:131pt'>Test
  Scenarios<span style='mso-spacerun:yes'>�</span></td>
  <td class=xl6522227 width=252 style='border-left:none;width:189pt'>Test Cases</td>

  <td class=xl6522227 width=165 style='border-left:none;width:124pt'>Expected
  Result</td>
  <td class=xl6522227 width=175 style='border-left:none;width:131pt'>Actual
  Result</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>Correct
  input to API</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Image input with
  different format</td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Image stream
  input with frames in a fold<span style='display:none'>er</span></td>
  
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=40 style='height:30.0pt'>
  <td height=40 class=xl6622227 style='height:30.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6722227 width=252 style='border-top:none;border-left:none;
  width:189pt'>Coordinates associated with each frame in the form (lat, long,
  height)</td>
  
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Coordintes not
  present with a frame</td>

  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Incomplete
  coordinates of a frame</td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>Deduplication</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Repeated frame
  with complete overlap</td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Partial overlap
  between two frames</td>
  
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>No overlap
  between frames</td>

  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>ROI
  mapping</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Bounding box
  with four points defined f<span style='display:none'>or each type</span></td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>Frame
  detection</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Input Frame with
  no plant</td>
  
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Input Frame with
  multiple plants</td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Input Frame with
  zoomed in plant<span style='mso-spacerun:yes'>�</span></td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=20 style='height:15.0pt'>
  <td height=20 class=xl6622227 style='height:15.0pt;border-top:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>Input frame with
  two intertwined plants</td>
 
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <tr height=80 style='height:60.0pt'>
  <td height=80 class=xl6722227 width=174 style='height:60.0pt;border-top:none;
  width:131pt'>API Output<span style='mso-spacerun:yes'>�</span></td>
  <td class=xl6722227 width=252 style='border-top:none;border-left:none;
  width:189pt'>Capturing parameters {droneID, CameraID, Timestamp, LocationID,
  RegionID, <br>
    PlantGrowth, PlantID}</td>
  
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
  <td class=xl6622227 style='border-top:none;border-left:none'>&nbsp;</td>
 </tr>
 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=174 style='width:131pt'></td>
  <td width=252 style='width:189pt'></td>
  <td width=141 style='width:106pt'></td>
  <td width=165 style='width:124pt'></td>
  <td width=175 style='width:131pt'></td>
 </tr>
 <![endif]>
</table>