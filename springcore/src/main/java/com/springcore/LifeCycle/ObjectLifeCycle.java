package com.springcore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


InitializingBean, DisposableBean -interfaces to init and destroy methods
public class ObjectLifeCycle implements InitializingBean, DisposableBean {
*/
public class ObjectLifeCycle{
private int Samosaprice;

public int getSamosaprice() {
	return Samosaprice;
}

public void setSamosaprice(int samosaprice) {
	Samosaprice = samosaprice;
}

public ObjectLifeCycle(int samosaprice) {
	super();
	Samosaprice = samosaprice;
}


public ObjectLifeCycle() {
	super();
}

@Override
public String toString() {
	return "ObjectLifeCycle [Samosaprice=" + Samosaprice + "]";
}
public void hey()
{
	System.out.println("inside init method: welcome, i am initializing");
}
public void bye()
{
	System.out.println("inside destroy method: bye, i am dying");
}
@PostConstruct
public void start()
{
	System.out.println("starting method ");
}
@PreDestroy
 public void end()
 {
	 System.out.println("ending");
 }
}
// when 2 things used init and intializing interface then first initializing then instancing then destroying.