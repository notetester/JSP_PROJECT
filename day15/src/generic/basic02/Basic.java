package generic.basic02;

public class Basic<K,V> {
	//멀티제네릭
	private K key;
	private V value;
	public void put(K key,V value) { //set 메서드
		this.key = key;
		this.value = value;
	}
	public V get(K key) {
		return value;
	}
	//toString 오버라이딩
	public String toString() {
		return "{"+key+"="+value+"}";
	}
}