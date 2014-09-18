/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author mdufek1
 */
public class TipCalculationService {
        private TipCalculator calculator;
                
    public TipCalculationService(TipCalculator calculator) {
        this.calculator = calculator;
    }

    public TipCalculationService() {
    }

    public void processTip(TipCalculator calculator){
        System.out.println(calculator.getCalculatedTip());
    }
}
