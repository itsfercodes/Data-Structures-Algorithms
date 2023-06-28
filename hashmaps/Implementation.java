package hashmaps;

import java.util.ArrayList;

// Does not include solution for collisions
public class Implementation {
  private Object[] bucket;
  private ArrayList<Object> keyList;

  public Implementation(int size) {
    this.bucket = new Object[size];
    this.keyList = new ArrayList<>();
  }

  private int hash(Object key) {
    int hash = 0;
    String convertedKey = key.toString();
    for (int i = 0; i < convertedKey.length(); i++) {
      hash = (hash + convertedKey.charAt(i) * i) % this.bucket.length;
    }
    return hash;
  }

  public void set(Object key, Object value) {
    this.bucket[this.hash(key)] = value;
    this.keyList.add(key);
  }

  public Object get(Object key) {
    return bucket[this.hash(key)];
  }

  public ArrayList<Object> keys() {
    return keyList;
  }

}
