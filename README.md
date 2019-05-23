Skeleton project to make quick API experiments

The project is organized the following way:
- `buildSrc/api`: the exposed API. This includes the public plugin that users would apply.
- `buildSrc/core-plugin`: the implementation plugin. Depends on `api`.
- `buildSrc/third-party-plugin`: a 3rd party plugin, depends on `api` and uses the api.
- main project contains just a build file that applies the public plugin and the 3rd party one.
