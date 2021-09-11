# Unsplash Grid

## :scroll: Description

This application displays a grid of [Unsplash](https://unsplash.com) images retrieved from a REST API. It's built following Android
best practices.

#### Used architecture:

Model-view-viewmodel (MVVM)

## App layers:

* **Presentation:** using [Jetpack Compose](https://developer.android.com/jetpack/compose).
* **DI:** using [Dagger Hilt](https://dagger.dev/hilt).
* **Domain:** using [Retrofit](https://square.github.io/retrofit) to handle the API calls and Retrofit-Gson for serialization and
  deserialization.
* **Data:** mapping data from the API and implementing ImageRepository.

### Used tech/tools:

* UI: Jetpack Compose.
* [Compose Coil](https://coil-kt.github.io/coil/compose) for managing the asynchronous image request and handling UI changes in the following UI states:
* loading with placeholder retrieved from drawable.
* error message in case of server connection failure.
* success showing images.
* Dependency injection: Dagger Hilt.
* Android architecture components (Lifecycle, ViewModel).
* Kotlin Flows and Coroutines.
* Network: Retrofit and Gson.

## :camera_flash: Screenshots

<img src="/result/successful.png" width="260">&emsp;<img src="/result/dark.png" width="260">

<img src="/result/loading_screenshot.png" width="260">&emsp;<img src="/result/image_loading.png" width="260">&emsp;<img src="/result/error.png" width="260">


### API link:
[Picsum](https://picsum.photos)

``` BASE_URL = https://picsum.photos ```

## License

```
Copyright 2020 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


