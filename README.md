## RecyclerView Layout
#### 1. itemDecoration
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
 
