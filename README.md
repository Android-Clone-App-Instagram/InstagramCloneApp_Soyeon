## RecyclerView Layout
#### 1. itemDecoration
   ListView에서는 
   <ListView
                  .
                  .
      android:divider="@android:color/black"
      android:dividerHeight="4dp" />
   와 같이 구분선을 제공한다.
   
   RecyclerView에서는 이러한 구분선을 제공하지 않으므로 이를 위해 ItemDecoration을 사용해야한다.
   
   간단하게는
   val decoration = DividerItemDecoration(applicationContext, VERTICAL)
   rv_home.addItemDecoration(decoration)
   과 같이 기본 구분선을 적용할 수 있다. (본 예제는 MyDivideLined에 Custom하는 방법을 적용하였다.)
   

#### 2. clipToPadding
   RecyclerView에 layoutPadding을 주는 경우 지정한  RecyclerView의 영역 내에서 padding 값을 적용하여 스크롤이 짧아진다.
   RecyclerView와 같은 listView의 바로 전후에 다른 아이템이 배치되는 경우 영역이 가려질 수 있는데 
   이러한 경우  RecyclerView 영역 바깥에 padding을 문제를 해결할 수 있다.
   
   마지막 부분에 padding을 주는 경우 false 값을 적용한다. (default는 true)
   <androidx.recyclerview.widget.RecyclerView
                          .
                          .
        android:clipToPadding="false"
        android:paddingBottom="50dp" />
 
