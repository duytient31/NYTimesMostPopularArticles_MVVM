# NYTimesMostPopularArticles-MVVM

This repository contains a simple app to hit the NY Times Most Popular Articles API and show a list of articles, that shows details when items on the list are tapped (a typical master/detail app) that implements MVVM architecture using Dagger2, RxJava2, FastAndroidNetworking, LiveData, DataBinding and Navigation Component

<br>
<p align="center">
    <img src="page1.jpg" width="250"/>
    <img src="page2.jpg" width="250"/>
</p>
<br>
<br>

# Project Structure
<p align="center">
    <img src="screen1.png" width="250"/>
    <img src="screen2.png" width="250"/>
    <img src="screen3.png" width="250"/>
</p>
<br>
<p align="center">
    <img src="screen4.png" width="250"/>
    <img src="screen5.png" width="250"/>
</p>
<br>

#### The app has following packages:
1. **data**: It contains all the data accessing and manipulating components.
2. **di**: Dependency providing classes using Dagger2.
3. **ui**: View classes along with their corresponding Presenters.
4. **utils**: Utility classes.

#### Classes have been designed in such a way that it could be inherited and maximize the code reuse.

### Library reference resources:
1. RxJava2: https://github.com/ReactiveX/RxJava
2. RxAndroid: https://github.com/ReactiveX/RxAndroid
3. Dagger2: https://github.com/MindorksOpenSource/android-dagger2-example
4. FastAndroidNetworking: https://github.com/amitshekhariitbhu/Fast-Android-Networking
5. DataBinding: https://developer.android.com/topic/libraries/data-binding
6. Navigation Component: https://developer.android.com/guide/navigation/navigation-getting-started

### License
```
   Copyright (C) 2019 Amr Abdelhameed

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```