import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Lists {
    public static void main(String[] args) {


        List<Float> lists = new ArrayList<>();
        lists.add(14.0F);
        lists.add(1.0F);
        calculate(Operation.PLUS, lists.get(0), lists.get(1));


    }



    private static float calculate(Operation operations, Float a, Float b) {
        float result = 0;
        switch (operations) {
            case PLUS:
                result = a + b;
                System.out.println(result);
                break;

        }
        return result;
    }

    private enum Operation implements List<Float> {
        PLUS('+'),
        MINUS('-'),
        DIVIDE('/'),
        MULTI('*'),
        MOD('%');

        char value;
        Operation(char value) {
            this.value = value;

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NotNull
        @Override
        public Iterator<Float> iterator() {
            return null;
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NotNull
        @Override
        public <T> T[] toArray(@NotNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Float aFloat) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends Float> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends Float> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Float get(int index) {
            return null;
        }

        @Override
        public Float set(int index, Float element) {
            return null;
        }

        @Override
        public void add(int index, Float element) {

        }

        @Override
        public Float remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @NotNull
        @Override
        public ListIterator<Float> listIterator() {
            return null;
        }

        @NotNull
        @Override
        public ListIterator<Float> listIterator(int index) {
            return null;
        }

        @NotNull
        @Override
        public List<Float> subList(int fromIndex, int toIndex) {
            return null;
        }
    }
}
