/**
 Describes any class whose objects can be measured.
 */
public interface Measurable <E>
{
   /**
    Computes the measure of the object.
    @return the measure
    */
   double  getMeasure();
}
