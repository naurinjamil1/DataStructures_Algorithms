package main.java;

public class HashMap<K, V> {
	
	// an ARRAY of LinkedList
	
	int capacity;
	private Entry<K,V>[] buckets;
	
	public HashMap(int capacity){
		capacity = capacity;
		buckets = new Entry[this.capacity];		
	}
	// each node in this LinkedList
	public static Entry{
		  final K key;
	      V value;
	      Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K,V> next) {
			key = key;
			value = value;
			next = next;
		}
		public V getValue() {
			return value;
		}
		public getKey() {
			return key;
		}
		public getNext() {
			return next;
		}
		@Override
        public boolean equals(Object obj) {
            if (obj == this) return true;

            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;

                return key.equals(entry.getKey()) &&
                        value.equals(entry.getValue());
            }
            return false;
        }

        @Override
        public int hashCode() {
            int hash = 13;
            hash = 17 * hash + ((key == null) ? 0 : key.hashCode());
            hash = 17 * hash + ((value == null) ? 0 : value.hashCode());
            return hash;
        }

        @Override
        public String toString() {
            return "{" + key + ", " + value + "}";
        }
		
	}
	
	public void put(K key, V value) {
		if(size == lf*capacity) {
			// rehashing#
			Entry<K,V>[] oldBuckets = buckets;
			
			capacity = capacity * 2;
			buckets = new Entry[capacity];
			
			for(Entry<K,V> entry : oldBuckets) {
				while(entry != null) {
					buckets.put(entry.key, entry.value);
					entry = entry.next;
				}
			}		
		}
		int bucket = getHash(key) % getBucketSize();
		Entry<K,V> newEntry = new Entry(key, value, null);
		Entry<K,V> existingEntry = buckets[bucket];
		
		if(existingEntry == null) {
			// bucket is EMPTY
			buckets[bucket] = newEntry;
			size ++;
		}else {
			// compare the keys and check if key already exists then Overwrite
			while(existingEntry.key != null) {
				if(existingEntry.key == key) {
					existingEntry.value = value;
					return;
				}
				existingEntry = existingEntry.next;				
			}
			if(existingEntry.key.equals(key)) {
				existingEntry.value = value;
			} else {
				existingEntry.next = newEntry;
				size++;
			}
		}
	}
	
	public V get(Key key) {
		Entry<K,V> bucket = buckets[getHash(key) % getBucketSize()];
		
		while(bucket != null) {
			if(key == bucket.key) {
				return bucket.value;
			}
			bucket = bucket.next;
		}
		return null;
	}
	
	public int getHash(K key) {
		return key == null ? 0 : Math.abs(key.hashCode());
	}
	public int getBucketSize() {
		return buckets.length();
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : buckets) {
            sb.append("[");
            while (entry != null) {
                sb.append(entry);
                if (entry.next != null) {
                    sb.append(", ");
                }
                entry = entry.next;
            }
            sb.append("]");
        }
        return "{" + sb.toString() + "}";
    }
}
