public class MotorolaTestsApp {
    public static void main(String[] args) {

        System.out.println(getBeautifulArrays(new int[]{1,2,3,4,5}, 2));
    }

    static String getDNAFrom(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString()
                .replaceAll("A", "c")
                .replaceAll("C", "a")
                .replaceAll("G", "t")
                .replaceAll("T", "g")

                .replaceAll("a", "A")
                .replaceAll("c", "C")
                .replaceAll("g", "G")
                .replaceAll("t", "T");
    }

    static int getBeautifulArrays(int[] a, int m){
        int result=0;
        for(int start=0; start<a.length; start++){
            for(int end=start; end<a.length; end++){
                if(end-start<m-1){
                    continue;
                }
                int odd_count=0;
                for(int i=start; i<=end; i++){
                    if(a[i]%2!=0){
                        odd_count++;
                        if(odd_count>m){
                            break;
                        }
                    }
                }
                if(odd_count==2){
                    result++;
                }
            }
        }

        return result;
    }
}
