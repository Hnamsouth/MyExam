package EX1;

public class Complex {
    private double rp,imp ;

    public static Complex cplx;


//   default constructor
    public Complex(){
        this.rp=0;this.imp=0;
    }
//  constructor 2 params
    public Complex(double rp, double imp) {
        this.rp = rp;
        this.imp = imp;
    }
//  getter & setter
    public double getRP() {
        return rp;
    }
    public void setRP(double realPart) {
        this.rp = realPart;
    }
    public double getIMP() {
        return imp;
    }
    public void setIMP(double imaginaryPart) {
        this.imp = imaginaryPart;
    }
//  add
    public Complex addComplex(Complex cpl2){
        return new Complex(getRP() + cpl2.getRP(),getIMP() + cpl2.getIMP());
    }
//    subtract
    public Complex subtractComplex(Complex cpl2){
        return new Complex(getRP() - cpl2.getRP(),getIMP() - cpl2.getIMP());
    }
//    multiply
    public Complex multiplyComplex(Complex cpl2){
        return new Complex((
                getRP()*cpl2.getRP() - getIMP()*cpl2.getIMP()),
                getRP()*cpl2.getIMP() - getIMP()*cpl2.getRP()
        );
    }
//    divide
    public Complex divideComplex(Complex cpl2){
        if(cpl2.getRP()==0 && cpl2.getIMP()==0){ return null ; }
        return new Complex(
                (getRP()*cpl2.getRP()+getIMP()* cpl2.getIMP()) / (cpl2.getRP()*cpl2.getRP() + cpl2.getIMP()*cpl2.getIMP()),
                (cpl2.getRP()*getIMP() - getRP()*cpl2.getIMP()) / (cpl2.getRP()*cpl2.getRP() + cpl2.getIMP()*cpl2.getIMP())
        );
    }
    public String toString(){
        String st= getIMP() < 0 ? " - " : " + " ; return "Complex is: "+getRP() + st + Math.abs(getIMP()) + "i";
    }


}
