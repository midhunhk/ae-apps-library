# libAeApps
[![Build Status](https://travis-ci.org/midhunhk/ae-apps-library.svg?branch=fig)](https://travis-ci.org/midhunhk/ae-apps-library) 
[![Download](https://api.bintray.com/packages/midhunhk/android-libraries/lib-ae-apps/images/download.svg) ](https://bintray.com/midhunhk/android-libraries/lib-ae-apps/_latestVersion)
[![GitHub commits](https://img.shields.io/github/commits-since/midhunhk/ae-apps-library/v2.0.0.svg)](https://github.com/midhunhk/ae-apps-library) 
[![Issues](https://img.shields.io/github/issues/midhunhk/ae-apps-library.svg)](https://github.com/midhunhk/ae-apps-library/issues) 

This Android library project contains some reusable code that can be used across projects. Depending on the features you use, make sure to declare the permissions in your manifest.xml file. Whenever I come across any piece of code that seems reusable, it will be moved to this library project.

# Library Name
The library name represents **Artistik Expressionz** since all my apps follow the package structure "com.ae.apps.[appname]". It is short and all my design works come under same name.

The library [codenames](https://github.com/midhunhk/ae-apps-library/wiki/Codenames) are based on fruits, mostly berries. The latest release code name is **Fig**.

Ficus carica is an Asian species of flowering plants in the mulberry family, known as the common fig (or just the fig). It is the source of the fruit also called the fig, and as such is an important crop in those areas where it is grown commercially. Native to the Middle East and western Asia, it has been sought out and cultivated since ancient times, and is now widely grown throughout the world, both for its fruit and as an ornamental plant.

# Contents
The following components are available as part of this library as of now.

* Activities
  * Base Activity for Donations (Google Play In-App Billing v3)
  * Base Activity for ToolbarActivity
* Database  
  * DataBaseHelper
  * CopiedDataBaseHelper for using a database file from app's assets folder
* Managers  
  * Contact Manager for accessing Android's Contacts API
  * SMS Manager for accessing Android's SMS API  
* Utility Components
  * SimpleGraphView draws a pie chart
  * RoundedImageView shows an image inside a Circle
  * Mock Contact Data
  * EmptyRecyclerView provides a way to specify an empty layout

# Implementations
Presently the following android app projects make use of this library.

* <a href="https://github.com/midhunhk/message-counter">Message Counter</a>
* <a href="https://github.com/midhunhk/random-contact">Random Contact</a>
* <a href="https://github.com/midhunhk/trip-o-meter">Trip 'O Meter</a>

# Changelog
To see the history of changes, see [Changelog](https://github.com/midhunhk/ae-apps-library/blob/master/VersionHistory.md)

# Using
1. Include the library as a maven repository.

`
repositories {
    maven {
        url  "http://dl.bintray.com/midhunhk/android-libraries" 
    }
}
`

2. Add as a compile time dependency
`compile 'com.ae.apps:lib-ae-apps:2.0.5'`

# License
Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
  
 http://www.apache.org/licenses/LICENSE-2.0
  
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
