package Exejavabasics.nullability;

public class DataValidator {
    public boolean isNotNull(Integer numeratore, Integer denominatore){
        if (numeratore != null && denominatore != null){
            return true;
        }
        return false;
    }

}
