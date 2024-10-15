package demo3;/*
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

public class Subject {


    //观察者数组
    private List<Observer> vector = new LinkedList<>();


    //增加一个观察者
    public void addObserver(Observer observer) {

        vector.add(observer);
    }

    //删除一个观察者
    public void deleteObserver(Observer observer) {

        vector.remove(observer);
    }

    //通知所有观察者 TODO
    public void notifyAllObserver() {

        for(Observer observer : vector) {

            observer.notify();
        }
    }

    // 通知特定观察者 TODO
    public void notifyOneObserver(int i) {

        vector.get(i).notifyAll();
    }

}*/

/*
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.EventListener;

public class Subject {
    // PropertyChangeSupport 对象，用于管理属性变化监听器
    private PropertyChangeSupport support;

    public Subject() {
        // 初始化 PropertyChangeSupport 对象
        support = new PropertyChangeSupport(this);
    }

    // 添加一个属性变化监听器
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // 删除一个属性变化监听器
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    // 通知所有监听器属性变化
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        support.firePropertyChange(propertyName, oldValue, newValue);
    }

    // 示例：改变属性并通知监听器
    public void setProperty(String propertyName, Object newValue) {
        Object oldValue = null; // 这里简化处理，实际应用中应保存旧值
        firePropertyChange(propertyName, oldValue, newValue);
    }
}*/

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    // PropertyChangeSupport 对象，用于管理属性变化监听器
    private PropertyChangeSupport support;

    // 观察者列表，用于管理特定观察者
    private List<PropertyChangeListener> observers;

    public Subject() {
        // 初始化 PropertyChangeSupport 对象
        support = new PropertyChangeSupport(this);
        // 初始化观察者列表
        observers = new ArrayList<>();
    }

    // 添加一个属性变化监听器
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // 删除一个属性变化监听器
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    // 通知所有监听器属性变化
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        support.firePropertyChange(propertyName, oldValue, newValue);
    }

    // 添加特定观察者
    public void addSpecificObserver(PropertyChangeListener listener) {
        observers.add(listener);
    }

    // 删除特定观察者
    public void removeSpecificObserver(PropertyChangeListener listener) {
        observers.remove(listener);
    }

    // 通知特定观察者（通过索引）
    public void notifySpecificObserver(int index) {
        if (index >= 0 && index < observers.size()) {
            PropertyChangeListener listener = observers.get(index);
            // 这里需要提供属性名、旧值和新值，为了简化，我们假设这些值已知
            // 在实际应用中，你可能需要其他方式来获取这些值
            String propertyName = "exampleProperty";
            Object oldValue = null;
            Object newValue = "newValue";
            listener.propertyChange(new java.beans.PropertyChangeEvent(this, propertyName, oldValue, newValue));
        }
    }

    // 示例：改变属性并通知监听器
    public void setProperty(String propertyName, Object newValue) {
        Object oldValue = null; // 这里简化处理，实际应用中应保存旧值
        firePropertyChange(propertyName, oldValue, newValue);
    }
}