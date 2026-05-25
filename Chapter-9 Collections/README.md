## Chapter 9 — Collections

### What I learned

**ArrayList**
- Ordered list that grows automatically — no need to define size upfront
- `add()` — adds an item to the list
- `remove()` — removes an item by index or value
- `get()` — accesses an item by index
- `size()` — returns total number of items
- `contains()` — checks if an item exists in the list
- Storing custom objects in ArrayList — using your own classes as list items

**HashMap**
- Stores data as key-value pairs — like a dictionary
- `put()` — adds a key-value pair
- `get()` — retrieves value using the key
- `containsKey()` — checks if a key exists
- `remove()` — removes a key-value pair
- `keySet()` — gets all keys in the map

**HashSet**
- Stores unique values only — no duplicates allowed
- `add()` — adds an item to the set
- `remove()` — removes an item
- `contains()` — checks if an item exists
- `size()` — returns total number of items
- Order is not guaranteed — items are not stored in insertion order

### Key concepts
- ArrayList maintains insertion order — items stay in the order you added them
- HashMap does not maintain order — focus is on fast lookup by key
- HashSet automatically removes duplicates — useful for storing unique values
- All three are part of `java.util` package — must be imported
- ArrayList vs HashSet — use ArrayList when order matters, HashSet when uniqueness matters
