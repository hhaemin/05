//버블 정렬 (서로 인접한 두 원소를 검사하여 정렬하는 알고리즘 ) 

class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0;i<numArr.length-1;i++) {
			boolean changed = false;  //자리바꿈이 발생했는지를 체크 
			
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int temp = numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=temp;
					changed=true;
				}
			}
			if(!changed) break;  //자리바꿈이 없으면 반복문을 벗어난다. 
			
			for(int k=0;k<numArr.length;k++)
				System.out.print(numArr[k]);
			System.out.println();
		}
	}
}

