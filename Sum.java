class Sum{
	static int sum(int ...arr){
		int res=0;
		for(int i:arr){
			res+=i;
		}
return res;
	}
	public static void main(String args[]){
		int k=sum(4,5,67,6);
		System.out.println(k);
}}