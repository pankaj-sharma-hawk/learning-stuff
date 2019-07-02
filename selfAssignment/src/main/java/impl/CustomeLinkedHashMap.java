package impl;

/**
 * Created by pankaj on 06,2019
 */
public class CustomeLinkedHashMap<K, V> {

  private int linkedHashMapSize;
  private CustomNode<K, V> table[];
  private CustomNode<K, V> previouslyInsertedNode;
  private CustomNode<K, V> headNode;

  public CustomeLinkedHashMap(int capacity) {
    this.linkedHashMapSize = capacity;
    table = new CustomNode[capacity];
    previouslyInsertedNode = null;
    headNode = null;
  }

  private CustomNode<K, V> getNewNode(K key, V value) {
    return new CustomNode<>(key, value, null);
  }

  public V put(K key, V value) {
    int hashIndex = hash(key);
    CustomNode<K, V> newNode = getNewNode(key, value);
    if (table[hashIndex] == null) {
      table[hashIndex] = newNode;
    } else {
      CustomNode<K, V> prev = table[hashIndex];
      CustomNode<K, V> curr = prev.next;
      while (curr != null) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = newNode;
    }
    if (previouslyInsertedNode == null) {
      headNode = previouslyInsertedNode = newNode;
    } else {
      newNode.previousNode = previouslyInsertedNode;
      previouslyInsertedNode.nextNode = newNode;
      previouslyInsertedNode = newNode;
    }
    return value;
  }

  public V get(K key) {
    int hashIndex = hash(key);
    if (table[hashIndex] == null) {
      return null;
    } else {
      CustomNode<K, V> currentNode = table[hashIndex];
      while (currentNode != null) {
        if (key.equals(currentNode.key)) {
          return currentNode.value;
        }
        currentNode = currentNode.next;
      }
      return null;

    }
  }

  private int hash(K key) {
    return (key == null ? 0 : key.hashCode()) % linkedHashMapSize;
  }

  public CustomNode getHeadNode() {
    return headNode;
  }

  final static class CustomNode<K, V> {

    final K key;
    V value;
    CustomNode<K, V> next;
    CustomNode<K, V> previousNode;
    CustomNode<K, V> nextNode;

    CustomNode(K key, V value, CustomNode<K, V> next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }

    CustomNode(K key, V value, CustomNode<K, V> next, CustomNode<K, V> previousNode,
        CustomNode<K, V> nextNode) {
      this.key = key;
      this.value = value;
      this.next = next;
      this.previousNode = previousNode;
      this.nextNode = nextNode;
    }
  }
}
