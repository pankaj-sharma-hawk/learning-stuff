package impl;

/**
 * Created by pankaj on 06,2019
 */
public class CustomHashMap<K, V> {

  CustomEntry<K, V> table[];
  private int capacity = 4;

  public CustomHashMap() {
    table = new CustomEntry[capacity];
  }

  public V put(K key, V value) {
    if (key == null) {
      return putForNull(value);
    }

    int hash = hash(key);

    if (table[hash] == null) {
      table[hash] = getEntryNode(key, value);
    } else {
      CustomEntry<K, V> currentNode = table[hash];
      CustomEntry<K, V> previous = null;
      while (currentNode != null) {
        if (key.equals(currentNode.key)) {
          if (previous == null) {
            table[hash] = getEntryNode(key, value);
            return value;
          } else {
            CustomEntry newNode = getEntryNode(key, value);
            newNode.next = currentNode.next;
            previous.next = newNode;
          }
        } else {
          previous = currentNode;
          currentNode = currentNode.next;
        }
      }
      previous.next = getEntryNode(key, value);
    }
    return value;
  }

  public V get(K key) {
    int hash = hash(key);
    CustomEntry<K, V> currentNode = table[hash];
    if (currentNode == null) {
      return null;
    } else if (key == null || key.equals(currentNode.key)) {
      return currentNode.value;
    } else {
      while (currentNode != null) {
        if (currentNode.next != null) {
          if (currentNode.next.key.equals(key)) {
            return currentNode.next.value;
          }
        }
        currentNode = currentNode.next;
      }
    }
    return null;
  }

  private CustomEntry getEntryNode(K key, V value) {
    return new CustomEntry(key, value, null);
  }

  public int hash(K key) {
    return key == null ? 0 : Math.abs(key.hashCode()) % capacity;
  }

  private V putForNull(V value) {
    table[0] = getEntryNode(null, value);
    return value;
  }

  private static class CustomEntry<K, V> {

    final K key;
    V value;
    CustomEntry<K, V> next;

    public CustomEntry(K key, V value, CustomEntry<K, V> next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
}

