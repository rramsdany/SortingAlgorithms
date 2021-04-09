public class IntegerDataType extends GenericItemType {

    private int privateValue;

    public IntegerDataType(){
        privateValue = 0;
    }

    public IntegerDataType(int privateValue){
        this.privateValue = privateValue;
    }

    public IntegerDataType(IntegerDataType i){
        privateValue = i.privateValue;
    }

    public void set(int privateValue){
        this.privateValue = privateValue;
    }

    public int get(){
        return privateValue;
    }

    public String toString(){
        return "" + privateValue;
    }

    @Override
    public boolean isLess(GenericItemType git) {
        return (privateValue < ((IntegerDataType) git).get());
    }

    @Override
    public boolean isEqual(GenericItemType git) {
        return (privateValue == ((IntegerDataType) git).get());
    }

    @Override
    public boolean isGreater(GenericItemType git) {
        return (privateValue > ((IntegerDataType) git).get());
    }
}
