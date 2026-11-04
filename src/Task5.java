import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Iterator<T> zippedIterator = new Iterator<>() {
            private boolean takeFromFirst = true;

            @Override
            public boolean hasNext() {
                return !takeFromFirst
                        || firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                T value = takeFromFirst ? firstIterator.next() : secondIterator.next();
                takeFromFirst = !takeFromFirst;
                return value;
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(
                zippedIterator,
                Spliterator.ORDERED
        );

        return StreamSupport.stream(spliterator, false)
                .onClose(first::close)
                .onClose(second::close);
    }
}
