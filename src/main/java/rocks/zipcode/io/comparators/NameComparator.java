package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
  public int compare(Item item1, Item item2) {
    return item1.getName().compareTo(item2.getName());
  }
}
