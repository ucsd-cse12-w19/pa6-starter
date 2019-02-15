package cse12pa6student;

import java.util.List;

public interface DefaultMap<K, V> {
	/*
	 * Sets key to hold value:
	 * - If key is not present, adds it (size increases)
	 * - If key is present, updates it (size doesn't increase)
	 * 
	 * Throws IllegalArgumentException if key is null (there is no such restriction
	 * for value)
	 * 
	 */
	void set(K key, V value);

	/*
	 * Returns the value associated with key if it has been set
	 *
	 * If the defaultValue is null and the key is not found, throws
	 * NoSuchElementException
	 * 
	 * If key is not found and defaultValue is non-null, returns the defaultValue
	 * 
	 * Throws IllegalArgumentException if key is null
	 */
	V get(K key);
	
	/*
	 * Returns true if the given key was set by set, false otherwise
	 * Throws IllegalArgumentException if key is null
	 */
	boolean containsKey(K key);

	/*
	 * Returns the number of key/value pairs
	 */
	int size();

	/*
	 * Returns the default value for this map
	 */
	V defaultValue();

	/*
	 * Returns a list of all keys in any order
	 */
	List<K> keys();

	/*
	 * Returns a list of all values in any order 
	 */
	List<V> values();

}
