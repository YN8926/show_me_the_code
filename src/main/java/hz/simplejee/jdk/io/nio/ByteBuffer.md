# 缺点
1.ByteBuffer长度固定,一旦分配完成,其容量不能动态扩展和收缩;
2.ByteBuffer只有一个标识位置的指针position,读写的时候需要手工flip和rewind;
3.ByteBuffer的API功能有限,一些高级和实用特性它不支持;