public class substring_brute {
    static int searchsub(String txt,String sub){
        int n=txt.length();
        int m=sub.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=sub.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String txt="Nandeesh";
        String sub="esh";
        System.out.println(searchsub(txt,sub));
    }
}
