package generics;

public class generic_implement_interface_jerry1<K,V> implements generic_interface_tom1<K,V> {
	private K key;
	private V value;
	
	public generic_implement_interface_jerry1(K key,V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public K getKey()
	{
		return key;
	}
	
	public V getValue()
	{
		return value;
	}
}
