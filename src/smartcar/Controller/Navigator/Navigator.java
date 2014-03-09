package smartcar.Controller.Navigator;

import smartcar.Controller.SmartMap;
import smartcar.Event.SensorEvent;
import smartcar.Event.SensorListener;
import smartcar.Sensor.QRCode;
import smartcar.Sensor.QRCodeIf;
import smartcar.Sensor.SensorAcc;
import smartcar.Sensor.SensorAccIf;
import smartcar.Sensor.SensorGyro;
import smartcar.Sensor.SensorGyroIf;
import smartcar.Sensor.SensorHall;
import smartcar.Sensor.SensorHallIf;
import smartcar.Sensor.SensorMagnetic;
import smartcar.Sensor.SensorMagneticIf;
import smartcar.Sensor.SensorUltrasonic;
import smartcar.Sensor.SensorUltrasonicIf;

/**
 *
 * @author jack
 */
public class Navigator {
    SmartMap map;
    SensorHallIf sensorHall=new SensorHall();
    SensorAccIf sensorAcc=new SensorAcc();
    SensorUltrasonicIf sensorUltrasonic=new SensorUltrasonic();
    SensorGyroIf sensorGyro=new SensorGyro();
    SensorMagneticIf sensorMagnetic=new SensorMagnetic();
    QRCodeIf qRCode=new QRCode();
    /** 霍尔传感器事件处理函数*/
    SensorListener sensorHallListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    /** 加速度传感器处理函数*/
    SensorListener sensorAccListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    /** 陀螺仪传感器事件处理函数*/
    SensorListener sensorGyroListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    /** 磁场传感器事件处理函数*/
    SensorListener sensorMagneticListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    /** 二维码事件处理函数*/
    SensorListener QRCodeListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    /**超声波事件处理函数*/
    SensorListener sensorUltrasonicListener=new SensorListener() {

        @Override
        public void SensorEventProcess(SensorEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    /**
     * 
     * @param map 
     */
    public Navigator(SmartMap map){
        this.map = map;
        sensorHall.addSenserListener(sensorHallListener);
        sensorGyro.addSenserListener(sensorGyroListener);
        sensorAcc.addSenserListener(sensorAccListener);
        
    }
}
