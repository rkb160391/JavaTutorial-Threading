package topic.threading.synchronization;

class Table {
	synchronized void printTableWithSynchronization(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	void printTableWithoutSynchronization(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
	void printTableWithSynchronizeBlock(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
	
	 synchronized static void printTableWithStaticBlock(int n) {
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   }  
		 }  
	 static void printTableClassLock(int n) {  
		    synchronized (Table.class) {       // Synchronized block on class A  
		        // ...
		    	 for(int i=1;i<=10;i++){  
				     System.out.println(n*i);  
				     try{  
				       Thread.sleep(400);  
				     }catch(Exception e){}  
				   }  
		    }  
		} 
}