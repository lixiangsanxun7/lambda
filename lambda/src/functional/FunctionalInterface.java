package functional;

import java.util.function.*;

/**
 * 系统内置的函数式接口
 *
 * @author 86134
 */
public class FunctionalInterface {
    public static void main(String[] args) {
        /*系统内置的函数式接口

        全部在java.util.function. * 下

        常用的只有这几个：
              Predicate<T> 、Consumer<T> 、Function<T, R>、Supplier<T>



        Predicate<T> :参数T返回值boolean
            IntPredicate int ->boolean
            LongPredicate long ->boolean
            DoublePredicate double ->boolean


        Consumer<T> 参数T返回值void
            IntConsumer int ->void
            LongConsumer long ->void
            DoubI eConsumer double ->void

        Function<T, R> 参数T返回值R
            IntFunction<R> int ->R
            LongFunction<R> long ->R
            DoubleFunction<R> double ->R
            IntToLongFunction int ->long
            Int ToDoubleFunction int ->double
            LongToIntFunction long ->int
            LongToDoubleFunction long ->double
            DoubleToIntFunction doublt ->int
            DoubleToLongFunction double ->long


        Supplier<T> 参数无 返回值T
        UnaryOperator<T> :参数T 返回值T
        Binaryoperator<T>:参数T，T返回值T
        BiFunction<T, U，R > :参数T，U返回值R
        BiPredicate<T, U> 参数T，U返回值boolean
        BiConsumer<T, U> 参数T，U返回值void



        */



    }
}
