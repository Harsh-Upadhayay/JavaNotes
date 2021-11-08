package AssignmentSolutions;

class Question_3 {
	public static void main(String args[]) {
		Sample obj_1 = new Sample(5.4f, 7.6f, 3);
		int ar[] = new int[3];
		ar[0] = 4;
		ar[1] = 6;
		ar[2] = 8;
		obj_1.setAr(ar);
		System.out.println(obj_1.getFirstFloat() +
				" " + obj_1.getSecondFloat() +
				" " + obj_1.getSize() + " " + obj_1.getAr());
		
		Sample obj_2 = new Sample(obj_1);
		System.out.println(obj_2.getFirstFloat() +
				" " + obj_2.getSecondFloat() +
				" " + obj_2.getSize() + " " + obj_2.getAr());
		
	}
}

class Sample {

	float firstFloat, secondFloat;
	int ar[], size;
	
	Sample(float firstFloat, float secondFloat, int size){
		this.firstFloat = firstFloat;
		this.secondFloat = secondFloat;
		this.size = size;
		this.ar = new int[size];
	}
	
	Sample(Sample oldObj) {
		this.firstFloat = oldObj.firstFloat;
		this.secondFloat = oldObj.secondFloat;
		this.size = oldObj.size;
		this.ar = new int[oldObj.size];
		for(int i = 0; i < size; i++)
			ar[i] = oldObj.ar[i];
	}
	
	float getFirstFloat() {
		return firstFloat;
	}

	void setFirstFloat(float firstFloat) {
		this.firstFloat = firstFloat;
	}

	float getSecondFloat() {
		return secondFloat;
	}

	void setSecondFloat(float secondFloat) {
		this.secondFloat = secondFloat;
	}

	public int[] getAr() {
		return ar;
	}

	public void setAr(int[] ar) {
		this.ar = ar;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}