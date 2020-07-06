### LithoInAppBarSample

#### Issue
Something wrong when use [LithoView](https://github.com/facebook/litho) in AppBarLayout.

#### [Fix](https://github.com/Tobyyyyyyyyyy/LithoInAppBarSample/blob/master/app/src/main/java/com/example/wt/lithoinappbarsample/MyLithoView.kt#L38)

Block notify when appbar in layout what make mLithoView.getLocalVisibleRect get error rect
