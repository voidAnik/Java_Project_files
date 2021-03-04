public class WeightedBox extends Box{
    double weight;
    WeightedBox(WeightedBox wBox)
    {
        super(wBox);
        weight=wBox.weight;
    }
    WeightedBox(double len,double m)
    {
        super(len);
        weight=m;
    }
    WeightedBox()
    {
        super();
        weight=-1;
    }
    WeightedBox(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
}
