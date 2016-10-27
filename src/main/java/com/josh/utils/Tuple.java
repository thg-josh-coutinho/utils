package com.josh.utils;

public class Tuple<T, U> {
  public final T _1;
  public final U _2;
  public Tuple(T arg1, U arg2) {
    super();
    this._1 = arg1;
    this._2 = arg2;
  }

    @Override
    public boolean equals(Object o)
    {
	if(!(o instanceof Tuple)) { return false; }

	Tuple<T, U> to = (Tuple<T, U>)o;

	return to._1.equals(_1) && to._2.equals(_2);
    }

    @Override
    public int hashCode() { return _1.hashCode() + _2.hashCode();  }

  @Override
  public String toString() {
    return String.format("(%s, %s)", _1, _2);
  }
}
