
public class MyArrayList<E>  {

private Object[] array;
public static final int DEF_SIZE = 20;
private int size = 0;

public MyArrayList(){
	
	array = new Object[DEF_SIZE];

}


public MyArrayList(int size){
    array = new Object[size];
}

public void add(E element){
    checkSize();
    array[size++] = element;
}

public E remove(int index){
    if(index>=size || index < 0 ){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    array[index] = null;
    --size;
    compress();
    return element;
}

public E get(int index){
    if(index > size){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    return element;
}

public void set(int index,E value){
    //if(index > size){throw new RuntimeException("Invalid index");}
    //E element = (E) array[index];
	array[index] = value;
//	return element;
}


private void checkSize(){
    if(size < array.length){ 
    	return;
    }
    resize();
}

public int getSize(){
    return this.size;
}



private void resize(){
    Object[] temp = new Object[array.length*2];
    copy(array,temp);
    array = temp;
}

private void copy(Object[] src, Object[] dest){
    if(dest.length< src.length){throw new RuntimeException(src+ " cannot be copied into "+dest);}
    for(int i=0;i<src.length; i++){
        dest[i] = src[i];
    }
}

private void compress(){
    int skipCount = 0;
    for(int i=0;i < size && i<array.length; i++){
        if(array[i]==null){
            ++skipCount;                
        }
        array[i]=array[i+skipCount];
    }
}

public static void main(String[] args) {
	MyArrayList<Integer> arr =  new MyArrayList<Integer>();
	arr.add(28);
	arr.add(17);
	arr.add(87);
	arr.add(44);
	arr.add(66);
	arr.remove(1);
	
	System.out.println("MYArrayList: ");
	
	for(int i = 0;i < arr.getSize(); i++) {
		System.out.println(arr.get(i));
	}
	
	
	System.out.println("Sorting MyArrayList....\n After Sorting... ");
	CustomUtil.CustomSort(arr);

	for(int i = 0;i < arr.getSize(); i++) {
		System.out.println(arr.get(i));
	}
	
	}

}